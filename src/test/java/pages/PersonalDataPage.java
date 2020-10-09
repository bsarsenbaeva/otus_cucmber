package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class PersonalDataPage extends BasePage {
    By nameField = By.cssSelector("#id_fname");
    By nameLatinField = By.cssSelector("#id_fname_latin");
    By lastNameField = By.cssSelector("#id_lname");
    By lastNameLatinField = By.cssSelector("#id_lname_latin");
    By blogNameField = By.cssSelector("#id_blog_name");
    By birthDateField = By.cssSelector(".input-icon > input:nth-child(1)");
    By buttonSave = By.cssSelector("button.button_md-4:nth-child(1)");
    By courseItem = By.cssSelector(".learning-item");
    By courseTitle = By.cssSelector(".learning-item__title");
    By paymentTitle = By.cssSelector(".payment__title");
    By skillsSection = By.cssSelector(".container__row .nav-sidebar__item[title='Навыки и технологии']");
    By specializationName = By.cssSelector("div.select:nth-child(1) > label:nth-child(1) > div:nth-child(2)");
    By buttonTestingSpecialization = By.cssSelector("button[title=\"Тестирование\"]");
    By specializationCategory = By.cssSelector("div.input_straight-top-left");
    By buttonTestingAutomationCategory = By.cssSelector("button[title=\"Функциональное/автоматизированное\"]");

    public void addFirstName() {
        waitForElement(nameField).sendKeys("Бакытгуль");
    }

    public void addFirstNameLatin() {
        waitForElement(nameLatinField).sendKeys("Bakytgul");
    }

    public void addLastName() {
        waitForElement(lastNameField).sendKeys("Сарсенбаева");
    }

    public void addLastNameLatin() {
        waitForElement(lastNameLatinField).sendKeys("Sarsenbayeva");
    }

    public void addBlogName() {
        waitForElement(blogNameField).sendKeys("Bakytgul");
    }

    public void addBirthDate() {
        waitForElement(birthDateField).sendKeys("14.04.1993");
    }

    public void saveChanges() {
        waitForElement(buttonSave).click();
    }

    public void addMySpecializationAndSave(){
        waitForElement(skillsSection).click();
        waitForElement(specializationName).click();
        waitForElement(buttonTestingSpecialization).click();
        waitForElement(specializationCategory).click();
        waitForElement(buttonTestingAutomationCategory).click();
        saveChanges();
    }

    public void assertPersonalData() {
        String name = waitForElement(nameField).getAttribute("value");
        String nameLatin = waitForElement(nameLatinField).getAttribute("value");
        String lastName = waitForElement(lastNameField).getAttribute("value");
        String lastNameLatin = waitForElement(lastNameLatinField).getAttribute("value");
        String blogName = waitForElement(blogNameField).getAttribute("value");
        String birthDate = waitForElement(birthDateField).getAttribute("value");

        Assert.assertEquals(name, "БакытгульБакытгуль");
        Assert.assertEquals(nameLatin, "Bakytgul");
        Assert.assertEquals(lastName, "СарсенбаеваСарсенбаева");
        Assert.assertEquals(lastNameLatin, "Sarsenbayeva");
        Assert.assertEquals(blogName, "Bakytgul");
        Assert.assertEquals(birthDate, "14.04.1993");
    }

    public void assertMyCoursesList(){
        String courseName = waitForElement(courseTitle).getText();
        waitForElement(courseItem);
        Assert.assertEquals(courseName, "Java QA Engineer");
    }

    public String getPaymentCourseTitle(){
        return waitForElement(paymentTitle).getText();
    }

    public void assertSpecialization(){
        waitForElement(skillsSection).click();
        String savedSpecialization = waitForElement(specializationName).getText();
        String savedSpecializationCategory = waitForElement(specializationCategory).getText();

        Assert.assertEquals(savedSpecialization, "Тестирование");
        Assert.assertEquals(savedSpecializationCategory, "Функциональное/автоматизированное");
    }
}
