package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    By emailLocator = By.cssSelector("div.new-input-line_slim:nth-child(3) input");
    By passwordLocator = By.cssSelector(".js-psw-input");
    By loginButtonLocator = By.cssSelector("div.new-input-line_last:nth-child(5) > button:nth-child(1)");

    public LoginPage typeEmail(String email) {
        waitForElement(emailLocator).sendKeys(email);
        return this;
    }

    public LoginPage typePassword(String password) {
        waitForElement(passwordLocator).sendKeys(password);
        return this;
    }

    public MainPage submitLogin() {
        waitForElement(loginButtonLocator).submit();
        return new MainPage();
    }
}
