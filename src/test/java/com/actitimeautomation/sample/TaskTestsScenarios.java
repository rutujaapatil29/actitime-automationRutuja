package com.actitimeautomation.sample;
import com.actitimeautomation.Pages.LoginPage;
import com.actitimeautomation.Pages.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskTestsScenarios extends BaseClass
    {
        static WebDriver driver;//static variable
    public TaskTestsScenarios()//nonsatic method
        {
            LaunchBrowser("chrome");
            driver=super.driver;
        }
        public static void main(String[] argh) throws Exception
        {
            TaskTestsScenarios taskObject =new TaskTestsScenarios();
            driver.manage().window().maximize();
            //navigate to wesite
            driver.get("https://online.actitime.com/premia2/");
            //Create object of login page class
            LoginPage loginPage=new LoginPage(driver);
            loginPage.Login("rp2@yopmail.com", "123456");
            //wait for 5 sec
            Thread.sleep(5000);
            // driver.findElement(By.xpath("//div[text()='Tasks']")).click();
            //wait for5sec
            // Thread.sleep(5000);
            //click on Add New to new Customer
/*
        driver.findElement(By.xpath("//div[text()='Add New']")).click();
        Thread.sleep(5000);
        //div[text()="+ New Customer"]
        driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
        //Enter CustomerName

        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("John5");
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
        Thread.sleep(5000);*/
/*
        //Create Task
        driver.findElement(By.xpath("//div[text()='Add New']")).click();
        Thread.sleep(5000);
        //Click on create Project
        driver.findElement(By.xpath("//div[@class='item createNewTasks']")).click();
        Thread.sleep(5000);
        //Enter Project Name
        driver.findElement(By.xpath("//div[@class='selectCustomerAndProject']")).sendKeys("ManmeetProject");
        Thread.sleep(5000);
        //Select Project
        driver.findElement(By.xpath("//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")).sendKeys("TcsProject2");*/


/*
        //Create New Task
        driver.findElement(By.xpath("//div[text()='Add New']")).click();
        Thread.sleep(5000);
        //div[@class='item createNewTasks']
        driver.findElement(By.xpath("//div[@class='item createNewTasks']")).click();
        Thread.sleep(5000);
        //select text in search area-cutomer
        driver.findElement(By.xpath("//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']")).sendKeys("Galaxy Corporation");
        //Select text in search area:project
        driver.findElement(By.xpath("//div[@class='projectSelector customerOrProjectSelector selectorWithPlaceholderContainer']")).sendKeys("Android testing");

        ///create task
        driver.findElement(By.xpath("(//input[@class='inputFieldWithPlaceholder' and @placeholder='Enter task name'])[1]")).sendKeys("Android testing FunctinalTestCasesTask");
        driver.findElement(By.xpath("//div[text()='Create Tasks']")).click();*/
/*
//CREATE nEW TASK
        driver.findElement(By.xpath("//div[text()='Add New']")).click();
        Thread.sleep(5000);
        //div[@class='item createNewTasks']
        driver.findElement(By.xpath("//div[@class='item createNewTasks']")).click();
        Thread.sleep(5000);

       ///create task
        driver.findElement(By.xpath("(//input[@class='inputFieldWithPlaceholder' and @placeholder='Enter task name'])[1]")).sendKeys("Android testing FunctinalTestCasesTask");
        driver.findElement(By.xpath("//div[text()='Create Tasks']")).click();*/

            //   driver.findElement(By.xpath("//div[@id='createTaskpopup_content']/descendant::input[7]")).sendKeys("WriteSystemTsetCaes");
            //  driver.findElement(By.xpath("//button[@id='ext-gen89']")).click();*/


            //========Create project by selecting  cutsomer and create task==========
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
            driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("John5");
            Thread.sleep(5000);
            driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
            Thread.sleep(5000);
            //Create Projcet
            driver.findElement(By.xpath("//div[text()='Add New']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//div[@class='item createNewProject']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")).sendKeys("JohnProject5");

            //Enetr task in project page
            //td[@class="nameCell first"][1]
            driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder' and @placeholder='Enter task name'][1]")).sendKeys("FunctionalTestCaseJohnProject5");
            Thread.sleep(5000);
            //driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder' and @placeholder='Enter task name'][5]")).sendKeys("SystemTestCaseJohnProject4");
            //Thread.sleep(5000);
            // Click on setdeadline
            driver.findElement(By.xpath("//button[@class='x-btn-text']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[@class='x-date-date']")).click();
            Thread.sleep(5000);



            // clickon create project-//div[text()="Create Project"]

            driver.findElement(By.xpath("//div[text()='Create Project']")).click();
            Thread.sleep(5000);





        }
    }



