package com.ukayunnuo.openfeign;

import com.ukayunnuo.commons.TestDemoDto;
import com.ukayunnuo.openfeign.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author ukayunnuo
 * @since 1.0.0
 */
@FeignClient(name = "TestApi", url = "${feign.url}", configuration = FeignConfig.class)
public interface TestApi {


    /**
     * api测试
     *
     * @return {@link String}
     */
    @GetMapping("produce/openfeign/test")
    String apiTest();

    /**
     * api test2
     *
     * @param param 参数
     * @return {@link String}
     */
    @GetMapping("produce/openfeign/test/paramTest/{param}")
    String apiTest2(@PathVariable(value = "param") String param);

    /**
     * post 请求测试
     *
     * @param param 参数
     * @return {@link TestDemoDto}
     */
    @PostMapping("produce/openfeign/test/postTest")
    TestDemoDto postTest(@RequestBody TestDemoDto param);
}
