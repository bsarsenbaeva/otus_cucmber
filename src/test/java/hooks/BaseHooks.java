package hooks;

import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseHooks {

    @Before()
    public void setupDriver() {
        DriverManager.setupDriver();
    }

    @After()
    public void quitDriver() {
        DriverManager.quitDriver();
    }

}
