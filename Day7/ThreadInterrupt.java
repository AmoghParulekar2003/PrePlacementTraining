class MyThread5 extends Thread{
    public void run() {
        try {
            for(int i=0;i<5;i++){
                System.out.println("Child Thread");
                Thread.sleep(1000);
            }
        } catch(InterruptedException e){
            System.out.println("InterruptedException has occured");
        }
    }
}

public class ThreadInterrupt {
    public static void main(String[] args) throws InterruptedException{
        MyThread5 t = new MyThread5();
        t.start();
        t.interrupt();
        //main thread calls interrupt() method on child thread
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
            Thread.sleep(1000);
        }
    }
}
