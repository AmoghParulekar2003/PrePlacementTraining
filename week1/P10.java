//Accept 3 paper marks, if paper mark is less than 45 show "fail" or show "pass"

import java.util.Scanner;

class P10 {
    public static void main(String[] args) {
        System.out.println("Enter marks of three papers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double total = a + b + c;
        double percent = ((double)total/(double)300) * (double)100;

        if (percent > 45.0)
            System.out.println("Pass");
        else 
            System.out.println("Fail");
    }    
}
