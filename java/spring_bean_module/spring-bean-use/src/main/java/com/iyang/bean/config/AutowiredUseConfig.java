package com.iyang.bean.config;

/**
 * @author Yang
 * @date 2020/8/11 / 15:02
 *
 *  Autowired 注解的使用方式
 */
public class AutowiredUseConfig {

    /**
     * 1: 标注在 set 方法上注入
     * @Autowired
     * public void setDao(Dao dao){
     *     this.dao = dao
     * }
     *
     * 2: 标注在构造方法上注入
     * @Autowired
     * public Dao(Dao dao){
     *     this.dao = dao;
     * }
     *
     */


}
