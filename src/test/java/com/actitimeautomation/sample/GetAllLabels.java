package com.actitimeautomation.sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.actitimeautomation.Pages.BaseClass;
import org.openqa.selenium.WebElement;
import java.util.List;

public class GetAllLabels extends BaseClass
{
    static WebDriver driver;
    public GetAllLabels()
    {
        LaunchBrowser("chrome");
        driver = super.driver;
    }
    public static void main(String[] argh)
    {
        new GetAllLabels();
        driver.navigate().to("https://www.amazon.in");
        //get allLabel Elements
        List<WebElement>labelList=driver.findElements(By.tagName("input"));
        System.out.println(labelList.size());
        //iterate through eh Element
        for(WebElement element:labelList)
        {
            String label= element.getAttribute("placeholder");
            if(label !=null && !label.isBlank())
            {
                System.out.println(label);
            }
        }
        driver.quit();
    }

}
