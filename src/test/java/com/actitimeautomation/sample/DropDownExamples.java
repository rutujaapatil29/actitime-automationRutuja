package com.actitimeautomation.sample;

import com.actitimeautomation.Pages.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownExamples extends BaseClass
{
    static WebDriver driver;
    public DropDownExamples()
    {
        LaunchBrowser( "chrome");
        driver=super.driver;
    }
    public static void main(String[] arg) throws Exception {
        new DropDownExamples();
        driver.navigate().to("https://www.amazon.in/");
        //Create an instance of select class
        Select select=new Select(driver.findElement(By.id("searchDropdownBox")));
       System.out.println(select.isMultiple());
     /*   //select By text
        select.selectByVisibleText("Books");
        //Select By value
        select.selectByValue("search-alias=stripbooks");
        //Select By Index
        select.selectByIndex(12);*/

        //get alloptions from dropdown
        List<WebElement> valueList=select.getOptions();
        System.out.println("Total values in dropdown :"+ valueList.size());
        for(WebElement element:valueList) {
            //get the text of value
            String Value = element.getText();
            if (Value.equals("Music")) {
                select.selectByVisibleText(Value);
                System.out.println(Value);
                List<WebElement> selectedValues = select.getAllSelectedOptions();
                WebElement selectedVal = selectedValues.get(0);

                String val = selectedVal.getText();
                if (val.equals("Music")) {
                    System.out.println("Sucessfully selected Music values form dropdown");
                } else {
                    throw new Exception("Music value didnot selected in dropdown");
                }
                break;


            }
        }
        //enter text in search area
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
        //click on search icon
        driver.findElement(By.id("nav-search-submit-button")).click();
        }


        }





