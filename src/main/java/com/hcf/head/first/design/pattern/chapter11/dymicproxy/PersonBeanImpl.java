package com.hcf.head.first.design.pattern.chapter11.dymicproxy;

import lombok.Data;

@Data
public class PersonBeanImpl implements PersonBean{
    public String name;
    public String gender;
    public String interests;
    public int hotOrNotRanding;

}
