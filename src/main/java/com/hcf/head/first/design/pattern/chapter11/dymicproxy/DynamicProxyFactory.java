package com.hcf.head.first.design.pattern.chapter11.dymicproxy;

import java.lang.reflect.Proxy;

public abstract class DynamicProxyFactory {

    public PersonBean getPersonBean(PersonBean personBean) {
        return createProxy(personBean);
    }

    protected abstract PersonBean createProxy(PersonBean personBean);
}
