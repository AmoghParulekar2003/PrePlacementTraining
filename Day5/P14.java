class FinalMethod {
    final void demo() {
        System.out.println("Final method");
    }
}

class ABC extends FinalMethod {
    void demo() {
        System.out.println("ABC class method");
    }
    public static void main(String[] args) {
        ABC obj = new ABC();
        obj.demo();
    }
}
