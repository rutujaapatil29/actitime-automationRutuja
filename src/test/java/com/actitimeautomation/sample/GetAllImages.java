package com.actitimeautomation.sample;

import com.actitimeautomation.Pages.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class GetAllImages extends BaseClass
{
    static WebDriver driver;
    public GetAllImages()
    {
        LaunchBrowser("chrome");
        driver = super.driver;
    }
    public static void main(String[] argh)
    {
        new GetAllImages();
        driver.navigate().to("https://www.amazon.in");
        //get allLabel Elements
        List<WebElement> imageList=driver.findElements(By.tagName("img"));
        System.out.println(imageList.size());
        //iterate through eh Element
        for(WebElement element:imageList)
        {
            String image= element.getAttribute("placeholder");
            if(image !=null && !image.isBlank())
            {
                System.out.println(image);
            }
        }
        driver.quit();
    }

}
