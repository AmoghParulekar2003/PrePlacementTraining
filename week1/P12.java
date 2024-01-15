//Accept day and check weekday or weekend

import java.util.Scanner;

class P12 {
    public static void main(String[] args) {
        System.out.println("Enter day(M/T/W/H/F/S/U): ");
        Scanner sc = new Scanner(System.in);
        char day = sc.next().charAt(0);


        if (day == 'U' || day == 'S')
            System.out.println("Weekend");
        else 
            System.out.println("Weekday");
    }    
}
