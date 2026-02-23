 import java.util.*;
class CountFreq{
    public static void main(String args[]){
        
        int arr[] = {1,2,2,3,4,3,5,4,6,7,7};
        HashMap<Integer,  Integer> map = new HashMap<>();
        
        for(int nums : arr){
            if(map.containsKey(nums)){
                map.put(nums, map.get(nums)+1);
            }
            else{
                map.put(nums ,1);
            }
        }
        System.out.println(map);
    }
}