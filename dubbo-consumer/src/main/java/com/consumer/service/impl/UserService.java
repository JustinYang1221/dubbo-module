package com.consumer.service.impl;

//import com.dubbo.api.service.TicketService;
import com.dubbo.producer.service.TicketService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author: justin
 * @date: 2022/9/11
 */


@Service
public class UserService {

    @Reference //遠程引用指定的服務, 按照全類名稱進行匹配, 看誰跟註冊中心註冊了這個名稱
    TicketService ticketService;

    public void buyTicket(){
        String ticket = ticketService.getTicket();
        System.out.println("向服務方買到票ticketId:"+ ticket);
    }
}
