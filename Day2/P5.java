import java.util.Scanner;

class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();
        int b = a;
        int rem, rev = 0;
        while (a != 0) {
            rem = a % 10;
            rev = rev * 10 + rem;
            a = a / 10;
        }
        System.out.println("Reverse is: "+rev);
        if (rev == b)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
