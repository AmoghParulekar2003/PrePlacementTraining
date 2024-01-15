//swap two numbers without using 3rd variable

import java.util.Scanner;

class P7 {
    public static void main(String[] args) {
        System.out.print("Enter two numbers to swap: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }    
}
