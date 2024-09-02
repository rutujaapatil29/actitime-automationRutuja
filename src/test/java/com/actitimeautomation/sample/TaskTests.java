package com.actitimeautomation.sample;
import com.actitimeautomation.Pages.BaseClass;
import com.actitimeautomation.Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskTests extends BaseClass
{
    static WebDriver driver;//static variable
    public TaskTests()//nonsatic method
    {
        LaunchBrowser("chrome");
        driver=super.driver;
    }
    public static void main(String[] argh) throws Exception
    {
        TaskTests taskObject =new TaskTests();
       // driver.manage().window().minimize();
        //navigate to wesite
        driver.get("https://online.actitime.com/premia2/");
        //Create object of login page class
        LoginPage loginPage=new LoginPage(driver);
        loginPage.Login("rp2@yopmail.com", "123456");
        //wait for 5 sec
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='Tasks']")).click();
        //wait for5sec
        Thread.sleep(5000);
        //click on Add New to new Customer

        driver.findElement(By.xpath("//div[text()='Add New']")).click();
        Thread.sleep(5000);
        //div[text()="+ New Customer"]
        driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
        //Enter CustomerName

        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("Manmeet Patil1");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
        Thread.sleep(5000);
        //Create Projcet
        driver.findElement(By.xpath("//div[text()='Add New']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='item createNewProject']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")).sendKeys("ManmeetProject1");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='Create Project']")).click();
        Thread.sleep(5000);
/*
        //Create Task
        driver.findElement(By.xpath("//div[text()='Add New']")).click();
        Thread.sleep(5000);//div[@class="item createNewProject"]//div[@class="item createNewProject"]
        //Click on create Project
        driver.findElement(By.xpath("//div[@class='item createNewTasks']")).click();
        Thread.sleep(5000);
        //Enter Project Name
        driver.findElement(By.xpath("//div[@class='selectCustomerAndProject']")).sendKeys("ManmeetProject");
        Thread.sleep(5000);
        driver.findElement(By.xpath())*/



    }
}
