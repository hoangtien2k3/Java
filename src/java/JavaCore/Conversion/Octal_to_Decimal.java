package src.java.JavaCore.Conversion;

public class Octal_to_Decimal {
    public static void main(String args[]){
        String octalString="121";
        int decimal=Integer.parseInt(octalString,8);
        System.out.println(decimal);


        System.out.println(Integer.parseInt("121",8));
        System.out.println(Integer.parseInt("23",8));
        System.out.println(Integer.parseInt("10",8));

    }
}
