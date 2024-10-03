/*
 * Copyright 2021 B2i Healthcare, https://b2ihealthcare.com
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

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

import com.google.inject.Inject;

/**
 * @since 5.4
 */
public class EclValueConverterService extends DefaultTerminalConverters {

	@Inject
	private CardinalityMaxValueConverter maxValueConverter;
	
	@Inject
	private TermStringConverter termStringConverter;

	@Inject
	private RegularExpressionConverter regularExpressionConverter;
	
	@Inject
	private ActiveBooleanConverter activeBooleanConverter;
	
	@ValueConverter(rule = "MaxValue")
	public IValueConverter<Integer> MaxValue() {
		return maxValueConverter;
	}
	
	@ValueConverter(rule = "PIPE_DELIMITED_STRING")
	public IValueConverter<String> TermString() {
		return termStringConverter;
	}
	
	@ValueConverter(rule = "RegularExpression")
	public IValueConverter<String> RegularExpression() {
		return regularExpressionConverter;
	}
	
	@ValueConverter(rule = "ActiveBoolean")
	public IValueConverter<Boolean> ActiveBoolean() {
		return activeBooleanConverter;
	}
}
