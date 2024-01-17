import java.util.Scanner;

class P3 {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible for marriage");
        } else {
            System.out.println("Eligible");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        P3.checkAge(age);
    }
}
