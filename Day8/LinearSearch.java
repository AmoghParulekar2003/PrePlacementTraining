import java.util.Scanner;

public class LinearSearch {
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

        System.out.print("Enter element to search: ");  
        int a = sc.nextInt();
        int flag = 0;

        for(int i = 0; i < size; i++) {
            if(a == arr[i]) {
                flag = 1;
                System.out.println("Element found at index "+i);
                System.exit(1);
            } else {
                flag = 0;
            }
        }
        if(flag == 0) {
            System.out.println("Element not found");
        }
        
    }
}