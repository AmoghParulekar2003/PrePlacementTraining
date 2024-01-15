//swap two numbers using third variable

import java.util.Scanner;

class P6 {
    public static void main(String[] args) {
        System.out.print("Enter two numbers to swap: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a;
        a = b;
        b =  c;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }    
}
