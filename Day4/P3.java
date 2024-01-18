class Triangle {
    double a = 4;
    double b = 5;
    double c = 6;
    public void area() {
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area is: "+area);
    }

    public void perimeter() {
        double p = a + b + c;
        System.out.println("Perimeter is: "+p);
    }
}

class P3 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.area();
        t.perimeter();
    }
}
