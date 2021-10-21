package com.company;

public class EmployeesFacade {
    private IEmployees fdiv;
    private IEmployees tdiv;
    private IEmployees sdiv;

    public EmployeesFacade(){
        fdiv=new FinanceDivision();
        tdiv=new TechnicalDivision();
        sdiv=new SecurityDivision();
    }

    public void getBonusesFinance() {
        fdiv.calculateBonus();
    }

    public void getBonusesTechnical() {
        tdiv.calculateBonus();
    }

    public void getBonusesSecurity() {
        sdiv.calculateBonus();
    }
}
