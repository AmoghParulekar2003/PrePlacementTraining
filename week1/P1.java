//last digit of number

import java.util.Scanner;;

class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = sc.nextInt();
        int res = a%10;
        System.out.println("Last digit is: " +res);
    }
}
