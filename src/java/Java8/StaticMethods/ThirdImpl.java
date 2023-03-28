package src.java.Java8.StaticMethods;

public class ThirdImpl implements ThirdInterface{
    public boolean isNull(String string) {
        System.out.println("Impl Null Check");
        return string == null ? true : false;
    }
}
