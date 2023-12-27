package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {

    private WebDriver driver;

    public BrowserDriver(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/CucumberPractice/src/test/resources/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

    }

    public WebDriver getDriver() {
        return driver;
    }


}
