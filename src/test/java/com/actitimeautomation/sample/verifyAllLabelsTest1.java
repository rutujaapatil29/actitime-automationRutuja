package com.actitimeautomation.sample;

import com.actitimeautomation.Common.CommonUtil;

import com.actitimeautomation.Pages.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class verifyAllLabelsTest1 extends BaseClass
{
    WebDriver driver;
    CommonUtil commonUtil;

    @BeforeClass
    public void setUp()
    {
        LaunchBrowser("chrome");
        driver = super.driver;
        driver.navigate().to("https://www.amazon.in/");
        commonUtil = new CommonUtil(driver);
    }

    @Test
    public void verifyAllLabels()
    {
        //commonUtil.waitForAllElementToVisible(By.tagName("input"));
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


