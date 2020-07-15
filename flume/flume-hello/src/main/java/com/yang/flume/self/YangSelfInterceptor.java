package com.yang.flume.self;

import org.apache.flume.Context;
import org.apache.flume.Event;
import org.apache.flume.interceptor.Interceptor;

import java.util.List;

/**
 * @Author: Mu_Yi
 * @Date: 2020/7/15 22:36
 * @Version 1.0
 * @qq: 1411091515
 *
 * 实现 Interceptor 接口,并且重写其方法.
 */


public class YangSelfInterceptor implements Interceptor {


    public void initialize() {

    }

    public Event intercept(Event event) {
        byte[] bodyArr = event.getBody();
        if(bodyArr[0] < 'z' && bodyArr[0] > 'a'){
            event.getHeaders().put("type","letter");
        } else if (bodyArr[0] > '0' && bodyArr[0] < '9'){
            event.getHeaders().put("type","number");
        }
        return event;
    }

    public List<Event> intercept(List<Event> list) {
        for(Event event : list){
            intercept(event);
        }
        return list;
    }

    public void close() {

    }

    public static class Builder implements Interceptor.Builder {

        public Interceptor build() {
            return new YangSelfInterceptor();
        }

        public void configure(Context context) {

        }
    }

}
