import java.util.Scanner;

class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();
        int b = a;
        int sum = 0;

        while (a != 0) {
            int digit = a % 10;
            sum = sum + (digit * digit * digit);
            a = a / 10;
        }

        System.out.println(sum);

        if (sum == b) 
            System.out.println("Armstrong");
        else
            System.out.println("Not armstrong");
    }    
}
