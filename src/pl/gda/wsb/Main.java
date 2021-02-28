package pl.gda.wsb;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello World!");

	Human human1 = new Human("Jan", "Nowak","Janitor",46);
	Human human2 = new Human("Maciej", "Sierpinski","QA",32);
    Animal animal1 = new Animal("Tiger","Asia",130);
    Animal animal2 = new Animal("Elephant","Africa",1800);
    Phone phone1 = new Phone("Galaxy S10+","Samsung");
    Phone phone2 = new Phone("iPhone 6s","Apple");

    if (animal1.weight > animal2.weight) {
            System.out.println(animal1.name + " is heavier");
        } else {
            System.out.println(animal2.name + " is heavier");
        }
    }
}
