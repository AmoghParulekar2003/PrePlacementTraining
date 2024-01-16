//Accept number and count number of digits entered by user

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        int digit = 0;

        while(a != 0) {
            a = a / 10;
            digit ++; 
        }
        System.out.println(digit);
    }
}
