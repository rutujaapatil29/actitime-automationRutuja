package com.actitimeautomation.sample;

import com.actitimeautomation.Pages.BaseClass;
import com.actitimeautomation.Pages.LoginPage;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.List;

public class CalenderExample extends BaseClass {
    static WebDriver driver;
    public CalenderExample()
    {
        LaunchBrowser("chrome");
        driver=super.driver;
    }
    public static void main(String[] argh)throws Exception
    {
        //get next Day

        int dayofMonth=LocalDateTime.now().plusDays(1).getDayOfMonth();
        //get Current Day
        //  LocalDateTime.now().getDayOfMonth();
        String currentMonth=LocalDateTime.now().getMonth().toString();
        //convert month in july format
        String month=currentMonth.charAt(8)+currentMonth.substring(1,currentMonth.length()).toLowerCase();
        System.out.println("Current Month :"+currentMonth);
        System.out.println(month);

        System.out.println("Todays day" +dayofMonth);
        new CalenderExample();
        driver.navigate().to("https://online.actitime.com/premia2/");
        //login to application
        LoginPage loginPage=new LoginPage(driver);
        loginPage.Login("rp2@yopmail.com", "123456");
        Thread.sleep(5000);
        //clickon task Module
        driver.findElement(By.id("container_tasks")).click();
        Thread.sleep(5000);
        //click on 1st row calender
        driver.findElement(By.xpath("//div[text()='Set up deadline'])[1]")).click();
        List<WebElement> monthDays=driver.findElements(By.xpath("//tbody[@class='rc-calender-tbody']//td[starts-with(@title,'"+month+"')]/div"));
        //iterate the List
        for(WebElement dayElement :monthDays)
        {
            //get the day
            String monthDay=dayElement.getText();
            //convert day of month into string
            String currentDay=String.valueOf(dayofMonth);
            //check if the monthDay value is current day or not
            if(monthDay.equals(currentDay))
            {
                dayElement.click();
                break;

            }
        }


    }



}
