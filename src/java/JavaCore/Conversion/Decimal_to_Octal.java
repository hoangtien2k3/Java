package src.java.JavaCore.Conversion;

public class Decimal_to_Octal{
    //creating method for conversion so that we can use it many times
    public static String toOctal(int decimal){
        int rem; //declaring variable to store remainder
        String octal=""; //declareing variable to store octal
        //declaring array of octal numbers
        char octalchars[]={'0','1','2','3','4','5','6','7'};
        //writing logic of decimal to octal conversion
        while(decimal>0) {
            rem=decimal%8;
            octal=octalchars[rem]+octal;
            decimal=decimal/8;
        }
        return octal;
    }
    public static void main(String args[]){
//Calling custom method to get the octal number of given decimal value
        System.out.println("Decimal to octal of 8 is: "+toOctal(8));
        System.out.println("Decimal to octal of 19 is: "+toOctal(19));
        System.out.println("Decimal to octal of 81 is: "+toOctal(81));

        System.out.println(Integer.toOctalString(8));
        System.out.println(Integer.toOctalString(19));
        System.out.println(Integer.toOctalString(81));

    }
}