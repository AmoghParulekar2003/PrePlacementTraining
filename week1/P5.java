//reverse a 4 digit number

import java.util.Scanner;

class P5 {
    public static void main(String[] args) {
        System.out.print("Enter 4 digit number to reverse: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n1 = a % 10;
        a = a / 10;
        int n2 = a % 10;
        a = a / 10;
        int n3 = a % 10;
        a = a / 10;
        int n4 = a % 10;
        int result = n1*1000 + n2*100 + n3*10 + n4;
        System.out.print(result);
    }    
}
