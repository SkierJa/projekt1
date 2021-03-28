package pl.gda.wsb;
import pl.gda.wsb.Package1.Car;
import pl.gda.wsb.Package1.Phone;

import java.util.ArrayList;

public class Main {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
	System.out.println("Hello World!");

	Human human1 = new Human("Jan", "Nowak","Janitor",46);
	Human human2 = new Human("Maciej", "Sierpinski","QA",32);
	Human human3 = new Human("Robert", "Nowik","QA",19);
	Human human4 = new Human("Adam", "Kruczy","Manager",26);
    Animal animal1 = new Animal("Tiger","Asia");
    Animal animal2 = new Animal("Elephant","Africa");
    Phone phone1 = new Phone("Galaxy S10+","Samsung");
    Phone phone2 = new Phone("iPhone 6s","Apple");
    Car car1 = new Car ("Astra", Producer.Opel);
    human1.car=car1;
    human1.pet=animal1;
    if (animal1.weight > animal2.weight) {
            System.out.println(animal1.name + " is heavier");
        } else {
            System.out.println(animal2.name + " is heavier");
        }

    if (human1.age > human2.age) {
        System.out.println(human1.firstName + " is older");
    } else {
        System.out.println(human2.firstName + " is older");
    }
    StringBuilder animaldesc = new StringBuilder("The heaviest animal is "). append(animal2.name);
    System.out.println(animaldesc);

        ArrayList<Human> humanList= new ArrayList<>();
        humanList.add(human1);
        humanList.add(human2);
        humanList.add(human3);
        for (Human human : humanList){System.out.println(human.firstName);}
        animal1.feed();
        animal2.takeForAWalk();
        if (human3.equals(human4)) {System.out.println("TRUE");} else {System.out.println("FALSE");}
        System.out.println(human1);
        System.out.println(car1);
        System.out.println(animal1);
        System.out.println(phone1);
        System.out.println("Salary: " + human1.getSalary());
        human1.setSalary(10000.0);
}

}
