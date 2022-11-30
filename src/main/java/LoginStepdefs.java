import Practices.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepdefs {

    LoginPage log = new LoginPage();

    @Given("Go to demoqa.com")
    public void goToDemoqaCom() {
        LoginPage.loginPage();
    }

    @And("Login to website by using username and password")
    public void loginToWebsiteByUsingUsernameAndPassword() {

    }

    @Then("Login should be succesful")
    public void loginShouldBeSuccesful() {

    }
}
