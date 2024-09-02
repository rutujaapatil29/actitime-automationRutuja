package com.actitimeautomation.sample;
import com.actitimeautomation.Pages.BaseClass;
import com.actitimeautomation.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class DataProviderExample  extends BaseClass {
    WebDriver driver;

    @BeforeClass
           // (enabled = false)
    public void setup() {
        LaunchBrowser("chrome");
        driver = super.driver;
        driver.navigate().to("https://online.actitime.com/premia2");
    }

    @DataProvider
    Object[][] getTestData() {
        Object[][] obj = new Object[][]
                {
                        {"username1", "pasword1"},
                        {"username2", "password"}


                };
        return obj;
    }
    @DataProvider
    public Object[][] getTestDataFromExcel() throws IOException{
        ExcelHandling1 excelHandling1=new ExcelHandling1();
       // String filepath="/Users/RUTUJA/Documents/Credentials.xlsx";
        String filepath="/Users/Admin/Documents/Credentials.xlsx";
        Object[][] excelData=excelHandling1.getExcelData(filepath,"sheet1");
        return excelData;
    }
    @Test(dataProvider = "getTestDataFromExcel")
    public void verifyLogin(Object username,Object password)throws Exception
    {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.Login(username.toString(),password.toString());
        Thread.sleep(5000);
    }
    @Test(dataProvider ="getSampleData",dataProviderClass=TestDataProvider.class)
    public void test(Object param1,Object param2,String param3){
        System.out.println(param1 +" "+ param2 +" "+ param3);
    }

}
