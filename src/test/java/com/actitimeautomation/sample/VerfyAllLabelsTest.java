package com.actitimeautomation.sample;

import com.actitimeautomation.Common.PropertyHandling;
import com.actitimeautomation.Common.CommonUtil;

import com.actitimeautomation.Pages.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class VerfyAllLabelsTest extends BaseClass {
    WebDriver driver;
    PropertyHandling propertyHandling;
    CommonUtil commonUtil;
    @BeforeClass
    public void setup() throws IOException {
        propertyHandling=new PropertyHandling();
        LaunchBrowser("browser");
        driver = super.driver;
        driver.navigate().to("actitimeurl");
        commonUtil = new CommonUtil(driver);
    }
        @Test
        public void verifyAllLabels()
        {
            // commonUtil.waitForAllElementToVisible(By.tagName("input"));
            //get all label elements
            List<WebElement> labelList=driver.findElements(By.tagName("input"));
            System.out.println(labelList.size());
            //iterate through each label element
            for(WebElement element :labelList) {
                String label = element.getAttribute("placeholder");
                if (label != null && !label.isBlank()) {
                    System.out.println(label);
                }
            }



        }

    @AfterClass
    public void teardown()
    {
                    driver.quit();
    }

}
