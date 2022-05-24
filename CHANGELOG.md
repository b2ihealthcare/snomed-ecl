# Change Log
All notable changes to this project will be documented in this file.

## 2.0.4

- [ui] Fix keyword proposals in Eclipse UI proposal provider; add suggestions for history profiles; add an image to filter constraint domains

## 2.0.3

- [lang] include missing member short domain keyword (`m`) when parsing Identifier rule content to properly detect all supported IDs

## 2.0.2

- [validation] add missing error code to too short term value
- [validation] prevent NPE when a validation rule does not provide an error code

## 2.0.1

- [validation] support configuration of `ignoredSyntaxErrorCodes` via System property. An example to ignore SCTID errors: `-DignoredSyntaxErrorCodes=sctid.error`

## 2.0.0

- [lang] support the latest official [ECL 2.0.0](TODO link to the final spec) specification changes
  * Support history supplements
  * Support memberField filters
  * Support memberField selection
  * Minor non-breaking syntax changes
- [lang] support matching any kind of ID from the following alphabet (`a-zA-Z0-9-_`)

## 1.6.0

- [lang] support grammar constructs, property filters introduced in ECL 1.6 language specification (#6)

## 1.5.0
- [lang] support ECL specification [1.5.0](https://confluence.ihtsdotools.org/download/attachments/33493263/doc_ExpressionConstraintLanguage_v1.5-en-US_INT_20210215.pdf?api=v2) (#4)
  * Support official filter constraints, like `TermFilter`, `Language Filter`, `Description Type Filter`, `Dialect Filter`, `Acceptability Filter`
  * Support unofficial filter constraints (from [QL Draft](https://github.com/b2ihealthcare/snomed-ql)), like `Active Filter`, `PreferredIn Filter`, `AcceptableIn Filter`, `LanguageRefSet Filter`, `Module Filter`, `SemanticTag Filter`, `EffectiveTime Filter`, `CaseSignificance Filter`
  * Support nesting, conjunction and disjunction of filter constraints
- [ide] support semantic highlighting in Eclipse based IDEs and LSPs (#1)

## 1.4.0
- [lang] support `childOrSelfOf` and `parentOrSelfOf` operators, see [ECL 1.4](https://confluence.ihtsdotools.org/display/DOCECL/6.1+Simple+Expression+Constraints) (85c8c19, 10fa8fa)
- [releng] do not include all dependencies in update site zip (acf34d3)
- [dependencies] bump Eclipse Platform to 2020-09 (bb53f9f)
- [dependencies] bump Xtext/Xtend to 2.23.0 (bb53f9f)
- [build] add mvnw support (#2)

## 1.3.0
- [releng] initial release of 1.3.0 extracted from [snow-owl](https://github.com/b2ihealthcare/snow-owl)