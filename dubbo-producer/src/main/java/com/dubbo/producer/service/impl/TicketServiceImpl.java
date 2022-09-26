package com.dubbo.producer.service.impl;


//import com.dubbo.api.service.TicketService;
import com.dubbo.producer.service.TicketService;
import org.apache.dubbo.config.annotation.Method;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author: justin
 * @date: 2022/9/8
 */
//应用启动起来，dubbo就会扫描指定的包下带有@component注解的服务，将它发布在指定的注册中心中！
//將容器發布出去
@Service(interfaceClass = TicketService.class, loadbalance = "random",
methods = {
        @Method(name = "getTicket", loadbalance = "leastActive")
        })
@Component
public class TicketServiceImpl implements TicketService {

    @Value("${dubbo.protocol.port}")
    private String dubboPort;

    @Override
    public String getTicket() {
        String value = UUID.randomUUID().toString();
        return "dubbo port=" + dubboPort + ", 給你一張票:"+ value;
    }
}
