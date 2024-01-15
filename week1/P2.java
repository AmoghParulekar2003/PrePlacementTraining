//add two digits of number

import java.util.Scanner;;

class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two digit number:");
        int a = sc.nextInt();
        int n1 = a % 10;
        a = a / 10;
        int n2 = a % 10;
        int res = n1 + n2;
        System.out.print("Sum is: " +res);
    }
}
