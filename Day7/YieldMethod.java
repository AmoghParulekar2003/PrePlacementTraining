class MyThread3 extends Thread{
    public void run() {
        for (int i = 1; i <= 10; ++i) {
            System.out.println("Child thread");
            Thread.yield();
        }
    }
}
class YieldMethod {
    public static void main(String[] args) {
        MyThread3 t = new MyThread3();
        t.start();
        for (int i = 1; i <= 10; ++i) {
            System.out.println("Main thread");
        }
    }
}
