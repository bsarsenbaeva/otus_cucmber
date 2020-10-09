package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.MainPage;
import pages.PersonalDataPage;

import static org.assertj.core.api.Assertions.assertThat;

public class ProfileStepdefs {
    PersonalDataPage personalDataPage = new PersonalDataPage();
    MainPage mainPage = new MainPage();

    @And("I open My courses page")
    public void openMyCoursesPage() {
        mainPage.openMyCoursesPage();
    }

    @Then("I should see My courses list")
    public void assertMyCoursesList() {
        personalDataPage.assertMyCoursesList();
    }

    @And("I open Payment page")
    public void openPaymentPage() {
        mainPage.openPaymentPage();
    }

    @Then("I should see My payments")
    public void assertMyPayments() {
        assertThat(personalDataPage.getPaymentCourseTitle()).isEqualTo("Java QA Engineer");
    }

    @And("I navigate to My profile page")
    public void navigateToMyProfilePage() {
        mainPage.openPersonalDataPage();
    }

    @And("I add personal info and save")
    public void addPersonalInfoAndSave() {
        personalDataPage.addFirstName();
        personalDataPage.addFirstNameLatin();
        personalDataPage.addLastName();
        personalDataPage.addLastNameLatin();
        personalDataPage.addBlogName();
        personalDataPage.addBirthDate();
        personalDataPage.saveChanges();
    }

    @Then("The info should be saved")
    public void assertPersonalInfo() {
        personalDataPage.assertPersonalData();
    }

    @And("I add my specialization and save")
    public void addMySpecializationAndSave() {
        personalDataPage.addMySpecializationAndSave();
    }

    @Then("The specialization should be saved")
    public void assertSpecialization() {
        personalDataPage.assertSpecialization();
    }
}
