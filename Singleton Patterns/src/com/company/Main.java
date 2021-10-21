package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SingletonTestLazyInstantiation.getInstance();

        EmployeesFacade ef = new EmployeesFacade();
        ef.getBonusesFinance();
        ef.getBonusesTechnical();
        ef.getBonusesSecurity();
    }
}
