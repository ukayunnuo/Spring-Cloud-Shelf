package com.ukayunnuo.produce.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 生产者测试接口
 *
 * @author ukayunnuo
 * @since 1.0.0
 */
@Slf4j
@RequestMapping("produce/test")
@RestController
public class TestController {

    @GetMapping("{param}")
    public void test(@PathVariable String param) {
        log.info("test: {}", param);
    }


}
