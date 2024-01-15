//Accept 3 numbers and find largest number

import java.util.Scanner;

class P14 {
    public static void main(String[] args) {
        System.out.println("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b)
            System.out.println("Biggest number is "+ a);
        else if (b > c)
            System.out.println("Biggest number is "+ b);
        else
            System.out.println("Biggest number is "+ c);
    }    
}
