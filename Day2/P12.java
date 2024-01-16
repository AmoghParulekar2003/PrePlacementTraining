import java.util.Scanner;

class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();

        for (int i = a; i >= 0; i=i-2) {
            System.out.println(i);
        }
    }    
}
