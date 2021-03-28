package pl.gda.wsb;

public class Human {
    String firstName;
    String lastName;
    String position;
    int age;
    Animal pet;
    Car car;


    public Human(String firstName,
                 String lastName,
                 String position,
                 int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.age = age;
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



