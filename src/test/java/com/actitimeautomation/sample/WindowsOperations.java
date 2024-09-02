package com.actitimeautomation.sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.actitimeautomation.Pages.BaseClass;
import java.util.Set;

public class WindowsOperations extends  BaseClass
{
    static WebDriver driver;
    public WindowsOperations() //constructor
    {
        //Launch Browser
        LaunchBrowser("chrome");
        driver=super.driver;

    }
    public static void main(String[] argh)
    {
        new WindowsOperations(); //constructor call
        //navigate to wesite
        driver.navigate().to("https://online.actitime.com/premia2/");
        driver.findElement(By.linkText("actiTIME Inc.")).click();
        String parentWindowId=driver.getWindowHandle();
        System.out.println(parentWindowId);
        //Get all window /tab ids
        Set<String>allWindowIds=driver.getWindowHandles();
        for(String id : allWindowIds)
        {
            System.out.println(allWindowIds);
        }


        //Iterate through all ids
        for(String id :allWindowIds)
        {
            if(!id.equals((parentWindowId)))
            {
                System.out.println("Second Tab ids"+ id);
                //Switch to second tab
                driver.switchTo().window(id);
                //print the title
                String childWindowTitle=driver.getTitle();
                System.out.println(childWindowTitle);
                //close the Second tab
                driver.close();
                break;

            }
        }

        //Switch control back to parent tab
        driver.switchTo().window(parentWindowId);
        // driver.switchTo().defaultContent();
        //get the title of parent tab
        System.out.println("parent tab title:" +driver.getTitle());
        driver.quit();

    }

}
