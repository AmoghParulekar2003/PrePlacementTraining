import java.util.Scanner;

public class CheckTopper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result[] = {70, 60, 90, 88, 155, 96, 76, 72, 81};
        int marks[] = new int[10];
        System.out.println("Enter 10 marks: ");
        for(int i = 0; i < 10; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.print("Entered marks are :");
        for(int i = 0; i < 10; i++) {
            System.out.print(marks[i]+"\t");
        }
        System.out.println();

        int min1=marks[0],loc1=0,temp1;

        for (int i = 0; i < marks.length; i++) {
            min1 = marks[i];
            loc1 = i;
            for (int j = i + 1; j < marks.length; j++) {
                if (min1 > marks[j]) {
                    min1 = marks[j];
                    loc1 = j;
                }
            }
            if (loc1 != i) {
                temp1 = marks[i];
                marks[i] = marks[loc1];
                marks[loc1] = temp1;
            }
        }

        System.out.print("Sorted array is: ");
        for(int i = 0; i < 10; i++) {
            System.out.print(marks[i]+"\t");
        }
        System.out.println("Topper marks is: "+marks[9]);
        int top = marks[9];
        System.out.println();


        int min2= result[0], loc2= 0, temp2;

        for (int i = 0; i < result.length; i++) {
            min2 = result[i];
            loc2 = i;
            for (int j = i + 1; j < result.length; j++) {
                if (min2 > result[j]) {
                    min2 = result[j];
                    loc2 = j;
                }
            }
            if (loc2 != i) {
                temp2 = result[i];
                result[i] = result[loc2];
                result[loc2] = temp2;
            }
        }
        System.out.print("Sorted array is: ");
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i]+"\t");
        }
        System.out.println();



        int beg = 0;
        int end = result.length - 1;
        int mid;

        while(beg <= end) {
            mid = (beg + end) / 2;
            if(top == result[mid]) {
                System.out.println("Topper found at index " + mid);
                break;
            } else if(top > result[mid]) {
                beg = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if(beg > end) {
            System.out.println("Topper is dead");
        }
    }
}
