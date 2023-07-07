package com.ukayunnuo.produce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 生产者 启动类
 *
 * @author ukayunnuo
 * @since 1.0.0
 */
@SpringBootApplication(scanBasePackages = {"com.ukayunnuo"})
public class ProduceApp {

    public static void main(String[] args) {
        SpringApplication.run(ProduceApp.class, args);
    }
}
