package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/features/",
        glue={"stepDefinitions","utility"},
        plugin={"pretty","html:target/ruchi.html"},
        monochrome = true
)

//Runner class is extending and overriding a method to run all tests in parallel. If you dont want parallel, dont extend and override
public class Runner extends AbstractTestNGCucumberTests {

//    @Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios(){
//        return super.scenarios();
//    }


}
