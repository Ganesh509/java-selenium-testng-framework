# Java Selenium TestNG Automation Framework

A UI test automation framework built from scratch using **Java 17, Selenium WebDriver, TestNG, and Maven**, following the Page Object Model (POM) design pattern.

## 1. Project Overview

This project provides a foundation for automated web application testing. It uses Selenium WebDriver to interact with web pages, TestNG to organize and execute tests, and Maven to manage dependencies and build execution.

### Tech Stack

- **Programming Language:** Java 17
- **Automation Tool:** Selenium WebDriver
- **Test Framework:** TestNG
- **Build Tool:** Apache Maven 3.9.16
- **IDE:** Visual Studio Code
- **Browser:** Google Chrome
- **Design Pattern:** Page Object Model (POM)

## 2. Project Structure

```text
SDET-Framework/
├── pom.xml
├── testng.xml
├── README.md
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/sdet/
    │   │       ├── pages/
    │   │       │   └── HomePage.java
    │   │       └── utils/
    │   └── resources/
    │       └── config.properties
    └── test/
        ├── java/
        │   └── com/sdet/
        │       ├── base/
        │       │   └── BaseTest.java
        │       └── tests/
        │           └── SeleniumSmokeTest.java
        └── resources/
```

## 3. Framework Components

### BaseTest.java

Responsible for browser setup and teardown.

- Launches Chrome before each test method.
- Maximizes the browser window.
- Closes the browser after test execution.
- Provides a reusable WebDriver instance to test classes.

### HomePage.java

Implements the Page Object Model for the Selenium homepage.

- Stores page locators.
- Opens the Selenium homepage.
- Clicks the Downloads link.
- Retrieves the page title.

### SeleniumSmokeTest.java

Contains the smoke tests.

- Verifies the Selenium homepage title.
- Verifies navigation to the Downloads page.
- Uses TestNG assertions to validate expected results.

### pom.xml

Manages project dependencies and build configuration.

- Selenium Java dependency.
- TestNG dependency.
- Maven Compiler Plugin.
- Maven Surefire Plugin.

### testng.xml

Defines the TestNG suite and the test classes to execute.

## 4. Prerequisites

Install the following software:

- JDK 17
- Apache Maven 3.9.16 or compatible version
- Visual Studio Code
- Google Chrome

Verify your Java installation:

```bash
java -version
javac -version
```

Verify Maven:

```bash
mvn -version
```

## 5. Setup Instructions

### Step 1: Clone or open the project

Open the project folder in Visual Studio Code.

### Step 2: Download Maven dependencies

From the project root directory, run:

```bash
mvn clean
```

Maven will download the required dependencies when needed.

### Step 3: Execute the test suite

Run:

```bash
mvn clean test
```

Maven Surefire executes the TestNG suite configured in `testng.xml`.

## 6. Test Execution Flow

1. TestNG reads the configured suite.
2. `BaseTest` launches Chrome using `@BeforeMethod`.
3. The test creates a `HomePage` object.
4. Selenium performs the required browser actions.
5. TestNG assertions validate the results.
6. `@AfterMethod` closes the browser.
7. Maven reports the execution results.

## 7. Reports

After executing the tests, Maven Surefire generates test reports under:

```text
target/surefire-reports/
```

Review the generated reports to check passed, failed, and skipped tests.

## 8. Current Test Scenarios

| Test Scenario | Expected Result |
|---|---|
| Verify homepage title | Title contains `Selenium` |
| Verify Downloads navigation | Current URL contains `downloads` |

## 9. Future Enhancements

Planned improvements to make the framework more production-ready:

- External configuration using `config.properties`
- Reusable explicit waits
- Centralized WebDriver management
- Data-driven testing with TestNG `@DataProvider`
- TestNG groups and parallel execution
- Automatic screenshots on test failures
- Logging with SLF4J and a logging implementation
- HTML reporting
- Cross-browser execution
- Jenkins CI/CD integration
- Git-based version control

## 10. Troubleshooting

### ChromeDriver issues

Modern Selenium versions include Selenium Manager, which can automatically manage the browser driver. Ensure Chrome is installed and internet access is available if a driver needs to be downloaded.

### TestNG imports show errors in VS Code

- Confirm TestNG is declared in `pom.xml`.
- Ensure `BaseTest.java` is under `src/test/java` when TestNG uses test scope.
- Reload the Maven project or clean the Java language server workspace.

### CDP version warning

A Chrome DevTools Protocol warning can occur when the installed Chrome version is newer than the CDP versions supported by the selected Selenium release. Upgrade Selenium to a compatible version if DevTools functionality is required.

### Tests fail

Run the tests again with:

```bash
mvn clean test
```

Inspect the terminal output and the reports under `target/surefire-reports/`.

## 11. Author

Java Selenium TestNG automation framework — learning and development project.

---

**Note:** This README describes the current framework foundation. Features listed under Future Enhancements are planned and should not be considered implemented until they are added and verified.
