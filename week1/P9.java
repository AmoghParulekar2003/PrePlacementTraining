//find smallest among 4 numbers

import java.util.Scanner;

class P9 {
    public static void main(String[] args) {
        System.out.println("Enter 5 numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int min = a;
        if (min > b)
            min = b;
        if (min > c)
            min = c;
        if (min > d)
            min = d;

        System.out.println("Smallest is: "+min);
    }    
}
