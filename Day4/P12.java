class Static {
    public void show() {
        System.out.println("Non static show");
    }
    {
        show();
    }
    static {
        System.out.println("I am in static block");
    }
    public static void main(String[] args) {
        Static s = new Static();
        System.out.println("I am in main");
    }
}
