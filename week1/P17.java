class P17 {
    public static void main(String[] args) {
        int i, j;
        for (i=1, j=10; i<j; i++, j--) {
            if (i == 3) {
                continue;
            } else {
                System.out.println(i+" "+j);
            }
        }
    }    
}
