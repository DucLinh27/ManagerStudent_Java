package com.example.managerstudent;

public class ManagerStore extends EmployeeStore {
    protected Float managerSalary;

    public ManagerStore(int Id, String name, int age, int month, Float managerSalary) {
        super(Id, name, age, month);
        this.managerSalary = managerSalary;
    }

    public ManagerStore() {
    }

    public Float getManagerSalary() {
        return managerSalary;
    }

    public void setManagerSalary(Float managerSalary) {
        this.managerSalary = managerSalary;
    }

    @Override
    public String toString() {
        return Id  + ", " + name + ", " + age + ", " + month + ", " + managerSalary;
    }

    public int setToMonth (ManagerStore manager)
    {
        int month = 1;
        if(month < 1 || month > 12)
        {
            System.out.println("Error");
        }
        month = manager.getMonth();
        return month;
    }

    public float setToSalary (ManagerStore manager)
    {
        float salary = 1000;
        if(salary < 1000)
        {
            System.out.println("Error");
        }
        salary = manager.getManagerSalary();
        return salary;
    }
}
