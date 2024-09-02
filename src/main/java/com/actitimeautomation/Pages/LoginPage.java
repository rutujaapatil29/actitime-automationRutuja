package com.actitimeautomation.Pages;

import com.actitimeautomation.Pages.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseClass {
    static WebDriver driver;
    public LoginPage(WebDriver driver) { //constructor

        this.driver = driver;
    }

    public void Login(String username,String password )// nonstatic method
    {
        //Eneter invalid Username and valid password
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.name("pwd")).sendKeys(password);
        //click on login button
        driver.findElement(By.xpath("//div[starts-with(text(),'Login')]")).click();
    }
}

