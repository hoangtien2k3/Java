package src.java.ExceptionHandling.Exceptions;

public class UncheckException {
    public static void main(String[] args) {
        printArray();
    }

    private static void printArray() {
        int[] array = new int[1];
        System.out.println(array[1]);
    }
}
