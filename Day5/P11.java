class Person {
    void message() {
        System.out.println("Person class");
    }
}

class Student extends Person {
    void message() {
        System.out.println("Student class");
    }
    void display() {
        message();
        super.message();
        }
}


class P11 {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }    
}
