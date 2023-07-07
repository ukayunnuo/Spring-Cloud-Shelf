package com.ukayunnuo.produce.controller;

import com.alibaba.fastjson2.JSONObject;
import com.ukayunnuo.commons.TestDemoDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/postTest")
    public TestDemoDto postTest(@RequestBody TestDemoDto param){
        log.info("open-feign 调用成功 param:{}", JSONObject.toJSONString(param));
        return param;
    }
}
