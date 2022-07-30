package com.example.managerstudent;

public class StaffStore extends EmployeeStore{
    protected Float officerSalary;

    public StaffStore(int Id, String name, int age, int month, Float officerSalary) {
        super(Id, name, age, month);
        this.officerSalary = officerSalary;
    }

    public StaffStore() {
    }

    public Float getOfficerSalary() {
        return officerSalary;
    }

    public void setOfficerSalary(Float officerSalary) {
        this.officerSalary = officerSalary;
    }

    @Override
    public String toString() {
        return Id  + ", " + name + ", " + age + ", " + month + ", " + officerSalary;
    }
}

