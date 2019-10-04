package com.test.impl;

import com.api.GmailService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class GmailServiceImpl implements GmailService {

    public void initOrder(String name) {
        System.out.println("你的名字是" + name);
    }

    public List<String> getOrder() {
        List<String> orderList = new ArrayList<String>();
        orderList.add("订单模块");
        orderList.add("无脑模块");
        return orderList;
    }
}
