package com.actitimeautomation.sample;

import com.actitimeautomation.Pages.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExamples extends BaseClass
{
    static WebDriver driver;
    public ActionsExamples()
    {
        LaunchBrowser( "chrome");
        driver=super.driver;
    }
    public static void main(String[] argh) throws InterruptedException
    {
        new ActionsExamples();
        driver.get("https://online.actitime.com/premia2");
        Actions actions=new Actions(driver);
        actions.sendKeys(driver.findElement(By.id("username")),"rp2@yopmail.com").build().perform();
        actions.sendKeys(driver.findElement(By.name("pwd")),"123456").build().perform();
        actions.click(driver.findElement(By.xpath("//div[starts-with(text(),'Login')]"))).build().perform();
        Thread.sleep(5000);
        //scroll to element and perform click operation using actions class
        actions.sendKeys(driver.findElement(By.id("container_tasks"))).build().perform();
        Thread.sleep(5000);
        actions.scrollToElement(driver.findElement(By.xpath("//div[text()='Big Bang Company' and @class='text']")))
                .click(driver.findElement(By.xpath("//div[text()='Big Bang Company' and @class='text']")))
                .build()
                .perform();



    }
}
