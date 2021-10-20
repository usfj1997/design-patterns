package com.company;
//Lazy instantiation.
public class SingletonTestLazyInstantiation {
    private static SingletonTestLazyInstantiation st;

    //Private Constructor
    private SingletonTestLazyInstantiation() {
    }

    //Global Access Point
    public static SingletonTestLazyInstantiation getInstance() {//do not have thread safe.
        if (st==null){
            st=new SingletonTestLazyInstantiation();
        }
        return st;
    }
}
