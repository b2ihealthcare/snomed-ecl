/*
 * Copyright 2021 B2i Healthcare Pte Ltd, http://b2i.sg
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.b2international.snomed.ecl.ui;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Sets.newHashSet;

import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.util.Modules2;

import com.b2international.snomed.ecl.ui.internal.EclActivator;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

/**
 * @since 1.3.0
 */
public class EclUiPlugin extends EclActivator {
	
	public static EclUiPlugin getDefault() {
		return (EclUiPlugin) getInstance();
	}
	
	@Override
	protected Injector createInjector(String language) {
		try {
			com.google.inject.Module runtimeModule = getRuntimeModule(language);
			// additional core language bindings go here via extension point
			for (Module additionalRuntimeModule : getExtensions("com.b2international.snomed.ecl.ui.eclAdditionalModules", "class", Module.class)) {
				runtimeModule = Modules2.mixin(runtimeModule, additionalRuntimeModule);
			}
			
			com.google.inject.Module sharedStateModule = getSharedStateModule();
			com.google.inject.Module uiModule = getUiModule(language);
			com.google.inject.Module mergedModule = Modules2.mixin(runtimeModule, sharedStateModule, uiModule);
			return Guice.createInjector(mergedModule);
		} catch (Exception e) {
			throw new RuntimeException("Failed to create injector for " + language, e);
		}
	}
	
	private static final <T> Collection<T> getExtensions(final String extensionPoint, final String classAttributeName, final Class<T> type) {
		checkNotNull(extensionPoint, "extensionPoint");
		checkNotNull(classAttributeName, "classAttributeName");
		checkNotNull(type, "type");
		final Collection<T> extensions = newArrayList();
		final IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor(extensionPoint);
		for (final IConfigurationElement element : elements) {
			try {
				if (hasAttributeOf(element, classAttributeName)) {
					final Object object = checkNotNull(element, "element").createExecutableExtension(classAttributeName);
					extensions.add(type.cast(object));
				}
			} catch (final CoreException e) {
				throw new RuntimeException(String.format("Exception happened when creating element from %s bundle's extension: %s", element
						.getContributor().getName(), extensionPoint), e);
			}
		}
		return extensions;
	}
	
	/*Returns with true if the configuration element has the given attribute. Otherwise returns with false.*/
	private static boolean hasAttributeOf(final IConfigurationElement element, final String attributeName) {
		return newHashSet(element.getAttributeNames()).contains(attributeName);
	}
	
}
