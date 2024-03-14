import java.util.Scanner;

public class BinarySearch {
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

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }
            }
        }
        System.out.print("Sorted array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

        System.out.print("Enter element to search: ");  
        int a = sc.nextInt();

        int beg = 0;
        int end = size - 1;
        int mid = (beg + end)/2;

        while(beg <= end && a != arr[mid]) {
            if(a > arr[mid]){
                beg = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (beg + end)/2;
        }
        if(a == arr[mid]){
            System.out.println("Element found at index " + mid);
        }else{
            System.out.println("Element not found");
        }
    }
}