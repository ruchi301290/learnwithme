package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDriver {

    public static WebDriver driver;

    public BrowserDriver(){
        this.driver=driver;
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/drivers/ChromeDriver.exe");
        this.driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }

    public void close(){
        this.driver.close();
    }

}
