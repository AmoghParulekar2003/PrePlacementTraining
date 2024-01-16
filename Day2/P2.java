import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();

        int sum = 0;
        while (a != 0){
            int b = a % 10;
            sum = sum + b;
            a = a /10;
        }

        System.out.println(sum);
    }
}
