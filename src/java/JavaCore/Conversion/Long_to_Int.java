package src.java.JavaCore.Conversion;

public class Long_to_Int {
    public static void main(String args[]){
        long l = 500;
        int i = (int)l;
        System.out.println(i);

        Long l1 = new Long(10);
        int j = l1.intValue();
        System.out.println(j);

    }
}
