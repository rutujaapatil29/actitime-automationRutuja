package com.actitimeautomation.Pages;

import com.actitimeautomation.Common.CommonUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectPage {
    WebDriver driver;
    CommonUtil commonUtil;


    @FindBy(xpath="//div[contains(@class,'createNewProject')]")
    public WebElement createNewProjectButton;

    //Eneter Project Name
    @FindBy(xpath="//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")
    public WebElement enterNewProject;

    //Select Customer
  //  @FindBy(xpath="//div[@class='emptySelection']")
   // public WebElement selectCustomer;

   // @FindBy(xpath = "//div[@class=\"itemRow cpItemRow \"][2]")
   // public WebElement selectFromDropdown;

    //Eneter Task
    @FindBy(xpath="//input[@class='inputFieldWithPlaceholder' and @placeholder='Enter task name'][1]")
      public WebElement enterTask;

    //Click on create Projet
    @FindBy(xpath="//div[text()='Create Project']")
    public WebElement clickonCreateProjectButton;


    public ProjectPage(WebDriver driver)
    {//initElements is a static method of PageFactory class which is used in conjunction with @FindBy annotation.
        // Using the initElements method we can initialize all the web elements located by @FindBy
        this.driver=driver;
        PageFactory.initElements(this.driver,this);


    }

}
