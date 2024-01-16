import java.util.Arrays;

class P20 {
    public static void main(String[] args) {
        int arrA[] = {1, 2, 3, 4};
        int arrB[] = {2, 4, 6, 8};
        int arrC[] = {1, 2, 3, 4};
        System.out.println(Arrays.equals(arrA, arrB));
        System.out.println(Arrays.equals(arrA, arrC));
    }    
}
