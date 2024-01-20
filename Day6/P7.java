abstract class Test {
    abstract void m1();
    abstract void m2();
    abstract void m3();
    void m4() {
        System.out.println("m4 method");
    }
}

class P7 extends Test {
    void m1() {
        System.out.println("m1 method");
    }
    void m2() {
        System.out.println("m2 method");
    }
    void m3() {
        System.out.println("m3 method");
    }

    public static void main(String[] args) {
        P7 p1 = new P7();
        p1.m1();
        p1.m2();
        p1.m3();
        p1.m4();

        Test p2 = new P7();
        p2.m1();
        p2.m2();
        p2.m3();
        p2.m4();
    }
}
