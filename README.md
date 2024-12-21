# Roman Numeral Converter

## Overview

Roman Numeral Converter is a lightweight Java library that provides simple and efficient conversion between Arabic (decimal) numbers and Roman numerals.

## Installation Methods

### 1. Manual JAR Installation

#### Download Options:
- Download the latest JAR from the [GitHub Releases page](https://github.com/dronecodes/romannumeralconverter/releases) (In Progress)
- Clone the repository and build the project locally

#### Adding to Your Project

##### For Maven Projects
Add the JAR to your project's dependencies:
```bash
mvn install:install-file \
   -Dfile=path/to/romannumeralconverter-1.0.0.jar \
   -DgroupId=io.github.dronecodes \
   -DartifactId=romannumeralconverter \
   -Dversion=1.0.0 \
   -Dpackaging=jar
```

##### For Gradle Projects
1. Create a `libs` folder in your project
2. Place the JAR in the `libs` folder
3. Add to your `build.gradle`:
```groovy
dependencies {
    implementation files('libs/romannumeralconverter-1.0.0.jar')
}
```

### 2. Build from Source

```bash
# Clone the repository
git clone https://github.com/DroneCodes/romannumeralconverter.git

# Navigate to the project directory
cd romannumeralconverter

# Build the project
mvn clean package

# The JAR will be in the target/ directory
```

## Usage Examples

```java
// Convert a number to Roman numerals
String romanNumeral = RomanNumeralConverter.toRoman(1984);
System.out.println(romanNumeral); // Outputs: MCMLXXXIV

// Convert Roman numerals to a number
int arabicNumber = RomanNumeralConverter.toArabic("MCMLXXXIV");
System.out.println(arabicNumber); // Outputs: 1984
```

## Requirements

- Java 17 or higher
- Maven or Gradle (for dependency management)

## Contributing

1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Push to the branch
5. Open a Pull Request

## License

Distributed under the MIT License.

## Contact

Project Link: [GitHub Repository](https://github.com/DroneCodes/romannumeralconverter)
