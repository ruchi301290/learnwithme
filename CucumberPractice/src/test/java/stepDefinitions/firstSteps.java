package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.Homepage;
import utility.Hooks.ExecutionHook;

public class firstSteps {

    private Homepage homepage;
    private WebDriver driver = ExecutionHook.driver;

    @Given("the user is on the google page")
    public void the_user_is_on_the_login_page() {
       driver.get("http://www.google.com");
        homepage = new Homepage(driver);
    }
    @Given("user entered text")
    public void user_enters_username() {
        homepage.enterText("ruchika");
    }
    @Given("user entered {string}")
    public void user_enters_username(String str) {
        homepage.enterText(str);
    }
    @When("user click submit")
    public void user_click_submit() {
        homepage.submit();
    }
    @Then("search results are displayed")
    public void login_should_be_successful() {
        System.out.println("Results displayed");
        //Assert.assertEquals(true);
    }

}
