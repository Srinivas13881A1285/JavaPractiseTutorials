package com.company.lamdasandstreams;

public class Employee1 {
    private String firstName;
    private String lastName;
    private String departMent;
    private double salary;


    public Employee1(String firstName, String lastName, String departMent, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.departMent = departMent;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartMent() {
        return departMent;
    }

    public void setDepartMent(String departMent) {
        this.departMent = departMent;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getName(){
        return String.format("%s %S",getFirstName(),getLastName());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", departMent='" + departMent + '\'' +
                ", salary=" + salary +
                '}';
    }
}
