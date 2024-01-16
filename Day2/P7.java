import java.util.Scanner;

class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();
        int b = a;
        int c = a;
        int sum = 0;
        int digit = 0;

        while (a != 0){
            a = a /10;
            digit ++;
        }
        System.out.println(digit);

        while (c != 0) {
            int number = c % 10;
            sum = sum +(int) Math.pow(number, digit);
            c = c / 10;
        }

        System.out.println(sum);

        if (sum == b) 
            System.out.println("Armstrong");
        else
            System.out.println("Not armstrong");
    }    
}
