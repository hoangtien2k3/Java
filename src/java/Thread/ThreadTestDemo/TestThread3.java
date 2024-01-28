package Thread.ThreadTestDemo;

class Account implements Runnable {
    private int balance = 1000;

    @Override
    public void run() {
        withDraw();
    }

    private void withDraw() {
        try {
            balance -= 1000;

            System.out.println(Thread.currentThread().getName());
            Thread.sleep(3000);

            if (balance < 0) {
                System.out.println("Het tien");
            } else {
                System.out.println("OKE");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class TestThread3 {
    public static void main(String[] args) {
        Account account = new Account();

        Thread t1 = new Thread(account);
        Thread t2 = new Thread(account);
        Thread t3 = new Thread(account);

        t1.start();
        t2.start();
        t3.start();
    }

}
