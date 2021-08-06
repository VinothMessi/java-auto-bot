package com.springboot.javaautobot.tests;

import com.google.common.util.concurrent.Uninterruptibles;
import com.springboot.javaautobot.BaseTest;
import com.springboot.javaautobot.properties.DockerHubDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VisaRegistration extends BaseTest {

    @Test
    public void visaRegistration() {
        System.out.println("Visa Registration Test");
        browser.get("http://www.google.com");
        System.out.println("Page Title:" + browser.getTitle());
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        browser.quit();
    }
}