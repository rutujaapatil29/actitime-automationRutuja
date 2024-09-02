package com.actitimeautomation;

import com.actitimeautomation.Pages.BaseClass;
import com.actitimeautomation.Common.ExtentReportUtil;
import com.actitimeautomation.Common.PropertyHandling;
import com.actitimeautomation.Pages.CustomerPage;
import com.actitimeautomation.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CustomerTest extends BaseClass {

    WebDriver driver;
    PropertyHandling propertyHandling;
    CustomerPage customerPage;

    @BeforeClass
    public void setup(ITestContext context) throws Exception {
        propertyHandling = new PropertyHandling();
        String browser = propertyHandling.getProperty("browser");
        LaunchBrowser(browser);
        driver = super.driver;
        context.setAttribute("webDriver", driver);
        driver.get(propertyHandling.getProperty("actitimeUrl"));
        LoginPage loginPage= new LoginPage(driver);
        String username = propertyHandling.getProperty("username");
        String password = propertyHandling.getProperty("password");
        loginPage.Login(username, password);
        customerPage = new CustomerPage(driver);
    }

    @Test
    public void verifyCreateCustomer(){
        ExtentReportUtil.getTest().info("successfully logged in to application");
        customerPage.createCustomer("Cyber Success12");
        customerPage.verifyCustomer("Cyber Success12");
        ExtentReportUtil.getTest().info("newly created customer verified successfully");

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
