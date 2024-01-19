public class P20 {
    static public int fact(int n){
        if(n==1)
            return 1;
        else
            return n*fact(n-1);
    }
            
    public static void main(String[] args) {
        int a =145;
        int temp=a;
        int res = 0;
        while(a!=0){
            int n1=a%10;
            res = fact(n1)+res;
            a=a/10;
        }
        if(res==temp)
        System.out.println("Strong number");
    }      
}
