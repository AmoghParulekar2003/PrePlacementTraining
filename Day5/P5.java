class A {
    public int a = 20;
    public void show() {
        System.out.println("a = "+a);
    }
}

class B extends A {
    public int a = 40;
    public void show() {
        System.out.println("a = "+a);
    }
}

class P5 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
