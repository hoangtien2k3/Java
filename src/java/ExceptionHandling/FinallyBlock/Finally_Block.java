package src.java.ExceptionHandling.FinallyBlock;

public class Finally_Block {
    public static void main(String[] args) {
        try {

            System.out.println("Inside try block");

            //below code throws divide by zero exception
            int data=25/0;
            System.out.println(data);
        }

        //handles the Arithmetic Exception / Divide by zero exception
        catch(ArithmeticException e){
            System.out.println("Exception handled");
            System.out.println(e);
        }

        //executes regardless of exception occured or not
        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("rest of the code...");
    }

}
