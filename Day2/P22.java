import java.util.Arrays;
import java.util.Scanner;

class P22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of semester:");
        int sem = sc.nextInt();
        int sub;

        for (int i = 0; i < sem; i++) {
            System.out.println("Enter no. of subject in "+i+" semenster: ");
            sub = sc.nextInt();
            int subjects[] = new int[sub];

            for (int j = 0; j < subjects.length; j++) {
                System.out.println("Enter subject marks: ");
                int check = sc.nextInt();
                if (check > 100) {
                    System.out.println("Marks not valid");
                    j--;
                } else {
                    subjects[j] = check;  
                }
            }
            int max = 0;
            for (int k = 0; k < subjects.length; k++) {
                if (max < subjects[k]) 
                    max = subjects[k];
            }
            System.out.println("Max is: "+max);
        }
    }
}
