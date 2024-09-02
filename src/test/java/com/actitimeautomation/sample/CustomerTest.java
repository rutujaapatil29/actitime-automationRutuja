package com.actitimeautomation.sample;

import com.actitimeautomation.Common.PropertyHandling;
import com.actitimeautomation.Pages.BaseClass;
import com.actitimeautomation.Pages.CustomerPage;
import com.actitimeautomation.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CustomerTest extends BaseClass {
    WebDriver driver;
    PropertyHandling propertyHandling;
    CustomerPage customerPage;
    @BeforeClass
    public void setup() throws Exception
    {

       propertyHandling=new PropertyHandling();
        String browser=propertyHandling.getProperty("browser");
        LaunchBrowser(browser);
        driver=super.driver;
        driver.get(propertyHandling.getProperty("actitimeurl"));
        LoginPage loginPage=new LoginPage(driver);
        String username=propertyHandling.getProperty("username");
        String password=propertyHandling.getProperty("password");
        loginPage.Login(username, password );
        customerPage=new CustomerPage(driver);


    }
    @Test
    public  void verifyCreateCustomer()
    {
       // customerPage.createCustomer("cyberSucess");
        customerPage.createCustomer("cyberSucess23");
    //    driver.findElement(searchText).sendKeys(customerName);
      customerPage.verifyCustomer("cyberSucess23");
    }


}
