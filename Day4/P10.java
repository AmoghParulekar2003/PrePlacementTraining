class Static {
    static int i = 10;
    public static void show() {
        System.out.println(i);
    }
    static {
        show();
    }
    public static void main(String[] args) {
        i++;
        System.out.println(i);
    }
}
