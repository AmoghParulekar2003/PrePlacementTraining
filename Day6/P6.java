interface I1 {
    void m1();
    default void m2() {
        System.out.println("Default method");
    }
    static void m3() {
        System.out.println("Static method");
    }
}
class P6 implements I1 {
    public void m1() {
        System.out.println("Abstract method");
    }
    public static void main(String[] args) {
        P6 p = new P6();
        p.m1();
        p.m2();
        I1.m3();
    }
}