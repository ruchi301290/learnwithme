package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {

    private WebDriver driver;

    public Homepage(WebDriver driver){
        this.driver=driver;

    }

    @FindBy(xpath="//*[@type='search']")
    private WebElement searchBox;

    @FindBy(xpath="//*[@type='submit']")
    private WebElement submitButton;


    public void enterText(String searchText){
        searchBox.sendKeys(searchText);
    }

    public void submit(){
        submitButton.click();
    }
}
