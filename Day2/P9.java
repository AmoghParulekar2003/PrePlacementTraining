import java.util.Scanner;

class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        int range = sc.nextInt();

        int f0 = 0;
        int f1 = 1;
        System.out.print("0 1");
        while (range != 0) {
            int f2 = f0 + f1;
            System.out.print(" "+f2+" ");
            f0 = f1;
            f1 = f2;
            range --;
        }
    }
}
