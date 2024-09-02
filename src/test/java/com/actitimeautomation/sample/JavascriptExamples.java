package com.actitimeautomation.sample;

import com.actitimeautomation.Pages.BaseClass;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptExamples extends BaseClass
{
    static WebDriver driver;
    public JavascriptExamples()
    {
        LaunchBrowser( "chrome");
        driver=super.driver;

    }
    public static  void main(String[] argh) {
        new JavascriptExamples();
        driver.get("https://online.actitime.com/premia2/");
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        //type cast driver var into javascriptExecutor
      //  javascriptExecutor js=(javascriptExecutor) driver;
         //eneter text using javascript
    //    js.executeScript()

    }
}
