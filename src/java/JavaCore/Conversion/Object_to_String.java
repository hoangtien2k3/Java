package src.java.JavaCore.Conversion;

class Emp{}

public class Object_to_String {
    public static void main(String args[]){
        Emp e=new Emp();
        String s=e.toString();
        String s2=String.valueOf(e);
        System.out.println(s);
        System.out.println(s2);
    }
}
