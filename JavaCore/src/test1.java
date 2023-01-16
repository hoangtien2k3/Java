package src;

class supperClass {
    int x = 10;
}

class subClass extends supperClass{
    int x = 20;
}

public class test1 {
    public static void main(String[] args) {
        supperClass a = new subClass();
        System.out.println(a.x);
        System.out.println(((subClass) a).x);
    }
}
