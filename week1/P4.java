//sum of digits of 4 digit number

import java.util.Scanner;

class P4 {
    public static void main(String[] args) {
        System.out.print("Enter a 4 digit number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n1 = a % 10;
        a = a / 10;
        int n2 = a % 10;
        a = a / 10;
        int n3 = a % 10;
        a = a / 10;
        int n4 = a % 10;
        int res = n1 + n2 + n3 + n4;
        System.out.println("Sum is: "+res);
    }    
}
