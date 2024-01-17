import java.util.Scanner;

class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.next();
        System.out.println("Enter string to convert to: ");
        String t = sc.next();
        int slen = s.length();
        int tlen = t.length();
        int opr = 0;
        if (slen < tlen) {
            opr = tlen - slen;
        } else if(slen == tlen) {
            for(int i = 0,  j = 0; i < slen; i++, j++) {
                if(s.charAt(i) == t.charAt(j)) {
                    continue;
                } else {
                    opr++;
                }
            }
        } else if(slen > tlen) {
            opr = slen - tlen;
        }
        System.out.println("Number of operations is: "+opr);
    }    
}
