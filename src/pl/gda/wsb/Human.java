package pl.gda.wsb;

import pl.gda.wsb.Package1.Car;

import java.util.Date;

public class Human {
    String firstName;
    String lastName;
    String position;
    int age;
    Animal pet;
    Car car;
    private Double salary;


    public Human(String firstName,
                 String lastName,
                 String position,
                 int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.age = age;
        this.salary=salary;
    }

    public Double getSalary() {
        System.out.println("Sprawdzano dnia " + new Date() + this);
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {System.out.println("Nikt nie będzie dokładał!");}
        else {System.out.println("Dane zostały wysłane do bankowości!"); System.out.println("Aneks do odebrania!");}
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                ", car='" + car + '\'' +
                '}';
    }
}



