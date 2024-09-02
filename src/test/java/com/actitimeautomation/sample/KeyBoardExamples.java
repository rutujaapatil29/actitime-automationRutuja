package com.actitimeautomation.sample;

import com.actitimeautomation.Pages.BaseClass;
import com.actitimeautomation.Pages.LoginPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyBoardExamples extends BaseClass {

    static WebDriver driver;//static variable
    public KeyBoardExamples()//nonstatic method
    {
        LaunchBrowser("chrome");
        driver=super.driver;
    }
    public static void main(String[] argh) throws Exception {
         new KeyBoardExamples();
        // driver.manage().window().minimize();
        //navigate to wesite
        driver.get("https://online.actitime.com/premia2");
        //Create object of login page class
        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login("rp2@yopmail.com", "123456");
        //wait for 5 sec
        Thread.sleep(5000);
        /*
        Actions actions=new Actions(driver);
        actions.keyDown(Keys.ENTER).build().perform();
        actions.keyUp(Keys.ENTER).build().perform();*/
        Robot robot =new Robot();
        robot.mouseMove(500,500);//mouse left button press
        robot.mousePress(KeyEvent.VK_LEFT);
        robot.mouseRelease(KeyEvent.VK_LEFT);
      //  robot.keyPress(KeyEvent.VK_ENTER);
    //    robot.mouseRelease(KeyEvent.VK_ENTER);


    }
}
