package com.springboot.javaautobot.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Lazy
@Configuration
@ConfigurationProperties("docker-hub")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DockerHubDetails {
    private String host;
    private int port;
}