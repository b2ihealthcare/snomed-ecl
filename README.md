# snomed-ecl

SNOMED CT Expression Constraint Language Implementation with IDE integration(s), user interface using Xtext.

[![build status](https://img.shields.io/github/actions/workflow/status/b2ihealthcare/snomed-ecl/maven.yml?branch=main&style=flat-square)](https://github.com/b2ihealthcare/snomed-ecl/actions)
[![latest release](https://img.shields.io/github/tag/b2ihealthcare/snomed-ecl.svg?style=flat-square)](https://github.com/b2ihealthcare/snomed-ecl/releases/tag/v2.1.3)
[![GitHub](https://img.shields.io/github/license/b2ihealthcare/snomed-ecl.svg?style=flat-square)](https://github.com/b2ihealthcare/snomed-ecl/blob/main/LICENSE)

# Documentation

See the official documentation [here](http://snomed.org/ecl)

# Supported versions

* https://github.com/b2ihealthcare/snomed-ecl/releases/tag/v2.1.3 - ECL 2.1
* https://github.com/b2ihealthcare/snomed-ecl/releases/tag/v2.0.4 - ECL 2.0
* https://github.com/b2ihealthcare/snomed-ecl/releases/tag/v1.6.0 - ECL 1.6
* https://github.com/b2ihealthcare/snomed-ecl/releases/tag/v1.5.2 - ECL 1.5
* https://github.com/b2ihealthcare/snomed-ecl/releases/tag/v1.4.3 - ECL 1.4
* https://github.com/b2ihealthcare/snomed-ecl/releases/tag/v1.3.0 - ECL 1.3

# Building from source

SNOMED CT ECL uses Maven for its build system. In order to run the build and create a p2 update site and the maven packages simply run the following command in the cloned directory. 

    ./mvnw clean package

The packages can be found in the `com.b2international.snomed.ecl.update/target` folder, when the build is complete.

To run the test cases, use the following command:

    ./mvnw clean verify

# Contributing

Please see [CONTRIBUTING.md](CONTRIBUTING.md) for details.

# Versioning

Our [releases](https://github.com/b2ihealthcare/snomed-ecl/releases) use [semantic versioning](http://semver.org). You can find a chronologically ordered list of notable changes in [CHANGELOG.md](CHANGELOG.md).
