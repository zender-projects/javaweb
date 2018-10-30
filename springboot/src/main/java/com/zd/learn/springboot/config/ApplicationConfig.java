package com.zd.learn.springboot.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.PropertySource;

/**
 * 应用程序配置入口.
 * @author zhangdong
 * */
@PropertySource("classpath:book.properties")
@PropertySource("classpath:my.properties")
@SpringBootConfiguration
public class ApplicationConfig {
}
