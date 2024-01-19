class FinalDemo {
    final int MAX = 89;
    void me() {
        MAX = 110;
    }
}

class P13 {
    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        obj.me();
    }    
}
