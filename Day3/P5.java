import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException() {
        System.out.println("Not eligible");
    }
}
class P5 {
    static void status(int age) throws InvalidAgeException {
        if (age > 18) {
            System.out.println("Elibile");
        } else {
            throw new InvalidAgeException();
        }
    }
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        P5.status(age);
    }
}
