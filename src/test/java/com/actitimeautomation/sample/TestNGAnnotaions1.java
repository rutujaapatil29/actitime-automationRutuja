package com.actitimeautomation.sample;

import org.testng.annotations.*;

public class TestNGAnnotaions1 {
    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("Ths is before suite");
    }
    @AfterSuite
    public void afterSuite()
    {
        System.out.println("This is after Suite");
    }
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("This is before test method");
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("This is after test method");
    }
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("This is before class");
    }
    @AfterClass
    public void afterClass()
    {
        System.out.println("This is after class");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("This is Before Method");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("This is afterMethod");
    }
    @Test(enabled = false)
    public void verifyLogin()
    {
        System.out.println("This is verify Login Methd");
    }
    @Test(priority = 1)
    public void login() throws Exception{
            System.out.println("This is login from TestNGAnnotations class");
    }
    @Test(priority = 1,dependsOnMethods = {"login"})
    public void verifyTask() {
        System.out.println("This is verify task method from TestNGAnnotations class");

       // throws Exception//  throw new Exception("This is sample exception");

    }
    @Test(priority =3,dependsOnMethods = "login",enabled=false)
    public void logout()
    {
        System.out.println("This is logout from TestNGAnnotations");
    }


}
