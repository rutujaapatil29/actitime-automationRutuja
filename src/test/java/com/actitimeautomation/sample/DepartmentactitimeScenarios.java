package com.actitimeautomation.sample;

import com.actitimeautomation.Common.CommonUtil;

import com.actitimeautomation.Pages.BaseClass;
import com.actitimeautomation.Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class DepartmentactitimeScenarios extends BaseClass {
static WebDriver driver;//static variable
CommonUtil commonUtil;

public DepartmentactitimeScenarios()//nonsatic method
{
    LaunchBrowser("chrome");
    driver = super.driver;
    commonUtil=new CommonUtil(driver);



}

public static void main(String[] argh) throws Exception {

    DepartmentactitimeScenarios department = new DepartmentactitimeScenarios();
    driver.manage().window().maximize();
    Actions actions=new Actions(driver);
    //navigate to wesite
    driver.get("https://online.actitime.com/premia2/");
    //Create object of login page class
    LoginPage loginPage = new LoginPage(driver);
    loginPage.Login("rp2@yopmail.com", "123456");
    //wait for 5 sec
    Thread.sleep(5000);
    //Click on Users
    driver.findElement(By.xpath("//div[text()='Users']")).click();
    Thread.sleep(5000);
      /* //Click on Departments-----
        driver.findElement(By.xpath("//div[@class='userList_manageButtons_component_manageGroupsButton']")).click();
        Thread.sleep(5000);
    //Enetr new department name
        driver.findElement(By.xpath("//input[@id='groupManagementLightBox_newGroupInput']")).sendKeys("Research");
        Thread.sleep(5000);
        //Click on add
        driver.findElement(By.xpath("//button[@id='groupManagementLightBox_addGroupButton']")).click();
        Thread.sleep(5000);
        //close Department page
        driver.findElement(By.xpath("//div[@id='groupManagementLightBox_closeLightbox']")).click();
        Thread.sleep(5000);*/
    //Add New User
    driver.findElement(By.xpath("//div[text()='New User']")).click();
    //click and enter 1st name
    Thread.sleep(5000);
    // //input[@class='firstNameInviteMenu inputFieldWithPlaceholder']
    //input[@id="editUserPanel_firstNameField"]
    driver.findElement(By.xpath("(//input[@class='firstNameField inputFieldWithPlaceholder' and @name='firstName'])[2]")).sendKeys("jhon");
   // Thread.sleep(5000);
    //Enetr Middle name
    driver.findElement(By.xpath("//input[@id='createUserPanel_middleNameField']")).sendKeys("M2");
    //Click and enettr last name
    driver.findElement(By.xpath("//input[@id='createUserPanel_lastNameField']")).sendKeys("Senha2");
    Thread.sleep(5000);
    //Click andEnetr email id
    driver.findElement(By.xpath("//input[@id='createUserPanel_emailField']")).sendKeys("johnSenha2@gmail.com");
    Thread.sleep(5000);
    //slect department

    driver.findElement(By.xpath("//div[@class='simpleListMenuButton components_userGroupSelectorMenu emptyList notEmpty']")).click();
    driver.findElement(By.xpath("//div[text()='Development']")).click();
    // driver.findElement(By.xpath("//div[@class='simpleListMenuButton components_userGroupSelectorMenu emptyList notEmpty']")).sendKeys("Development");
    // driver.findElement(By.xpath("//div[@class='dropdownContainer simpleListMenu ']")).sendKeys("Development");
    Thread.sleep(5000);
    // Select Location



    actions.scrollToElement(driver.findElement(By.xpath("//div[@class='containers-WorkStatusScheduleForm-WorkStatusFormLabel-label--LVaBY4Bu containers-WorkStatusScheduleForm-WorkStatusFormSelect-label--pyU3pmf4']")))
            .click(driver.findElement(By.xpath("//div[@class='containers-WorkStatusScheduleForm-WorkStatusFormLabel-label--LVaBY4Bu containers-WorkStatusScheduleForm-WorkStatusFormSelect-label--pyU3pmf4']")))
                    .build()
                    .perform();
    Thread.sleep(5000);
    //driver.findElement(By.xpath("(//span[text()='Remote Work'])[1]")).click();

    //save and sendInvitatf4"ion
    driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
    Thread.sleep(5000);

}
}


