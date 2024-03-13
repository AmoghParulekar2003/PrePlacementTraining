class MyThread9 extends Thread {
    public void run() {
        for (int i = 0; i<10; i++) {
            System.out.println("Daemon Thread "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Daemon {
    public static void main(String[] args) {
        MyThread9 t = new MyThread9();
        t.setDaemon(true); //setting daemon nature to Thread
        t.start(); //main thread logic
        for (int i = 0; i<5; i++) {
            System.out.println("Main Thread "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
