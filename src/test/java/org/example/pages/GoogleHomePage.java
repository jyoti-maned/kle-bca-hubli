package org.example.pages;

import org.example.shared.pages.BasePage;
import org.openqa.selenium.By;

public class GoogleHomePage extends BasePage {
    String userNameAddress = "//input[@id='email']";
    String userName="jyoti.maned@gmail.com";
    String pwdAddress="#pass";
    String pwd="anu@joe7tan9jan";
    String logInAddress="//Button[@name='login']";
    public void openPage() {
        driver.get("http://www.google.co.uk");

      //  driver.findElement(By.xpath("//div/span/span[@class='RveJvd snByac']")).click();
        driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[id='oneGoogleBar']")));
        driver.findElement(By.xpath("//input[@id='input']")).sendKeys("Cheese Cake");
       // driver.get("http://facebook.com"
    }
     public void loginPwd() {
        //driver.findElement(By.xpath("//Button[@id='u_0_h']")).click();
        //driver.findElement(By.xpath(userNameAddress)).sendKeys(userName);
        //driver.findElement(By.cssSelector(pwdAddress)).sendKeys(pwd);
        //driver.findElement(By.xpath(logInAddress)).submit();
    }
}

