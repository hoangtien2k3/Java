package src.java.JavaCore.Conversion;

public class Int_to_String {
    public static void main(String args[]){
        int i=200;
        String s=String.valueOf(i);
        System.out.println(i+100);//300 because + is binary plus operator
        System.out.println(s+100);//200100 because + is string concatenation operator
    }
}
