package com.hcf.head.first.design.pattern.chapter11.dymicproxy;

public class Main {

    public static void main(String[] args) {
        PersonBean personBean = new PersonBeanImpl();

        DynamicProxyFactory dynamicProxyFactory = new OwnerDynamicProxy();
        personBean = dynamicProxyFactory.getPersonBean(personBean);

        personBean.setName("123");
        System.out.println(personBean.getName());

        try {
            personBean.setHotOrNotRanding(10);
        } catch (Exception e) {
            e.printStackTrace();
        }

        dynamicProxyFactory = new NoOwnerDynamicProxy();
        personBean = new PersonBeanImpl();
        personBean = dynamicProxyFactory.getPersonBean(personBean);

        personBean.setHotOrNotRanding(10);
        System.out.println(personBean.getHotOrNotRanding());
        try {
            personBean.setName("123");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class PackageAccess{}
