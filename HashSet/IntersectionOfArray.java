import java.util.*;
class IntersectionOfArray{
	public static void main(String args[]){

		int arr1[] = {1, 2, 3, 4};
		int arr2[] = {3, 4, 5, 6};

		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> result = new HashSet<>();

		for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }

        System.out.println("Intersection: " + result);



	}
}