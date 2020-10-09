package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CategoryPage;
import pages.MainPage;

import static driver.DriverManager.getWebDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class NavigationStepdefs {
    MainPage mainPage = new MainPage();
    CategoryPage streamPage = new CategoryPage();

    @Given("I navigate to Otus main page by {string}")
    public void navigateToMainPage(String url) {
        getWebDriver().navigate().to(url);
    }

    @When("I select tab {string}")
    public void selectTab(String tabName) {
        mainPage.selectCategory(tabName);
    }

    @Then("I should see {int} courses on {string} page")
    public void verifyCourses(Integer coursesNumber, String pageName) {
        assertThat(streamPage.getCourseTitle()).isEqualToIgnoringCase(pageName);
        assertThat(streamPage.getNumberOfCourses()).isEqualTo(coursesNumber);
    }

    @When("I navigate to AboutOtusPage")
    public void navigateToAboutOtusPage() {
        mainPage.openAboutOtusPage();
    }

    @Then("I should see AboutOtusPage")
    public void assertAboutOtusPage() {
        assertThat(mainPage.getAboutOtusTitle()).contains("О КОМПАНИИ");
    }
}
