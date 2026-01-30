# Java Cucumber Selenium Automation Framework

This is a sample automation testing framework built using **Java, Maven, Selenium, Cucumber, and TestNG**.  
It demonstrates an end-to-end UI automation approach following **BDD (Behavior Driven Development)** principles.

---

## Tech Stack

### Java
- Used as the primary programming language
- Handles test scripts, step definitions, and core framework logic

### Maven
- Build and dependency management tool
- Manages project structure, dependencies (`pom.xml`), plugins, and test execution
- Ensures consistency across different environments

### Selenium
- Used for browser automation
- Performs actions such as clicking, typing, submitting forms, and UI validations
- Supports cross-browser testing

### Cucumber
- Enables BDD using **Gherkin syntax**
- Feature file is written as a **single end-to-end user flow**
- Covers:
  - User login
  - Product selection
  - Cart validation
  - Checkout process
- Validates the complete user journey within one continuous session

### TestNG
- Used as the test runner and assertion framework
- Manages:
  - Test execution lifecycle
  - Annotations
  - Parallel execution
  - Test grouping
  - Reporting

---

## Prerequisites
- Java (JDK 8 or above)
- Maven
- Any IDE (IntelliJ IDEA / Eclipse)
- Chrome browser (or configured browser)

---

## How to Run the Project
1. Set up an IDE on your local machine
2. Clone the repository:
   ```bash
   git clone https://github.com/shreyas-narasimhan/JavaCucumberSelenium.git
3. Run the project using the Runner class present in the runner file
4. The report will be present in the "cucumber-html-report" inside the target folder
