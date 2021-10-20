package com.company;

public class SingletonTestEagerInstantiation {
    private static SingletonTestEagerInstantiation st = new SingletonTestEagerInstantiation();

    //Private constructor

    private SingletonTestEagerInstantiation() {
    }

    //Public access point

    public static SingletonTestEagerInstantiation getInstance(){
        return st;
    }
}
