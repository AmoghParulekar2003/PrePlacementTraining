import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();

        int mul = 1;
        while (a != 0){
            int b = a % 10;
            mul = mul * b;
            a = a /10;
        }

        System.out.println(mul);
    }
}
