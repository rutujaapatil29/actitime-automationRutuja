package com.actitimeautomation.sample;

import com.actitimeautomation.Common.CommonUtil;
import com.actitimeautomation.Common.PropertyHandling;
import com.actitimeautomation.Pages.BaseClass;
import com.actitimeautomation.Pages.CustomerPage;
import com.actitimeautomation.Pages.LoginPage;
import com.actitimeautomation.Pages.ProjectPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectTest extends BaseClass {
    WebDriver driver;
    PropertyHandling propertyHandling;
    CustomerPage customerPage;
    LoginPage loginPage;
    ProjectPage projectPage;
    CommonUtil commonUtil;
    @BeforeClass
    public void setup() throws Exception
    {
        propertyHandling=new PropertyHandling();
        String browser=propertyHandling.getProperty("browser");
        LaunchBrowser(browser);
        driver=super.driver;
        String url=propertyHandling.getProperty("actitimeurl");
        driver.get(url);
        loginPage = new LoginPage(driver);
        String username=propertyHandling.getProperty("username");
        String password=propertyHandling.getProperty("password");
        loginPage.Login(username,password);
        customerPage=new CustomerPage(driver);
        projectPage=new ProjectPage(driver);
        commonUtil=new CommonUtil(driver);

    }
    @Test
    public void verifyCreateProject()

    {
        commonUtil.waitForElementClickable(customerPage.taskModule);
        //click task module
        driver.findElement(customerPage.taskModule).click();
        //click on addnew Module
        commonUtil.waitForElementClickable(customerPage.addNewButton);
        driver.findElement(customerPage.addNewButton).click();
        projectPage.createNewProjectButton.click();
        //Enter Project Name
        commonUtil.waitForElementClickable( projectPage.enterNewProject);
        projectPage.enterNewProject.sendKeys("cyber");

       /* commonUtil.waitForElementClickable(projectPage.selectCustomer);
        projectPage.selectCustomer.click();
        commonUtil.waitForElementClickable(projectPage.selectFromDropdown);
        projectPage.selectFromDropdown.sendKeys("cyberSucess");*/

        commonUtil.waitForElementClickable(projectPage.enterTask);
        projectPage.enterTask.sendKeys("Fuctional Testcase for cyberSucess ");

        commonUtil.waitForElementClickable(projectPage.clickonCreateProjectButton);
        projectPage.clickonCreateProjectButton.click();


       // driver.findElement(createNameTextArea).
    }


    @AfterClass
    public void tearDown()
    {
      //  driver.quit();
    }
}
