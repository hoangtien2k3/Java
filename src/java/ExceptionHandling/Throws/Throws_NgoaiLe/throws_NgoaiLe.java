package src.java.ExceptionHandling.Throws.Throws_NgoaiLe;

import java.io.IOException;

class M {
    void method() throws IOException {
        System.out.println("Thiet bi dang hoat dong tot");
    }
}

public class throws_NgoaiLe {
    public static void main(String args[]) throws IOException {
        M m = new M();
        m.method();
        System.out.println("Luong binh thuong...");
    }
}
