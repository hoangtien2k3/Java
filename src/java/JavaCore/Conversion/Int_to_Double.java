package src.java.JavaCore.Conversion;

public class Int_to_Double {
    public static void main(String args[]){
        int i = 200;
        double d = i;
        System.out.println(d);

        Double d1 = new Double(i);//first way
        Double d2 = Double.valueOf(i);//second way
        System.out.println(d1);
        System.out.println(d2);

    }
}
