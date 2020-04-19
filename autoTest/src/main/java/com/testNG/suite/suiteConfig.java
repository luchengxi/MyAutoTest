package com.testNG.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class suiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite运行了1111111");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite运行了44444444");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest运行了222222");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest运行了33333333");
    }
}
