import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();

        int fact = 1;

        while (a != 0){
            fact = fact * a;
            a--;
        }

        System.out.println(fact);
    }
}
