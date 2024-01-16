import java.util.Scanner;

class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        double x = sc.nextInt();
        System.out.println("Enter number: ");
        double n = sc.nextInt();
        double sum = 1.0;
        for (double i = 1; i <= x; i++) {
            sum = sum + (double)(Math.pow(n, i)/i);
        }
        System.out.println(sum);
    }    
}
