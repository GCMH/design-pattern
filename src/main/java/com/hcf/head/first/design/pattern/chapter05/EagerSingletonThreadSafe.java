package com.hcf.head.first.design.pattern.chapter05;

public class EagerSingletonThreadSafe {

    private static EagerSingletonThreadSafe eagerSingletonThreadSafe = new EagerSingletonThreadSafe();

    public static EagerSingletonThreadSafe getInstance(){
        return eagerSingletonThreadSafe;
    }
}
