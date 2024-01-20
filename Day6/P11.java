import java.util.Scanner;

class BadVersion {
    boolean isBadVersion(int i, int b) {
        if(i < b) {
            return false;
        }
        return true;
    }
}
class P11 {
    public static void main(String[] args) {
        BadVersion b = new BadVersion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of versions: ");
        int n = sc.nextInt();
        System.out.println("Enter the first bad version: ");
        int bad = sc.nextInt();
        boolean res;

        for(int i = bad; i < n; i++) {
           res = b.isBadVersion(i,bad);
           if(res == false) {
                continue;
            } else {
                System.out.println(i);
                break;
            }
        }
    }
}