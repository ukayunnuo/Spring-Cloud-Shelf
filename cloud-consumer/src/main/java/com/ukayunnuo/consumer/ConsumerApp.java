package com.ukayunnuo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 消费者 启动类
 *
 * @author ukayunnuo
 * @since 1.0.0
 */
@EnableFeignClients(basePackages = {"com.ukayunnuo"})
@SpringBootApplication(scanBasePackages = {"com.ukayunnuo"})
public class ConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApp.class, args);
    }
}
