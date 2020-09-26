package com.hcf.head.first.design.pattern.chapter05;

public class LazySingletonThreadSafe {

    private static volatile LazySingletonThreadSafe lazySingletonThredUnsafe;

    private LazySingletonThreadSafe() {
    }

    //双校锁效率较高
    public static LazySingletonThreadSafe getInstance() {
        if (lazySingletonThredUnsafe == null) {
            synchronized (LazySingletonThreadSafe.class) {
                if (lazySingletonThredUnsafe == null) {
                    lazySingletonThredUnsafe = new LazySingletonThreadSafe();
                }
            }
        }
        return lazySingletonThredUnsafe;
    }

    //同步方法效率较低
    public static synchronized LazySingletonThreadSafe getInstance_() {
        if (lazySingletonThredUnsafe == null) {
            lazySingletonThredUnsafe = new LazySingletonThreadSafe();
        }
        return lazySingletonThredUnsafe;
    }
}
