public class P15 {
    public static void main(String[] args) {
        int arr[] = {7, 1, 2, 3, 4, 5, 6};
        int counter = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(i == j) {
                    continue;
                } else {
                    if(arr[i] == arr[j]) {
                        System.out.println("True");
                        counter = 0;
                        System.exit(0);
                    } else {
                        counter++;
                    }
                }
            }
        }
        if(counter != 0)
            System.out.println("False");
    }
}
