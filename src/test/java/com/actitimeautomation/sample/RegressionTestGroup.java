package com.actitimeautomation.sample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegressionTestGroup {

    @Parameters({"browser","username","password"})
    @Test
    public void regressionTest(String browser,String username,String password)
    {
        System.out.println(browser);
        System.out.println(username);
        System.out.println(password);

    }
    @Test
    public void regressionTest2()
    {
        System.out.println("Rgression Test2");
    }
}
