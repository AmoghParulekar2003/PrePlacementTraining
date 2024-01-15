import java.util.Scanner;

class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price: ");
        int cost = sc.nextInt();
        System.out.println("Your student status(S/N): ");
        char isStudent = sc.next().charAt(0);

        if (isStudent == 'S' && cost > 500) {
            double dis = 0.10; 
            double net = (double) cost * dis;
            double neta = cost - net;
            System.out.println("Net Price is: "+neta);
        }
        else if (isStudent == 'S' && cost < 500) {
            double dis = 0.05; 
            double net = (double) cost * dis;
            double neta = cost - net;
            System.out.println("Net Price is: "+neta);
        }
        else if (isStudent == 'N' && cost > 500) {
            double dis = 0.08; 
            double net = (double) cost * dis;
            double neta = cost - net;
            System.out.println("Net Price is: "+neta);
        }
        else if (isStudent == 'N' && cost < 500) {
            double dis = 0.02; 
            double net = (double) cost * dis;
            double neta = cost - net;
            System.out.println("Net Price is: "+neta);
        }
    }    
}