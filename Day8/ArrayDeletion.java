import java.util.Scanner;

public class ArrayDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size+1];
        System.out.println("Enter array elements:");
        for(int i = 0; i < size; i++) {
            System.out.print("Enter "+ (i+1) + "th element: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Entered array is: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i]);
        }
        
        System.out.println();

        System.out.print("Enter location to be deleted: ");
        int del = sc.nextInt();
        del = del - 1;
        
        for(int i = del; i < size; i++) {
            arr[i] = arr[i+1];
        }


        System.out.print("Entered array is: ");
        for(int i = 0; i < size-1; i++) {
            System.out.print(arr[i]);
        }
    }
}