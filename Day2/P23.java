import java.util.Scanner;

class P23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        System.out.println("Enter the digits:");
        for (int i = 0; i <= 3; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            System.out.print(a+"-"+(char)a+" ");
        }
    }    
}
