class A {
    public A() {
        System.out.println("Class A constructor");
    }
    public void showA() {
        System.out.println("Class A show");
    }
}

class B extends A {
    public B() {
        System.out.println("Class B connstructor");
    }
    public void showB() {
        System.out.println("Class B show");
    }
}

class P6 {
    public static void main(String[] args) {
        B obj = new B();
        obj.showB();
    }    
}
