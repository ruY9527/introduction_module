package com.iyang.design.modle.structure.filters;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author Yang
 * @date 2020/8/7 / 1:25
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(person -> "FEMALE".equalsIgnoreCase(person.getGender())).collect(toList());
    }
}
