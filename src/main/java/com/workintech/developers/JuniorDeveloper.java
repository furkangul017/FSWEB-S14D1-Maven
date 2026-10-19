package com.workintech.developers;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(long id , String name , double salary ){
        super(id ,name, salary);
    }
    @Override
    public void work(){
        System.out.println("Employee starts to working as a JuniorDeveloper");
    }

    public void work(double salary){
        System.out.println("Employee starts to working as a JuniorDeveloper");
        setSalary(salary);
    }
}
