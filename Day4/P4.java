class Rectangle {
    public double area(double l, double b) {
        double area =l*b;
        return area;
    }
}

class P4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println("Area of first rectangle is: "+r.area(4, 5));
        System.out.println("Area of first rectangle is: "+r.area(5, 8));
    }
}
