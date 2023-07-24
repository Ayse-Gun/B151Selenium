
**Fatih Gun**
# Qualitest Online Shopping Automation framework

**Selenium-Cucumber-Java**

This repository contains a collection of selenium-cucumber-java projects and libraries that show how to use the tool and develop automation scripts using the Cucumber BDD framework with Java. 

**Installation guide** 

This is a maven project. So it’s assumed that the host running this code have Java and maven installed and JAVA_HOME already set. Here is the guide for maven installation just in link : https://maven.apache.org/install.html Project get all dependencies from maven repository. So no additional installation needed. The tools are managed by adding dependencies' to pom.xml file which are for this framework and test.
JDK 1.8+ (make sure Java class path is set) Maven (make sure .m2 class path is set) IntelliJ/Eclipse IntelliJ/Eclipse Plugins for Maven Cucumber Git

**Framework set up Fork / Clone repository:** from here or download zip and set it up in your local workspace.

**Framework Overview**

The cucumber BDD testing framework specifies acceptance tests as written from the view of the Product Owner. Using keywords such as Given, When, Then and And, acceptance criteria tests known as feature files can then be broken down into testable steps. Cucumber Selenium framework runs by specifying the test cases using tags that are to be run. Cucumber Selenium - Overall test framework leveraging the Cucumber framework with Selenium written in JAVA.
POM is used as a design pattern. POM creates an object repository for storing all web elements. It helps reduce code duplication and improves test case maintenance. In Page Object Model, consider each web page of an application as a class file. Each class file will contain only corresponding web page elements. Using these elements, we can perform operations on the website under test.

**Structure:**

- **pom.xml:**  It is used to download and upload libraries and tools using dependencies and builds that you will need in the framework. Below are the dependencies are being used for this project :

Selenium Java:https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java

Github Bonigarcia(WebdriverManager): https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager

Cucumber Java: https://mvnrepository.com/artifact/io.cucumber/cucumber-java

Cucumber JUnit: https://mvnrepository.com/artifact/io.cucumber/cucumber-junit

Cucumber Reports plugins: https://plugins.jenkins.io/cucumber-reports/

- **configuration.properties:** This file is for storing and managing test data.

- **resources:** this directory is for storing features package which contains test scenarios 

  * OnlineShopping.feature: Created based on BDD by Gherkin syntax to write online shopping scenarios. More about Gherkin & Cucumber can be found at https://cucumber.io/docs/reference 

- **pages Package:** 
ShopPage and CartPage classes placed under the pages package to store related locators and methods based on the test steps. Both page classes inherit ReusableMethods class by using extend keyword

- **runner Package:**

    * TestRunner class: This class is for running this test script by using cucumber options which contains features package pathway, step definitions, plugins, dryRun and tags.

    * FailedTestRunner class: This class is for running failed scripts by using cucumber options which contains features package pathway, step definitions and plugins.

- **step_definitions Package:**
  
    * OnlineShoppingStepdesf class: This class for running our scenario and steps from OnlineShopping.feature file. I created reference type of ShopPage and CartPage class objects in order to call instance methods from this class.
  
    * Hook class: this class is for running before and after each and every scenario. I have added implicitly wait and maximize screen for UI test.
  
- **utilities Package:**
    * Driver class: it contains selenium webdriver which I initialised for chrome, firefox, ie, edge and safari drivers
  
    * ConfigurationReader class: this class is for reading data from configuration.properties file.
  
    * ReusableMethods class: in order to use static methods (avoiding repetitions).
  
**Run Some Sample Tests**

Open terminal (MAC OSX) or command prompt / power shell (for windows OS) and navigate to the project directory type mvn verify or mvn test command to run features. With this command, it will invoke the default Chrome browser and will execute the tests.

**Reporters**

Once you run your tests, the framework generates Cucumber, HTML, JSON and Surfire reports, and screenshots for your tests if you enable it and also generates error shots for your failed test cases as well.

**Cucumber HTML Report:**



**JSON Report:**



**XML Report:**
