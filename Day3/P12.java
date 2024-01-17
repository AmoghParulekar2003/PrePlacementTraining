import java.util.Arrays;

class P12 {
    public static void main(String[] args) {
        int arr[] = {100, 80, 60, 70, 60, 75, 85};
        int temp[] = new int[7];
        temp[0] = 1;
        for(int i = 1; i < 7; i++) {
            if (arr[i] < arr[i-1]) {
                temp[i] = 1;
                System.out.println("1 ");
            } else {
                temp[i] = 8;
                System.out.println("2");
            }
        }
        System.out.println(Arrays.toString(temp));
    }    
}
