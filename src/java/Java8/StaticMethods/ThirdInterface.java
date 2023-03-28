package src.java.Java8.StaticMethods;

public interface ThirdInterface {
    default void print(String string) {
        if (!isNull(string))
            System.out.println("ThirdInterface Print::" + string);
    }

    static boolean isNull(String string) {
        System.out.println("Interface Null Check");
        return string == null ? true : "".equals(string) ? true : false;
    }
}
