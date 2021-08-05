package com.springboot.javaautobot.browserfactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;

@Lazy
@Configuration
@Profile("local")
public class LocalBrowsers {
    @Lazy
    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "chrome")
    public WebDriver chrome() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    @Lazy
    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "headlessChrome")
    public WebDriver headlessChrome() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        return new ChromeDriver(options);
    }

    @Lazy
    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    public WebDriver firefox() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    @Lazy
    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "headlessFirefox")
    public WebDriver headlessFirefox() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
        return new FirefoxDriver(options);
    }

    @Lazy
    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "edge")
    public WebDriver edge() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }
}