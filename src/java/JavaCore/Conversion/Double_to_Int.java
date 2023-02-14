package src.java.JavaCore.Conversion;

public class Double_to_Int {
    public static void main(String args[]){
        double d = 10.5;
        int i = (int)d;
        System.out.println(i);

        Double d1 = new Double(10.5);
        int j = d1.intValue();
        System.out.println(j);

    }
}
