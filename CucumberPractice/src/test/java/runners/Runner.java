package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/features",
        glue={"stepDefinitions","utility"},
        plugin={"pretty","html:target/ruchi.html"}
)
public class Runner extends AbstractTestNGCucumberTests {


}
