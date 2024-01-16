class P8 {
    public static void main(String[] args) {
        int sum = 0;
        int a = 1;
        while (a <= 20) {
            if (a % 2 == 0) {
                sum = sum + a;
                a++;
            }
            else if (a % 2 != 0)
                a++;
        }
        System.out.println("sum is: "+sum);
    }
}
