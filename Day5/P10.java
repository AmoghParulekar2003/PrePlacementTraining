class Vehicle {
    int speed = 170;
}

class Car extends Vehicle {
    int speed = 130;
    void display() {
        System.out.println("Maximum speed: "+super.speed);
    }
}

class P10{
    public static void main(String[] args) {
        Car s = new Car();
        s.display();
    }
}
