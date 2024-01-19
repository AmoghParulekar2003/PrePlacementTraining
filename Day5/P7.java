class P7 {
    void m1(int... n) {
        System.out.println("Batman");
    }
    public static void main(String[] args) {
        P7 t = new P7();
        t.m1();
        t.m1(10);
        t.m1(10,20);
        t.m1(10,20,30);
    }    
}
