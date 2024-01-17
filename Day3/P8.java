import java.util.Arrays;
import java.util.Scanner;

class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.next();
        char arr[] = s.toCharArray();
        char rev[] = new char[arr.length+1];
        for(int i = (arr.length-1), j = 0; i >= 0; i--, j++) {
            rev[i] = arr[j];
        }
        System.out.println(Arrays.toString(rev));
    }
}
