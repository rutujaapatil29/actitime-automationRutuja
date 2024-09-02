package com.actitimeautomation.sample;

import org.testng.annotations.*;

public class SanityTestGroup {
    @BeforeGroups({"regression","sanity"})
    public void beforeGroup()
    {
        System.out.println("This is before group");
    }
    @AfterGroups(groups = "sanity")
    public void AfterGroups(){

    System.out.println("This is After group");

    }
    @Test(groups = "sanity")
    public void sanityTest1()
    {
        System.out.println("This is sanity test1");
    }
    @Test(groups="sanity")
        public void sanityTest2(){
        System.out.println("This is sanityTest2");
        }
        @Test(groups="sanity")
        public void sanityTest3()
        {
            System.out.println("sanityTest3");
        }
    @Test(groups="sanity")
    public void sanityTest4()
    {
        System.out.println("sanityTest4");
    }
    @Test(groups={"regression","sanity"})

        public void sanityTest5()
        {
            System.out.println("sanityTest5");
        }


}
