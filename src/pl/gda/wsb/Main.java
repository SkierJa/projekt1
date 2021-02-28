package pl.gda.wsb;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello World!");

	Human human1 = new Human("Jan", "Nowak","Janitor",46);
	Human human2 = new Human("Maciej", "Sierpinski","QA",32);
	Human human3 = new Human("Robert", "Nowik","QA",19);
    Animal animal1 = new Animal("Tiger","Asia",130);
    Animal animal2 = new Animal("Elephant","Africa",1800);
    Phone phone1 = new Phone("Galaxy S10+","Samsung");
    Phone phone2 = new Phone("iPhone 6s","Apple");

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
}
}
