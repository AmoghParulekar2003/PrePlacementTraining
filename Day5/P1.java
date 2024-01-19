class A {
    public void showA() {
        System.out.println("Class A");
    }
}

class B extends A {
    public void showB() {
        System.out.println("Class B");
    }
}

class P1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.showA();
        obj.showB();
    }
}
