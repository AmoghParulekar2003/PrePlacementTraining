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

class C extends B {
    public void showC() {
        System.out.println("Class c");
    }
}

class P2 {
    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}
