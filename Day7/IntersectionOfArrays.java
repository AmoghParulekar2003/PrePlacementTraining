import java.util.*;

public class IntersectionOfArrays {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }


        for (int num : nums2) {
            if (countMap.containsKey(num) && countMap.get(num) > 0) {
                result.add(num);
                countMap.put(num, countMap.get(num) - 1);
            }
        }

        int[] intersection = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intersection[i] = result.get(i);
        }

        return intersection;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of nums1: ");
        int size1 = sc.nextInt();
        int[] nums1 = new int[size1];
        System.out.println("Enter the elements of nums1:");
        for (int i = 0; i < size1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of nums2: ");
        int size2 = sc.nextInt();
        int[] nums2 = new int[size2];
        System.out.println("Enter the elements of nums2:");
        for (int i = 0; i < size2; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] result = intersect(nums1, nums2);

        System.out.print("Output: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
