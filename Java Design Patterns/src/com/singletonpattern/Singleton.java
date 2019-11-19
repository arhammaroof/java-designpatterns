package com.singletonpattern;

public class Singleton {
    //early initialization
    //for thread safety
    private static Singleton obj = new Singleton() ;

    private Singleton() {}

    public static Singleton getInstance()
    {
//        if (obj==null)
//            obj = new Singleton();
        return obj;
    }
}

