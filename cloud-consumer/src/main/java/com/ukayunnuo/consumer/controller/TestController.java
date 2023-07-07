package com.ukayunnuo.consumer.controller;

import com.ukayunnuo.commons.TestDemoDto;
import com.ukayunnuo.openfeign.TestApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 消费者 测试接口
 *
 * @author ukayunnuo
 * @since 1.0.0
 */
@Slf4j
@RequestMapping("consumer/test")
@RestController
public class TestController {

    @Resource
    private TestApi testApi;

    @GetMapping("{param}")
    public void test(@PathVariable String param) {
        log.info("test: {}", param);
    }


    @GetMapping("setTestApi")
    public String setTestApi(){
        return testApi.apiTest();
    }

    @GetMapping("setTestApi2/{param}")
    public String setTestApi2(@PathVariable String param){
        return testApi.apiTest2(param);
    }
    @PostMapping("postTest")
    public TestDemoDto postTest(@RequestBody TestDemoDto param){
        return testApi.postTest(param);
    }

}
