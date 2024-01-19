class P8 {
    public void m1(char ch, int... n) {
        System.out.print(ch+" ");
        for(int a:n) {
            System.out.print(a+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        P8 p = new P8();
        p.m1('A');
        p.m1('B',10);
        p.m1('C',10,20);
        p.m1('D',10,20,30);
    }    
}
