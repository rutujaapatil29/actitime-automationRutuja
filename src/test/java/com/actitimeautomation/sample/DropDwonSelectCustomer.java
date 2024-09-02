package com.actitimeautomation.sample;

import com.actitimeautomation.Pages.BaseClass;
import com.actitimeautomation.Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDwonSelectCustomer extends BaseClass
{
    static WebDriver driver;
    public DropDwonSelectCustomer()
    {
        LaunchBrowser( "chrome");
        driver=super.driver;
    }
    public static void main(String[] arg) throws Exception {
        new DropDwonSelectCustomer();
        driver.get("https://online.actitime.com/premia2/");
        driver.manage().window().maximize();
        //Create object of login page class
        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login("rp2@yopmail.com", "123456");
        //wait for 5 sec
        Thread.sleep(5000);
      /*  //Click On Report
        driver.findElement(By.xpath("//div[text()='Reports']")).click();
        Thread.sleep(5000);
        //click on high prioriy task->//span[text()='High Priority Tasks']
        driver.findElement(By.xpath("//span[text()='High Priority Tasks']")).click();
        //click on nre report->//div[text()='New Report']
        driver.findElement(By.xpath("//div[text()='New Report']")).click();*/


//copy projects from old customer
        //span[@class="customerSelectorPlaceholder selectorWithPlaceholderContainer"]



        driver.findElement(By.xpath("//div[text()='Tasks']")).click();
        //wait for5sec
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='Add New']")).click();
        Thread.sleep(5000);
        //div[@class='item createNewTasks']
        driver.findElement(By.xpath("//div[@class='item createNewTasks']")).click();
        Thread.sleep(5000);
        //click on customer from Dropdown
        driver.findElement(By.xpath("//div[text()='- Select Customer -']")).click();
        //select customer name from on search icon from dropdown//div[@class='itemRow cpItemRow '][3]
        driver.findElement(By.xpath("//div[@class='itemRow cpItemRow '][4]")).click();
        Thread.sleep(5000);
        //click on Project from drop dowm-//div[text()="- Select Project -"]
        driver.findElement(By.xpath("//div[text()='- Select Project -']")).click();
       // driver.findElement(By.xpath("//input[@class='newProject newCustomerProjectField inputFieldWithPlaceholder']")).click();//sendKeys("ManmmeetProject1");

        //select froject name from Dropdown-//div[@class='itemRow '][4]"
        //div[@class="itemRow cpItemRow selected"]
           // driver.findElement(By.xpath("//div[@class='itemRow cpItemRow selected']")).click();
        //driver.findElement(By.xpath("//div[@class='itemRow selected'][1]")).click();//sendKeys("ManmeetProject");
       // driver.findElement(By.xpath("//input[@class='newProject newCustomerProjectField inputFieldWithPlaceholder']")).click();//sendKeys("ManmmeetProject1");
        //input[@class="newProject newCustomerProjectField inputFieldWithPlaceholder"]

        //Select text in search area:project
        driver.findElement(By.xpath("//div[@class='projectSelector customerOrProjectSelector selectorWithPlaceholderContainer']")).sendKeys("ManmmeetProject1");


        //Enter TaskName
       driver.findElement(By.xpath("//input[@placeholder='Enter task name'][1]")).sendKeys("Manmeet Patil FunctinalTestCasesTask");
       driver.findElement(By.xpath("//div[text()='Create Tasks']")).click();
       /*   //select By text
        select.selectByVisibleText("Books");
        //Select By value
        select.selectByValue("search-alias=stripbooks");
        //Select By Index
        select.selectByIndex(12);*/

/*
        //enter text in search area
        driver.findElement(By.id("//div[text()='- Select Customer -']")).sendKeys("Manmeet Patil");
        //click on search icon
       driver.findElement(By.xpath("//div[text()='Manmeet Patil']")).click();
    }*/

    }

}
