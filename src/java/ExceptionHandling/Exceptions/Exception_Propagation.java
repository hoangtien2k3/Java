package src.java.ExceptionHandling.Exceptions;

public class Exception_Propagation {
    void m(){
        int data=50/0;
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handled");}
    }
    public static void main(String args[]){
        Exception_Propagation obj=new Exception_Propagation();
        obj.p();
        System.out.println("normal flow...");
    }
}
