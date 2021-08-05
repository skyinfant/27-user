package com.tomorrowcat.userapp;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tomorrowcat.userapp.mapper")
@EnableDubboConfig
@DubboComponentScan("com.tomorrowcat.userapp.service.dubbo")
public class UserAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(UserAppApplication.class, args);

        //JVM优雅关闭   7.5
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("执行JVM ShutdownHook！！");
            }
        }));
    }

}
