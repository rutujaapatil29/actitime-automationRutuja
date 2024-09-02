package com.actitimeautomation.Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseClass {
    public WebDriver driver; //global variable
    public void LaunchBrowser(String browserName)
    {
        if (browserName.equals("chrome"))
        {
            driver=new ChromeDriver();
        } else if (browserName.equals("firefox"))
        {
            driver=new FirefoxDriver();
        }
    }
}