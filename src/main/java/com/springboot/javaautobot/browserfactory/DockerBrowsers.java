package com.springboot.javaautobot.browserfactory;

import com.springboot.javaautobot.properties.DockerHubDetails;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;

import java.net.MalformedURLException;
import java.net.URL;

@Lazy
@Configuration
@Profile("docker")
public class DockerBrowsers {
    @Autowired
    private DockerHubDetails hub;

    @Lazy
    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "chrome")
    public WebDriver chrome() throws MalformedURLException {
        System.out.println("http://" + hub.getHost() + ":" + hub.getPort() + "/wd/hub");
        return new RemoteWebDriver(new URL("http://" + hub.getHost() + ":" + hub.getPort() + "/wd/hub"),
                DesiredCapabilities.chrome());
    }

    @Lazy
    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    public WebDriver firefox() throws MalformedURLException {
        return new RemoteWebDriver(new URL("http://" + hub.getHost() + ":" + hub.getPort() + "/wd/hub"),
                DesiredCapabilities.firefox());
    }
}