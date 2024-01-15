//Accept year and check leap year or not

import java.util.Scanner;

class P15 {
    public static void main(String[] args) {
        System.out.println("Enter year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year % 100 != 0)
            if(year % 4 == 0)
                System.out.println("Leap Year");
            else
                System.out.println("Not Leap Year");
        else
        if(year % 400 == 0)
            System.out.println("Century Leap Year");
        else
            System.out.println("Not Century Leap Year");
    }    
}
