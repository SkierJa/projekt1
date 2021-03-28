package pl.gda.wsb;

public class Animal {
    String name;
    String region;
    final String species = null;
    public Double weight;
    Double DefaultTiger=200.0;
    Double DefaultElephant=2000.0;

    public void feed() {weight+=1; System.out.println("Weight incresed!");}
    public void takeForAWalk() {weight-=1; System.out.println("Weight decresed!");}


    public Animal(String name, String region) {
        this.name = name;
        this.region = region;
        if (name.equals("Tiger")) { weight=DefaultTiger;}
            else if (name.equals("Elephant")) { weight=DefaultElephant;}


    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", species='" + species + '\'' +
                ", weight=" + weight +
                ", DefaultTiger=" + DefaultTiger +
                ", DefaultElephant=" + DefaultElephant +
                '}';
    }
}
