package com.hcf.head.first.design.pattern.chapter11.dymicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NoOwnerInvocationHandler implements InvocationHandler {

    private PersonBean personBean;

    public NoOwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("get")) {
            return method.invoke(personBean, args);
        }
        if (method.getName().equals("setHotOrNotRanding")) {
            return method.invoke(personBean, args);
        }
        if (method.getName().startsWith("set")) {
            throw new UnsupportedClassVersionError();
        }
        return null;
    }
}
