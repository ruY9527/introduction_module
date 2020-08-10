package com.iyang.design.modle.structure.filters;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Yang
 * @date 2020/8/7 / 1:23
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(person -> "MALE".equalsIgnoreCase(person.getGender())).collect(Collectors.toList());
    }
}
