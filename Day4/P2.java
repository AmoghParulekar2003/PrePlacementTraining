import java.util.Scanner;

class MathOperations {
    Scanner sc = new Scanner(System.in);
    public void factorial() {
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i = num; i > 0; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial is: "+fact);
    }

    public void power() {
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        System.out.println("Enter power: ");
        int power = sc.nextInt();
        int res = 1;
        for(int i = 0; i < power; i++) {
            res = res * num;
        }
        System.out.println("Power is: "+res);
    }
}

class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathOperations mo = new MathOperations();
        while(true) {
            System.out.println("Enter choice: 1. Factorial 2. Power 3. Exit");
            int n = sc.nextInt();
            switch(n) {
                case 1: mo.factorial();
                break;

                case 2: mo.power();
                break;

                case 3: System.exit(0);
            }
        }
    }    
}
