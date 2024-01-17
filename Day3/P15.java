import java.util.Arrays;

class P15 {
    public static void main(String[] args) {
        int arr[] = {13, 12, 11, 15};
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != 1) {
                System.out.println("Missing value is: " + (arr[i] + 1));
            }
        }
    }    
}
