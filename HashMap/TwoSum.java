import java.util.*;
class TwoSum{
    public static void main(String args[]){
        
        int arr[]= {1,7,3,2,6};
        int target = 9;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement = target - arr[i];
            
            if(map.containsKey(complement)){
                System.out.println("Pairs= "+complement+ " + "+arr[i]);
                return;
            }
            map.put(arr[i], i);
        }
        System.out.println("No pair found");
    }
}