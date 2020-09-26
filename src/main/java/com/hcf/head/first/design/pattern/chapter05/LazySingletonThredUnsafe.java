package com.hcf.head.first.design.pattern.chapter05;

public class LazySingletonThredUnsafe {

    private static LazySingletonThredUnsafe lazySingletonThredUnsafe;

    private LazySingletonThredUnsafe(){}

    public static LazySingletonThredUnsafe getInstance(){
        //此处线程不安全
        if(lazySingletonThredUnsafe == null){
            lazySingletonThredUnsafe = new LazySingletonThredUnsafe();
        }
        return lazySingletonThredUnsafe;
    }

}
