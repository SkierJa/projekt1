package pl.gda.wsb.Package1;

public class Phone {
    String model;
    String brand;

    public Phone(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}

