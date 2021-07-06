# Change Log
All notable changes to this project will be documented in this file.

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