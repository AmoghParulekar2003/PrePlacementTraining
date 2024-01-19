class P9 {
    void m1(int...n) {
        System.out.println("Variable argument");
    } 
    void m1(int n) {
        System.out.println("Normal argument");
    }
    public static void main(String[] args) {
        P9 t = new P9();
        t.m1(10);
    }    
}
