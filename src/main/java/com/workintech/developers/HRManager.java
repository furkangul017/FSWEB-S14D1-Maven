package com.workintech.developers;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id,name,salary);
        this.juniorDevelopers = new JuniorDeveloper[25];
        this.midDevelopers = new MidDeveloper[25];
        this.seniorDevelopers = new SeniorDeveloper[25];
    }
    @Override
    public void work(){
        System.out.println("Employee starts to working as a HRManager");
    }

    public void work(double salary){
        System.out.println("Employee starts to working as a HRManager");
        setSalary(salary);
    }

    public void addEmployee(JuniorDeveloper juniorDeveloper){
        for(int i = 0 ; i < juniorDevelopers.length ; i++){
            if(juniorDevelopers[i] == null){
                juniorDevelopers[i] = juniorDeveloper;
                return;
            }
        }
        System.out.println("Dizi alanı yetersiz!");
    }

    public void addEmployee(MidDeveloper midDeveloper){
        for(int i = 0 ; i < midDevelopers.length ; i++){
            if(midDevelopers[i] == null){
                midDevelopers[i] = midDeveloper;
                return;
            }
        }
        System.out.println("Dizi alanı yetersiz!");
    }

    public void addEmployee(SeniorDeveloper seniorDeveloper){
        for(int i = 0 ; i < seniorDevelopers.length; i++){
            if(seniorDevelopers[i] == null){
                seniorDevelopers[i] = seniorDeveloper;
                return;
            }

        }
        System.out.println("Dizi alanı yetersiz!");
    }
}
