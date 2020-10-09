package pages;

import org.openqa.selenium.By;

import static java.lang.String.format;

public class MainPage extends BasePage{

    By buttonOpenLoginPage = By.cssSelector("button.header2__auth");
    By buttonMenuDropdown = By.cssSelector("p.header2-menu__item-text__username");
    By buttonOpenPersonalData = By.cssSelector(".header2-menu__dropdown-text_name");
    By nameField = By.cssSelector("#id_fname");
    By buttonOpenPersonalСabinet = By.cssSelector(".header2-menu__dropdown-link[title='Личный кабинет']");
    By emailLocator = By.cssSelector("div.new-input-line_slim:nth-child(3) input");
    By buttonOpenPayments = By.cssSelector(".header2-menu__dropdown-link[title='Оплата']");
    By titleCourses = By.cssSelector(".js-learning .container .text");
    By textCoursesList = By.cssSelector(".courses-list__item");
    By buttonLogout = By.cssSelector(".header2-menu__item_dropdown_no-border > div:nth-child(2) > a:nth-child(5)");
    By buttonAboutUs = By.cssSelector(".header2-menu_main > div:nth-child(5) > div:nth-child(1) > p:nth-child(1)");
    By buttonAboutCompany = By.cssSelector(".header2-menu_main > div:nth-child(5) > div:nth-child(2) > a:nth-child(1)");
    By titleAboutCompany = By.cssSelector(".about-header__title");
    String categoryNameXpath = "//div[@id='categories_id']//a[@title='%s']";

    public void openLoginPage(){
        waitForElement(buttonOpenLoginPage).click();
        waitForElement(emailLocator);
    }

    public void openPersonalDataPage(){
        waitForElement(buttonMenuDropdown).click();
        waitForElement(buttonOpenPersonalData).click();
        waitForElement(nameField);
    }

    public void openMyCoursesPage(){
        waitForElement(buttonMenuDropdown).click();
        waitForElement(buttonOpenPersonalСabinet).click();
        waitForElement(titleCourses);
    }

    public void openPaymentPage(){
        waitForElement(buttonMenuDropdown).click();
        waitForElement(buttonOpenPayments).click();
        waitForElement(textCoursesList);
    }

    public void selectCategory(String streamName) {
        waitForElement(By.xpath(format(categoryNameXpath, streamName))).click();
    }

    public void clickLogoutButton(){
        waitForElement(buttonMenuDropdown).click();
        waitForElement(buttonLogout).click();
    }

    public String getAuthorizedName(){
        return waitForElement(buttonMenuDropdown).getText();
    }

    public void assertThatUserUnauthorized(){
        waitForElement(buttonOpenLoginPage);
    }

    public void openAboutOtusPage(){
        waitForElement(buttonAboutUs).click();
        waitForElement(buttonAboutCompany).click();
    }

    public String getAboutOtusTitle(){
        return waitForElement(titleAboutCompany).getText();
    }
}
