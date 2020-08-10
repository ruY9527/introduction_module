package com.iyang.design.modle.structure.filters;

import java.util.List;

/**
 * @author Yang
 * @date 2020/8/7 / 1:23
 *
 *   过滤器设计模式. 可以使用来进行过滤操作.
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);

}
