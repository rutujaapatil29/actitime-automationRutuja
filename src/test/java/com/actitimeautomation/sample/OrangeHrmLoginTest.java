package com.actitimeautomation.sample;
import com.actitimeautomation.Pages.LoginPage;
import com.actitimeautomation.Pages.BaseClass;
import com.actitimeautomation.Common.CommonUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrangeHrmLoginTest extends BaseClass {
    WebDriver driver;
    CommonUtil commonUtil;
    @BeforeClass
     public void setup()
     {
         LaunchBrowser("chrome");
         driver=super.driver;

         commonUtil=new CommonUtil(driver);
     }




    @Test
    public void verifyLogin() throws Exception {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //commonUtil.waitForAllElementToVisible(By.name("username"));
        commonUtil.fluentWait(By.name("username"));
        String titile = driver.getTitle();
        System.out.println("Title of the page:" + titile);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin12");
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        boolean enableLoginButton = loginButton.isEnabled();
        System.out.println("The Login button is enables" + enableLoginButton);
        if (enableLoginButton) {
            loginButton.submit();
        } else {
            throw new Exception("Login Button is not enables!");

        }
    }

    @AfterClass
    public void tearDwon() {
        driver.quit();


    }


}
