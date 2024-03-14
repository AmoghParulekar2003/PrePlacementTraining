import java.util.Scanner;

public class ArrayInsertion {
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

        System.out.print("Enter element to be inserted: ");
        int newEl = sc.nextInt();
        System.out.print("Enter location to insert: ");
        int pos = sc.nextInt();
        pos = pos - 1;

        int i = 0;
        for (i = size - 1; i > pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[i + 1] = arr[i];
        arr[i] = newEl;
        size++;


        System.out.print("Entered array is: ");
        for(i = 0; i < size; i++) {
            System.out.print(arr[i]);
        }
    }
}
