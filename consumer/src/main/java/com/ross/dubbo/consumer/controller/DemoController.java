package com.ross.dubbo.consumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import service.DemoService;

@RestController
@RequestMapping("/dubbo")
public class DemoController {

    Logger logger= LoggerFactory.getLogger( DemoController.class);

    //(version="${dubbo.consumer.version}")
    @Reference
    private DemoService dermoService;

    @GetMapping(value = "/sayHello")
    @ResponseBody
    public String sayHello(String name){
        logger.info("客户端调用sayHello方法，传入参数为{}", name);
        return dermoService.sayHello(name);
    }
}
