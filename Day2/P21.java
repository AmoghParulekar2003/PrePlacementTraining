//import java.util.Arrays;

import java.util.Arrays;

class P21 {
    public static void main(String[] args) {
        int arrA[] = {1, 3, 2, 4};
        int arrB[] = new int[4];
        for (int i = 0; i < arrA.length; i++) {
            if (i == arrA.length - 1) {
                arrB[i] = -1;
            } else {
                for (int j = i + 1; j < arrA.length; j++) {
                    if (arrA[i] < arrA[j]) {
                        arrB[i] = arrA[j];
                        break;
                    } 
                }
            }
        }
        System.out.println(Arrays.toString(arrB));
    }    
}