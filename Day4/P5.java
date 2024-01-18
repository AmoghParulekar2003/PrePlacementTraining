import java.util.Scanner;

class Area {
    public double returnArea(double l, double b) {
        return l*b;
    }
}

class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area a = new Area();
        System.out.println("Enter length and breadth: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area is: "+a.returnArea(l, b));
    }
}
