package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static driver.DriverManager.getWebDriver;

public abstract class BasePage {

//    protected WebDriver driver;
//
//    public BasePage(WebDriver driver) {
//        WebDriverManager.chromedriver().setup();
//        this.driver = driver;
//    }

    protected WebElement waitForElement(By elementBy) {
        WebDriverWait waitForOne = new WebDriverWait(getWebDriver(), 15);
        waitForOne.until(ExpectedConditions.presenceOfElementLocated(elementBy));
        return getWebDriver().findElement(elementBy);
    }

    protected WebElement waitForElementToDisappear(By elementBy) {
        WebDriverWait waitForOne = new WebDriverWait(getWebDriver(), 15);
        waitForOne.until(ExpectedConditions.invisibilityOfElementLocated(elementBy));
        return getWebDriver().findElement(elementBy);
    }
}
