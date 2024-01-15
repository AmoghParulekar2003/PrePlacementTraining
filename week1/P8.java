//find largest among 5 numbers

import java.util.Scanner;

class P8 {
    public static void main(String[] args) {
        System.out.println("Enter 5 numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int max = a;
        if (max < b)
            max = b;
        if (max < c)
            max = c;
        if (max < d)
            max = d;
        if (max < e)
            max = e;

        System.out.println("Largest is: "+max);
    }    
}
