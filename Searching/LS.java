class LS {
    public static void main(String[] args) {
        int nums[] = {1,4,6,3,8,85,32};
        int target = 85;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    
    }
    public static int linearSearch(int arr[], int target){
        if(arr.length==0){
            return -1;
        }
        
        for(int index =0;index<arr.length;index++){
            int element = arr[index];
            if(element == target){
                return element;
            }
        }
        return -1;
    }
}