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

class C extends A{
    public void showC() {
        System.out.println("Class C");
    }
}

class P3 {
    public static void main(String[] args) {
        C obj1 = new C();
        B obj2 = new B();
        obj1.showA();
        obj2.showA();
        obj2.showB();
        obj1.showC();
    }
}

