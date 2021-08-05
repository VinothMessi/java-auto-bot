package com.springboot.javaautobot;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

@SpringBootTest
public class BaseTest extends AbstractTestNGSpringContextTests {
    @Autowired
    protected WebDriver browser;

    @BeforeTest
    public void setUp() {
        System.out.println("Before Each Test Tag");
    }

    @AfterTest
    public void tearDown() {
        System.out.println("After Each Test Tag");
    }
}