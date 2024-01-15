import java.util.Scanner;

class P17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Choose operation 1.+, 2.-, 3.*, 4./, 5.exit");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: int add = a + b;
                System.out.println(add);
                break;
            case 2: int sub = a - b;
                System.out.println(sub);
                break;
            case 3: int mul = a * b;
                System.out.println(mul);
                break;
            case 4: int div = a / b;
                System.out.println(div);
                break;
            case 5: System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid operation");;
        }
    }
}
