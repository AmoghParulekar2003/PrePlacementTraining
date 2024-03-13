public class Priority extends Thread {
    public void run() {
        System.out.println("Inside run method");
    }
    public static void main(String[] args) {
        Priority p1 = new Priority();
        Priority p2 = new Priority();
        Priority p3 = new Priority();

        System.out.println("p1 thread priority: "+p1.getPriority());
        System.out.println("p2 thread priority: "+p2.getPriority());
        System.out.println("p3 thread priority: "+p3.getPriority());

        p1.setPriority(2);
        p2.setPriority(5);
        p3.setPriority(8);

        System.out.println("p1 thread priority: "+p1.getPriority());
        System.out.println("p2 thread priority: "+p2.getPriority());
        System.out.println("p3 thread priority: "+p3.getPriority());

        System.out.println(Thread.currentThread().getName());
        System.out.println("Main thread priority: "+Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);
        System.out.println("Main Thread priority: "+Thread.currentThread().getPriority());
    }
}
