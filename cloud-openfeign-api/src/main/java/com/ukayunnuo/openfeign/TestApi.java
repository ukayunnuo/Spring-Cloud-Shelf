package com.ukayunnuo.openfeign;

import com.ukayunnuo.openfeign.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
}
