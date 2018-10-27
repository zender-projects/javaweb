package com.zd.learn.springboot.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ToString
@Component
@ConfigurationProperties(prefix = "my")
public class MyInfo {
    private String name;
    private Integer age;
    private String location;
    private String work;
}
