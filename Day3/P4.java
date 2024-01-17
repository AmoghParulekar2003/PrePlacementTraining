import java.io.IOException;

class P4 {
    void method1(ArithmeticException ae) {
        System.out.println(ae);
    }
    void method2(IOException ae) {
        System.out.println(ae);
    }    
    public static void main(String[] args) {
        P4 p = new P4();
        p.method1(new ArithmeticException());
        p.method2(new IOException());
    }
}
