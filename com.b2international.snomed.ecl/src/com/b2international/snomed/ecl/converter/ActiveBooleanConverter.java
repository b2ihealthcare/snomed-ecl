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
package com.b2international.snomed.ecl.converter;

import java.util.Locale;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractValueConverter;
import org.eclipse.xtext.nodemodel.INode;

/**
 * @since 1.6
 */
public final class ActiveBooleanConverter extends AbstractValueConverter<Boolean> {

	@Override
	public Boolean toValue(String string, INode node) throws ValueConverterException {
		final String lowerCaseString = string.toLowerCase(Locale.ENGLISH);
		switch (lowerCaseString) {
			case "false": //$FALL-THROUGH$
			case "0": 
				return false;
			case "true": //$FALL-THROUGH$
			case "1": 
				return true;
			default: 
				throw new ValueConverterException("Invalid active boolean value '" + string + "'.", node, null);
		}
	}

	@Override
	public String toString(Boolean value) throws ValueConverterException {
		// Always use "true" or "false" literals when converting to String
		return value.toString();
	}
}
