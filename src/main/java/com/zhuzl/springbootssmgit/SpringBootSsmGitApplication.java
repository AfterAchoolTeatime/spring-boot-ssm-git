package com.zhuzl.springbootssmgit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringBootSsmGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSsmGitApplication.class, args);
    }
}
