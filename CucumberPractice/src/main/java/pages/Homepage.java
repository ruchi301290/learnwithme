package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

       public Homepage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="L2AGLb")
    private WebElement acceptAll;

    @FindBy(xpath="//*[@type='search']")
    private WebElement searchBox;

    @FindBy(xpath="//*[@type='submit']")
    private WebElement submitButton;

    public void clickSelectAll(){
        acceptAll.click();
    }

    public void enterText(String searchText){
        searchBox.sendKeys(searchText);
    }

    public void submit(){
        submitButton.click();
    }
}
