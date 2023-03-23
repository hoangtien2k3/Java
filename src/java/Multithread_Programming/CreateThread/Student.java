package src.java.Multithread_Programming.CreateThread;

public class Student implements Runnable{
    private int times;
    private String name;

    public Student(int times, String name) {
        this.times = times;
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 0; i < this.times; i++) {
            System.out.print(this.name);
        }
    }
}
