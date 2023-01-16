package src.Bai2;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Hoang Anh Tien", 12345, 12);
        manager.display();

        System.out.println();

        Manager m = new Manager("Chung", 54321, 17);
        System.out.println(m);
    }
}
