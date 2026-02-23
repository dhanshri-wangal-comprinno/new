import java.util.*;

class Main {
    public static void main(String[] args) {

        int arr[] = {1, 7, 3, 2, 6};
        int target = 9;

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            int complement = target - num;

            if (set.contains(complement)) {
                System.out.println("Pair found: " + complement + " + " + num);
                return;
            }

            set.add(num);
        }

        System.out.println("No pair found");
    }
}