package com.actitimeautomation.sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLogin {
    public static void main(String [] args)throws Exception
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String title=driver.getTitle();
        System.out.println("Tile of page="+title);
        Thread.sleep(5000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");

        Thread.sleep(5000);

        WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        boolean enableLoginButton=LoginButton.isEnabled();
        if(enableLoginButton)
        {
            System.out.println("button is enables" +enableLoginButton);
            LoginButton.submit();
        }
        else
        {
            throw new Exception("not enabled");

        }
        driver.close();

    }
}
