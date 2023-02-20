package src.java.ExceptionHandling.Throws;

public class test_Throws {
    // defining a user-defined method
    // which throws ArithmeticException
    static void method() throws ArithmeticException {
        System.out.println("Inside the method()");
        throw new ArithmeticException("throwing ArithmeticException");
    }

    //main method
    public static void main(String args[]) {
        try {
            method();
        }
        catch(ArithmeticException e) {
            System.out.println("caught in main() method");
        }
    }
}
