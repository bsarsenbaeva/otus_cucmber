package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Assert;
import pages.LoginPage;
import pages.MainPage;

public class AuthorizationStepdefs {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @When("I enter {string} and {string} in Login Page")
    public void enterEmailAndPasswordInLoginPage(String email, String password) {
        loginPage.typeEmail(email)
                .typePassword(password)
                .submitLogin();
    }

    @Then("I should be authorized")
    public void assertThatUserAuthorized() {
        assertThat(mainPage.getAuthorizedName()).isEqualTo("Bakytgul");
    }

    @And("I click logout button")
    public void clickLogoutButton() {
        mainPage.clickLogoutButton();
    }

    @Then("I should be unauthorized")
    public void assertThatUserUnauthorized() {
        mainPage.assertThatUserUnauthorized();
    }

    @When("I open LoginPage")
    public void openLoginPage() {
        MainPage mainPage = new MainPage();
        mainPage.openLoginPage();
    }
}
