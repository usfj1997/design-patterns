package com.company;

public class ThreadSafeLazySingleton {
    private static ThreadSafeLazySingleton st;

    //private constructor
    private ThreadSafeLazySingleton(){}

    //public access point using synchronized keyword
    public static synchronized ThreadSafeLazySingleton getInstance() {
        if (st==null){
            st=new ThreadSafeLazySingleton();
        }
        return st;
    }
}
