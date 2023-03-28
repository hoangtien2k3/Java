package src.java.Java8.DefaultMethods;

public interface Vehicle {
    String getBrand();

    default String turnAlarmOn() {
        return "Turning the vehicle alarm on.";
    }

    default String turnAlarmOff() {
        return "Turning the vehicle alarm off.";
    }
}
