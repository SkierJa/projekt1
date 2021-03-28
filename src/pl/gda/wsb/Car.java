package pl.gda.wsb;

public class Car {
    String color;
    final String model;
    final Producer producer;


    public Car(String model, Producer producer) {
        this.model = model;
        this.producer = producer;


    }
}
