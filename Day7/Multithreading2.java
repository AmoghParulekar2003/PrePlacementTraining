class MyThread2 implements Runnable {
    public void run() {
        for (int i=1; i <= 10; ++i) {
            System.out.println("Child Thread");
        }
    }
}

public class Multithreading2 {
    public static void main(String[] args) {
        MyThread2 m = new MyThread2();
        Thread t = new Thread(m);
        t.start();
        for (int i=1; i <= 10; ++i) {
            System.out.println("Child Thread");
        }
    }
}
