package com.actitimeautomation.sample;

import org.testng.annotations.*;


public class TestNGAnnotations {
    {
        System.out.println("This is nonstatic  block");
    }
    public TestNGAnnotations()
    {
        System.out.println("This is constructor of testng annotations");
    }
    @BeforeClass
    public void BeforeClass() {
        System.out.println("This is Before class  ");

    }
    @AfterClass
    public void AfterClass()
    {
        System.out.println("This is After class  ");
    }
    @BeforeMethod
    public void BeforeMethod()
    {
        System.out.println("This is before methd");

    }
    @AfterMethod
    public void AfterMethod()
    {
        System.out.println("This is after method");

    }
    @Test
    public void test1()
    {
        System.out.println("This is test1 method  from TestNGAnnotations ");
    }
    @Test
    public void test2()
    {
        System.out.println("This is test2 method  from TestNGAnnotations ");
    }
    @Test
    public void test3()
    {
        System.out.println("This is test3 method  from TestNGAnnotations ");
    }


}

