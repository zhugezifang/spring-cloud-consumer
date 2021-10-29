package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Feign远程接口
 */
@FeignClient("zk-provider")
public interface HelloClient {

    @GetMapping("/discovery")
    public String discovery();
}
