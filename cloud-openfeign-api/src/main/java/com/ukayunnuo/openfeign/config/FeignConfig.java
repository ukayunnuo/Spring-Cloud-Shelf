package com.ukayunnuo.openfeign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * openfeign 配置
 *
 * @author ukayunnuo
 * @date 2023-07-07
 */

@Configuration
public class FeignConfig {

	@Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}
