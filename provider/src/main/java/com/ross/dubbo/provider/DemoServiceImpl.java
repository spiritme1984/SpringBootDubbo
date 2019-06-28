package com.ross.dubbo.provider;

import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import service.DemoService;
//(version="${dubbo.provider.version}")
@Service
public class DemoServiceImpl implements DemoService {

    Logger logger= LoggerFactory.getLogger( DemoServiceImpl.class);
    @Override
    public String sayHello(String name) {
        logger.info("sayHello 方法接受参数{}", name);
        return "Hello " + name + ", I'm a provider, nice to meet you! ";
    }
}
