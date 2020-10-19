package com.hcf.head.first.design.pattern.chapter11.dymicproxy;

import java.lang.reflect.Proxy;

public class OwnerDynamicProxy extends DynamicProxyFactory {
    @Override
    public PersonBean createProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(), new OwnerInvocationHandler(personBean));
    }
}
