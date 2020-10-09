package pages;

import org.openqa.selenium.By;

public class CategoryPage extends BasePage{
    private String categoryTitleXpath = "//div[@class ='title-new__text']/h1";
    private String categoryCoursesNumberXpath = "//div[@class ='title-new__info']/div[1]";

    public String getCourseTitle() {
        return waitForElement(By.xpath(categoryTitleXpath)).getText().trim();
    }

    public Integer getNumberOfCourses() {
        String courses = waitForElement(By.xpath(categoryCoursesNumberXpath)).getText();
        return Integer.valueOf(courses.substring(courses.indexOf(' ')).trim());
    }
}
