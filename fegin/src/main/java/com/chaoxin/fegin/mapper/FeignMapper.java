package com.chaoxin.fegin.mapper;

import com.chaoxin.fegin.config.FeignConfig;
import com.chaoxin.fegin.config.HystrixConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * @author fly
 *
 * FeignClient(value = "EUREKA-SANZU")
 *   value : 被访问集群的名称
 *   postMapping : 你要访问接口的路由地址
 *   RequestParam:表明被访问方法需要的参数
 *
 * fallback : 声明使用熔断器
 * HystrixConfig: 异常之后的回调函数
 *
 */
@Repository
@FeignClient(value = "CLIENT-FEIGN",configuration = FeignConfig.class,fallback = HystrixConfig.class)
public interface FeignMapper {

    @GetMapping("/feign/name")
     String getString(@RequestParam("name") String name);
}
