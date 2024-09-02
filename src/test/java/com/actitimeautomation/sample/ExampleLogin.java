package com.actitimeautomation.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExampleLogin {
    public static void main(String[] arg) throws Exception {
        //Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        //navigtae to webssite https://online.actitime.com/premia/login.do
        driver.get("https://online.actitime.com/premia2");
        /*
        //locate username section and enter the name
        WebElement username =driver.findElement(By.id("username"));
        //enter username
        username.sendKeys("rp16@yopmail.com");
        //enter password
        driver.findElement(By.name("pwd")).sendKeys("072024");
        */
        /*

        //locate username section and enter the name
        driver.findElement(By.id("username")).sendKeys("rp24@yopmail.com");
        //Eneter password
        driver.findElement(By.name("pwd")).sendKeys("062024");
        //click on login button
        driver.findElement(By.xpath("//div[starts-with(text(),'Login')]")).click();

         */

        //Scenario2:-Verify login feature error message with invalid username and valid password
       //Eneter invalid Username and valid password
        driver.findElement(By.id("Username")).sendKeys("rp2@yopmail.com");
        driver.findElement(By.name("pwd")).sendKeys("123456");
        //click on login button
        driver.findElement(By.xpath("//div[starts-with(text(),'Login')]")).click();
        //wait for 5 sec
        Thread.sleep(5000);
        //get the errormsg
       String errorMsg1=driver.findElement(By.xpath("//span[starts-with(text(),'usernsme or password')]")).getText();
       System.out.println(errorMsg1);

       //verify error Msg









    }




}
