import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements:");
        for(int i = 0; i < size; i++) {
            System.out.print("Enter "+ (i+1) + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Entered array is: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i]+"\t");
        }

        System.out.println();
        int min=arr[0],loc=0,temp;

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++) {
                if(min > arr[j]) {
                    min = arr[j];
                    loc  = j;
                }
            }
            if (loc != i) {
                temp = arr[i];
                arr[i] = arr[loc];
                arr[loc] = temp;
            }
        }

        System.out.print("Sorted array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
