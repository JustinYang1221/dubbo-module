package com;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: justin
 * @date: 2022/9/8
 */

@SpringBootApplication
@EnableDubbo
public class Producer2Application {
    public static void main(String[] args){
        SpringApplication.run(Producer2Application.class, args);
    }
}
