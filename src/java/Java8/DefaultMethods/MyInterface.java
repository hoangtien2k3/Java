package src.java.Java8.DefaultMethods;

public interface MyInterface {
    void regularMethod();

    default void defaultMethod() {
        System.out.println("This is default method.");
    }
}
