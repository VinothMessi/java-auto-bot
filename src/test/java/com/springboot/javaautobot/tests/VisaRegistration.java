package com.springboot.javaautobot.tests;

import com.google.common.util.concurrent.Uninterruptibles;
import com.springboot.javaautobot.BaseTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VisaRegistration extends BaseTest {
    @Test
    public void visaRegistration() {
        System.out.println("Visa Registration Test");
        browser.get("http://www.google.com");
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        browser.quit();
    }
}