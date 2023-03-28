package src.java.Java8.DefaultMethods;

public class Car implements Vehicle{
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return brand;
    }

}
