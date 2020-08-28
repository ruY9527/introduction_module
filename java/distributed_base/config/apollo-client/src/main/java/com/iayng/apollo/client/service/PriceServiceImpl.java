package com.iayng.apollo.client.service;


import org.springframework.stereotype.Service;

@Service
public class PriceServiceImpl {

    public void task() throws Exception{
        System.out.println("------111111---------");
        Thread.sleep(1000);
    }

    public String task2() throws Exception {
        int k  = 1;
        System.out.println("-------222222-----");
        Thread.sleep(1000);
        return k + "";
    }

}
