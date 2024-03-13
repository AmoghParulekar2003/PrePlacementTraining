class MyThread4 extends Thread{
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Child thread");
            try {
                Thread.sleep(100);
            } catch(InterruptedException e){}
        }
    }
}
class Join {
    public static void main(String[] args) throws InterruptedException{
        MyThread4 t = new MyThread4();
        t.start();
        t.join(); //main thread call child thread to join, and will wait until completing child thread
        for (int i = 1; i <= 10; i++) {
            System.out.println("Main thread");
        }
    }
}