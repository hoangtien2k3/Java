package src.java.Java8.DefaultMethods;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Car("Vinfast");
        System.out.println(v.getBrand());
        System.out.println(v.turnAlarmOn());
        System.out.println(v.turnAlarmOff());
    }
}
