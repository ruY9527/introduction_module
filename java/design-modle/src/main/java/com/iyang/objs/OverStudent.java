package com.iyang.objs;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yang on 2020/9/25 0:10
 */

public class OverStudent {

    private String name;
    private int age;

    public OverStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        OverStudent s = (OverStudent) obj;
        return s.name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    /**
     * 这里如果只重写一个hashCode方法的话,那么map中put进去的元素就是二个,而重写了hashCode和equals方法的话,
     * 那么put进去的元素就是二个.
     * @param args
     */
    public static void main(String[] args) {

        OverStudent s1 = new OverStudent("fo",11);
        OverStudent s2 = new OverStudent("fo",22);
        Map<OverStudent,String> map = new HashMap<>();
        map.put(s1,"s1");
        map.put(s2,"s2");
        System.out.println(map.size());

    }

}
