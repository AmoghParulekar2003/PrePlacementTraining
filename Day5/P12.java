class Person {
    Person() {
        System.out.println("Person constructor");
    }
}

class Student extends Person {
    Student() {
        super();
        System.out.println("Student constructor");
        //super();------> error
    }
}

class P12 {
    public static void main(String[] args) {
        Student s = new Student();
    }    
}
