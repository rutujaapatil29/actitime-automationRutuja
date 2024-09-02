package com.actitimeautomation.sample;

import com.actitimeautomation.Pages.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample extends BaseClass
{
    static WebDriver driver;
    public DragAndDropExample()
    {
        LaunchBrowser( "chrome");
        driver=super.driver;

    }
    public static void main(String[] argh) throws InterruptedException
    {
        new DragAndDropExample();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        //wait for 5sec
        String windowId=driver.getWindowHandle();
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@rel-title='Photo Manager']//iframe")));
        //driver.switchTo().frame(1);

        WebElement srcElement= driver.findElement(By.xpath("//ul[@id='gallery']/li[1]/img"));
                WebElement dstElement=driver.findElement(By.id("trash"));
                Actions actions=new Actions(driver);
               actions.clickAndHold(srcElement).release(dstElement).build().perform();

               Thread.sleep(5000);
                //Switch control back to webpage
        driver.switchTo().window(windowId);
        System.out.println(driver.getTitle());
        driver.quit();



    }
}
