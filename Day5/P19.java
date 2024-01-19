class P19 {
    public static void main(String[] args) {
        int r = 7;
        int unit = 2;
        int arr[] = {2, 8, 3, 5, 7, 4, 1, 2};

        int food = r * unit;
        System.out.println(food);
        int capacity = 0;
        int c = 0;

        for(int a1:arr) {
            capacity = capacity + a1;
            c++;
            if(capacity > food) {
                break;
            }
        }
        System.out.println("Food is enough with "+c+" houses");
    }    
}
