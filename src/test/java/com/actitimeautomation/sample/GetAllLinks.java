package com.actitimeautomation.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.actitimeautomation.Pages.BaseClass;
import org.openqa.selenium.WebElement;

import java.net.URL;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.List;


public class GetAllLinks extends BaseClass {
    static WebDriver driver;

    public GetAllLinks() {
        LaunchBrowser("chrome");
        driver = super.driver;
    }

    public static void main(String[] argh)throws Exception {
        new GetAllLinks();
        driver.navigate().to("https://www.amazon.in");
        List<WebElement> tagElements = driver.findElements(By.tagName("a"));
        System.out.println(tagElements.size());
        for (WebElement element : tagElements) {

            String link = element.getAttribute("href");
            //exclude null linksif present aor any other text like javascript
           // System.out.println((link));
           // if (link != null && !link.equals("javascript: void(0)"))

            if (link != null && !link.startsWith("javascript"))
            {
                System.out.println(link);
                //conver string into actual uRl
                URL url=new URL(link);
                //use to open SocketConnection
              URLConnection connection=url.openConnection();
            //type cast done....connection converted into HttpURLConnection bcz some urls are used only www
                // so we have to convert into https urls
                HttpURLConnection httpURLConnection=(HttpURLConnection) connection;
                httpURLConnection.connect();
                int statuscode=httpURLConnection.getResponseCode();
                //print broken links
                if(statuscode>299)
                {
                    System.out.println(statuscode+""+link);
                }
                //close the connection
                httpURLConnection.disconnect();


            }


           // driver.quit();
        }

    }
}
