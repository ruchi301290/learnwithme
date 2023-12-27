package utility.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utility.BrowserDriver;
import utility.PropertyReader;

import java.io.IOException;

public class ExecutionHook {


    public static BrowserDriver browserDriver;

    @Before
    public void setup() throws IOException {
        browserDriver = new BrowserDriver();
        PropertyReader.initializeProperties();
        browserDriver.getDriver().get(PropertyReader.getProperty("baseURI"));
    }

    @After
    public void tearDown(){
        if(browserDriver.getDriver()!=null) {
            browserDriver.getDriver().quit();
        }
    }

}
