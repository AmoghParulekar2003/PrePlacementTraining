import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int size = sc.nextInt();
        long arr[] = new long[size];
        System.out.println("Enter array elements:");
        for(int i = 0; i < size; i++) {
            System.out.print("Enter "+ (i+1) + "th element: ");
            arr[i] = sc.nextLong();
        }
        System.out.print("Entered array is: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i]+"\t");
        }

        System.out.println();
        for (int i = 1; i < arr.length; i++) {
            long temp = arr[i];
            int loc = i-1;
            while(loc>=0 && arr[loc]>temp) {
                arr[loc+1]=arr[loc];
                loc--;
            }
            arr[loc+1]=(int) temp;
        }
        System.out.print("Sorted array is: ");
        for (int i = 0; i < arr.length; i++) {
            if(i == 3 || i == 6) {
                System.out.print(arr[i]+" Hello\t");
            } else {
                System.out.print(arr[i]+" Hii\t");
            }
        }
    }
}
