package com;

import com.api.GmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Test {

    @Autowired
    private GmailService gmailService;

    public void printGmail(){
        gmailService.initOrder("你好");
    }

    public void printOrder(){
        List<String> orderList = gmailService.getOrder();
        for(String order : orderList){
            System.out.println(order);
        }
    }

}
