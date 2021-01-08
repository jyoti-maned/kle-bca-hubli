package org.example.shared.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverProvider {
    private static WebDriverProvider INSTANCE = null;
    private WebDriver driver = null;
    private WebDriverProvider() {

    }
    public static WebDriverProvider getInstance() {
        if(INSTANCE==null){
            INSTANCE= new WebDriverProvider();

        }
        return INSTANCE;
    }
    public WebDriver getDrievr() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyoti\\chromedriver.exe");
        driver= new ChromeDriver();
        return driver;
    }

    public void tearDown() {
        driver.close();
        driver.quit();
    }
}

