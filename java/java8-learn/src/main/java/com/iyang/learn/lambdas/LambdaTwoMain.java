package com.iyang.learn.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Yang on 2020/9/14 0:32
 */

public class LambdaTwoMain {

    public static void main(String[] args) {

        new LambdaTwoMain().filterStrFun();
        new LambdaTwoMain().trimStr();

    }

    public void filterStrFun(){

        List<String> list = Arrays.asList("Hello", "atguigu", "Lambda", "www", "ok");
        List<String> filterStr = filterStr(list, s -> s.length() > 3);
        System.out.println(filterStr);

    }

    public List<String> filterStr(List<String> list, Predicate<String> pre){
        List<String> strList = new ArrayList<>();
        list.stream().forEach(s -> {
            if(pre.test(s)){
                strList.add(s);
            }
        });
        return strList;
    }

    public void trimStr(){
        String handleStr = handleStr("\t\t\t我就是我", str -> str.trim());
        System.out.println(handleStr);

    }

    public String handleStr(String str, Function<String,String> fun){
        return fun.apply(str);
    }


}



