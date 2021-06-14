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
lexer grammar InternalEclLexer;

@header {
package com.b2international.snomed.ecl.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

False : ('F'|'f')('A'|'a')('L'|'l')('S'|'s')('E'|'e');

True : ('T'|'t')('R'|'r')('U'|'u')('E'|'e');

RULE_TERM_STRING : '|' ~('|')* '|';

RULE_REVERSED : 'R';

RULE_TO : '..';

RULE_COMMA : ',';

RULE_CONJUNCTION : 'and';

RULE_DISJUNCTION : 'or';

RULE_EXCLUSION : 'minus';

RULE_ZERO : '0';

RULE_DIGIT_NONZERO : '1'..'9';

RULE_COLON : ':';

RULE_CURLY_OPEN : '{';

RULE_CURLY_CLOSE : '}';

RULE_ROUND_OPEN : '(';

RULE_ROUND_CLOSE : ')';

RULE_SQUARE_OPEN : '[';

RULE_SQUARE_CLOSE : ']';

RULE_PLUS : '+';

RULE_DASH : '-';

RULE_CARET : '^';

RULE_DOT : '.';

RULE_WILDCARD : '*';

RULE_EQUAL : '=';

fragment RULE_NOT_EQUAL : '!=';

RULE_LT : '<';

RULE_GT : '>';

RULE_DBL_LT : '<<';

RULE_DBL_GT : '>>';

RULE_LT_EM : '<!';

RULE_DBL_LT_EM : '<<!';

RULE_GT_EM : '>!';

RULE_DBL_GT_EM : '>>!';

fragment RULE_GTE : '>=';

fragment RULE_LTE : '<=';

RULE_HASH : '#';

RULE_DOUBLE_CURLY_OPEN : '{{';

RULE_DOUBLE_CURLY_CLOSE : '}}';

RULE_TERM_KEYWORD : 'term';

RULE_LANGUAGE_KEYWORD : 'language';

RULE_TYPEID_KEYWORD : 'typeId';

RULE_TYPE_KEYWORD : 'type';

RULE_DIALECTID_KEYWORD : 'dialectId';

RULE_DIALECT_KEYWORD : 'dialect';

RULE_ACTIVE_KEYWORD : 'active';

RULE_MODULEID_KEYWORD : 'moduleId';

RULE_PREFERRED_IN_KEYWORD : 'preferredIn';

RULE_ACCEPTABLE_IN_KEYWORD : 'acceptableIn';

RULE_LANGUAGE_REFSET_ID_KEYWORD : 'languageRefSetId';

RULE_CASE_SIGNIFICANCE_ID_KEYWORD : 'caseSignificanceId';

RULE_LEXICAL_SEARCH_TYPE : ('match'|'wild'|'regex'|'exact');

RULE_DOMAIN : ('Concept'|'Description');

RULE_NON_NUMERIC_OPERATOR : (RULE_EQUAL|RULE_NOT_EQUAL);

RULE_NUMERIC_OPERATOR : (RULE_EQUAL|RULE_NOT_EQUAL|RULE_GT|RULE_LT|RULE_GTE|RULE_LTE);

RULE_ALPHA : 'a'..'z';

RULE_WS : (' '|'\t'|'\n'|'\r');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');
