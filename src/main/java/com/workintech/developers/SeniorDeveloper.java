package com.workintech.developers;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name , salary);
    }
    @Override
    public void work(){
        System.out.println("Employee starts to working as a SeniorDeveloper");
    }
    public void work(double salary){
        System.out.println("Employee starts to working as a SeniorDeveloper");
        setSalary(salary);
    }
}
