package com.ukayunnuo.produce.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ukayunnuo
 * @since 1.0.0
 */
@Slf4j
@RestController
@RequestMapping("produce/openfeign/test")
public class OpenfeignTestController {

    @GetMapping()
    public String apiTest() {
        log.info("open-feign 调用成功");
        return "open-feign 调用成功";
    }

    @GetMapping("paramTest/{param}")
    public String apiTest2(@PathVariable String param) {
        log.info("open-feign 调用成功 param:{}", param);
        return "open-feign 调用成功 param: " + param;
    }
}
