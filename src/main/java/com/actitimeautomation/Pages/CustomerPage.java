package com.actitimeautomation.Pages;

import com.actitimeautomation.Common.CommonUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerPage {
    WebDriver driver;
    CommonUtil commonUtil;
    public CustomerPage(WebDriver driver)
    {
        this.driver=driver;
        commonUtil=new CommonUtil(this.driver);
    }
   public By taskModule=By.xpath("//div[text()='Tasks']");

    public By addNewButton=By.xpath("//div[text()='Add New']");
    public By createNewCustomer=By.xpath("//div[text()='+ New Customer']");
    public  By createNameTextArea=By.xpath("//div[@id='customerLightBox_content']/descendant::input[1]");
    public By createCustomerButton=By.xpath("//div[text()='Create Customer']");
    public By searchText=By.xpath("//div[@class='searchField']//input[@placeholder='Start typing name ...'][1]");

    public void createCustomer(String custmerName)
    {

        commonUtil.fluentWait(taskModule);
        driver.findElement(taskModule).click();
        commonUtil.fluentWait(addNewButton);
        driver.findElement(addNewButton).click();
        commonUtil.fluentWait(createNewCustomer);
        driver.findElement(createNewCustomer).click();
        commonUtil.fluentWait(createNameTextArea);
        driver.findElement(createNameTextArea).sendKeys(custmerName);
        commonUtil.fluentWait(createCustomerButton);
        driver.findElement(createCustomerButton).click();
    }
   public void verifyCustomer(String custmerName)
    {
        driver.findElement(searchText).sendKeys(custmerName);

        //fetch the result and get the text
        //compare the actual result and expected result
    }
}
