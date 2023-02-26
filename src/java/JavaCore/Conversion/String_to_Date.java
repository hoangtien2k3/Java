package src.java.JavaCore.Conversion;

import java.text.SimpleDateFormat;
import java.util.Date;

public class String_to_Date {
    public static void main(String[] args)throws Exception {
        String sDate1="12/04/2003";
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        System.out.println(sDate1+"\t"+date1);
    }
}
