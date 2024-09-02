package com.actitimeautomation.sample;

import com.actitimeautomation.Pages.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class WindowHandlingExamples extends BaseClass {
    static WebDriver driver;
    public WindowHandlingExamples()
    {
        LaunchBrowser("chrome");
        driver=super.driver;
    }
    public static void main(String[] argh)
    {
        new WindowHandlingExamples();
        //Navigate to Website
        driver.navigate().to("https://online.actitime.com/premia2/login.do");
        //get the id of current page
        String parentTabId=driver.getWindowHandle();
        System.out.println(parentTabId);
        //Open new Window
       // driver.switchTo().newWindow(WindowType.TAB)
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("https://www.redbus.in");

        //print title of current page
        System.out.println((driver.getTitle()));

        //print the url of Page
        String Url=driver.getCurrentUrl();
        System.out.println(Url);

        //close the current tab
        driver.close();
        //Switch conyrol to default page
        driver.switchTo().window(parentTabId);

        //print the parent page title
        System.out.println(driver.getTitle());
        driver.close();

    }
}
