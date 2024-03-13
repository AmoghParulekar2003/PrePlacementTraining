class A {
    public static synchronized void print(String name) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Batting = "+name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class MyThread6 extends Thread {
    public void run() {
        A.print("Sachin");
    }
}
class MyThread7 extends Thread {
    public void run() {
        A.print("Dhoni");
    }
}
class MyThread8 extends Thread {
    public void run() {
        A.print("Rohit");
    }
}

public class Synchronization {
    public static void main(String[] args) {
        new MyThread6().start();
        new MyThread7().start();
        new MyThread8().start();
    }
}
