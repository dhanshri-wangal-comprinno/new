import java.util.*;
class distinctElement{
    public static void main(String args[]){
        
        int arr[] = {1,2,2,3,4,3,5,4,6,7,7};
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : arr){
          set.add(num);
           
        }
        System.out.println(set);
    }
}