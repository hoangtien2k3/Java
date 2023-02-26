package src.java.ExceptionHandling.Throws.Try_Catch;

import java.io.IOException;

class M {
    void method() throws IOException {
        throw new IOException("Loi thiet bi");
    }
}

public class TestThrows {
    public static void main(String args[]) {
        try {
            M m = new M();
            m.method();
        } catch (Exception e) {
            System.out.println("Ngoai le duoc xu ly");
        }

        System.out.println("Luong binh thuong...");
    }
}
