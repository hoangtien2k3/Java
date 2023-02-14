package src.java.JavaCore.Conversion;

public class Int_to_Long {
    public static void main(String args[]){
        int i=200;
        long l=i;
        System.out.println(l);


        Long l1 = new Long(i);      //first way
        Long l2 = Long.valueOf(i);  //second way
        System.out.println(l1);
        System.out.println(l2);

    }
}
