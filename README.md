# learnwithme


Test Automation Framework
===================

Overview
-------------
This project contains a basic test automation framework designed for automated testing of "".

Prerequisities
-------------
* Java version 11.0
* Maven 3.9.5
* Chrome Driver (supports Chrome Browser v 114.xx)
* IntelliJ 2018.3
* TestNG 7.5.1
* Cucumber 7.11.0

Project Structure 
--------------
- src
    - main
        - java
            - pages
        - resouces
    - test
        - java
            - stepDefintions
        - resources
            - features
 
        

Writing a test
--------------

The cucumber features goes in the `features` library and should have the ".feature" extension.


Running test
--------------

USING CLI

* Go to the project directory
* Open command prompt
* Type command - `mvn test`

USING IDE


In your TestRunner class, configure run scenarios:

```
package stepDefintions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	plugin = {"html:target/cucumberHtmlReport"},
	features = "classpath:features",
	glue = {"info.seleniumcucumber.stepdefinitions"}
)

public class RunCukeTest {
}
```


Reporting
--------------
Report is available : <project_location>/target/.html

