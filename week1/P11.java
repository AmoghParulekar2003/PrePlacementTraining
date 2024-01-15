//Accept 3 paper marks, find total and percentage, if percent >= 62 and gender is female, admission is allowed

import java.util.Scanner;

class P11 {
    public static void main(String[] args) {
        System.out.println("Enter marks of three papers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter Gender(M/F): ");
        char gender = sc.next().charAt(0);

        double total = a + b + c;
        System.out.println("Total: "+total);
        double percent = ((double)total/(double)300) * (double)100;
        System.out.println("Percentage: "+percent);

        if (percent >= 62.0 && gender == 'F')
            System.out.println("Admission approved");
        else 
            System.out.println("Change gender");
    }    
}
