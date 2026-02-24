import java.util.*;

class SubsetArray {

    public static boolean isSubset(int[] arr1, int[] arr2) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : arr2) {

            if (!map.containsKey(num) || map.get(num) == 0) {
                return false;
            }
            map.put(num, map.get(num) - 1);
        }
        return true;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 3};
        int[] arr2 = {2, 2};
        System.out.println(isSubset(arr1, arr2));
    }
}