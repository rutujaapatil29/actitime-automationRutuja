package com.actitimeautomation.sample;
import com.actitimeautomation.Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTest {
    public static void main(String[] argh) throws InterruptedException {
        //launch Browser
        WebDriver driver = new ChromeDriver();
        //Navigate to web site
        driver.get("https://online.actitime.com/premia2/");
       // https://online.actitime.com/premia11
        //Create object of Loginpage class
        LoginPage loginPage = new LoginPage(driver);
        //Perform login Operation
       // loginPage.Login("rp16@yopmail.com", "072024");
        loginPage.Login("rp2@yopmail.com", "123456");
        //wait for 5 sec
        Thread.sleep(5000);
        //click on task module
        driver.findElement(By.xpath("//div[text()='Tasks']")).click();
        //wait for5sec
        Thread.sleep(5000);
        //locate select all check box and verify it is displayed
      /*  boolean selectAllCheckbox=driver.findElement(By.xpath("//tr[@class='headers']/descendant::div[2]")).isDisplayed();
        if(selectAllCheckbox) {
            //click on Selectall checkbox
            driver.findElement(By.xpath("//tr[@class='headers']/descedant::div[2]")).isDisplayed();
            Thread.sleep(5000);


       */
        //click on Add New to new Customer
        //div[text()='Add New']
        driver.findElement(By.xpath("//div[text()='Add New']")).click();
        Thread.sleep(5000);
        //div[text()="+ New Customer"]
        driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();

        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Manmeet");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='Create Customer]")).click();



        }


        }




