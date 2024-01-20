interface It1 {
    double m1(int a, String str);
    int m1(char ch);
}
class P3 implements It1 {
    public double m1(int a, String str) {
        System.out.println("m1 2-arguments method");
        return 22.2;
    }
    public int m1(char ch) {
        System.out.println("m1 1-argument method");
        return 40;
    }

    public static void main(String[] args) {
        P3 p = new P3();
        int i = p.m1('p');
        System.out.println("Values = "+i);
        double d = p.m1(22, "batman");
        System.out.println("Value = "+d);
    }
}
