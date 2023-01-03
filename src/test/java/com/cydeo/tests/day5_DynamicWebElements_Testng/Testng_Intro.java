package com.cydeo.tests.day5_DynamicWebElements_Testng;

import org.testng.Assert;
import org.testng.annotations.*;

public class Testng_Intro {
   @BeforeClass
   public void setupMEthod(){
       System.out.println(" --->>> BeforeClass is running.");
   }

   @AfterClass
   public void teardownClass(){
       System.out.println("----> AfterClass is running. ");
   }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("BeforeMethod is running!");
    }
    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After method is running!");
    }

    @Test
    public void test1(){
        System.out.println("Test 1 is running...");
        // assert equals
        Assert.assertEquals("actual","actual");
    }
    @Test
    public void test2(){
        System.out.println("Test2 is running...");
        String actual="apple";
        String expected= "apple1";
        Assert.assertTrue(actual.equals(expected));
    }

}
