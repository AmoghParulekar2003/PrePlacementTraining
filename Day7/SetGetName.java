public class SetGetName extends Thread {
    public void run() {
        System.out.println("run() method");
    }
    public static void main(String[] args) {
        SetGetName t1 = new SetGetName();
        SetGetName t2 = new SetGetName();
        System.out.println("Name of t1: "+t1.getName());
        System.out.println("Name of t2: "+t2.getName());

        t1.start();
        t2.start();
        t1.setName("Batman");
        System.out.println("After changing name of t1: "+t1.getName());
        System.out.println("After changing name of t2: "+t2.getName());
        System.out.println(Thread.currentThread().getName());
    }
}
