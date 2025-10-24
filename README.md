## Project: BBC Sport Front-End Automation (Java + Cucumber + Selenium)

Process
1. pom.xml
2. Driver Factory (DriverFactory.java)
3. Feature 1 — Las Vegas Grand Prix Results (grandprix_results.feature)
4. GrandPrixSteps.java
5. Feature 2 — Search Results Validation
6. search_results.feature
7. SearchSteps.java
8. Test Runner (TestRunner.java)

   # BBC Sport Front-End Automation (Java + Selenium + Cucumber)

## Overview
Automated BDD tests to validate BBC Sport website functionality:
1. Verify top 3 finishers in the 2023 Las Vegas Grand Prix.
2. Validate that at least 4 search results are shown for "Sport in 2023".

## Tech Stack
- Java 11
- Selenium WebDriver
- Cucumber (BDD)
- Maven
- JUnit
- WebDriverManager

## How to Run
1. Clone the repository
2. Run:
   ```bash
   mvn clean test
View the HTML report in:

bash
Copy code
reports/cucumber-report.html

