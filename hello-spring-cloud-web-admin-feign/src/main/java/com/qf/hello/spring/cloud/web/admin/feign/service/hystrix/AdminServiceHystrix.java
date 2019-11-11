package com.qf.hello.spring.cloud.web.admin.feign.service.hystrix;

import com.qf.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @Author: 吴
 * @Date: 2019/11/8 17:31
 */



@Component
public class AdminServiceHystrix implements AdminService {

    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}