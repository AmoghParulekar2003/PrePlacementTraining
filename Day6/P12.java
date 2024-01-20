import java.util.Scanner;

class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();

        if(n == 0) {
            System.out.println("False");
        } else if (n == 1) {
            System.out.println("True");
        } else if (n % 4 != 0) {
            System.out.println("False");
        } else {
            int i = 1;
            int res = 1;
            while(i < n) {
                res = i * 4;
                i = res;
                if(i == n) {
                    System.out.println("True");
                } 
            }
        }
    }    
}
