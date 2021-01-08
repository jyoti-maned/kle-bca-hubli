package org.example.shared.pages;

import org.example.shared.webdriver.WebDriverProvider;
import org.openqa.selenium.WebDriver;

public class BasePage {

    WebDriverProvider webDriverProvider= WebDriverProvider.getInstance();
    protected WebDriver driver= webDriverProvider.getDrievr();
}
