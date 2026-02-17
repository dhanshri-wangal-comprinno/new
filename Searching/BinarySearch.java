class BinarySearch{
	public static void main(String args[]){
		int nums[] = {-7,2,5,8,11,12};
		int target = 12;
		int ans = binarySearch(nums , target);
		System.out.println(ans);
	}
	public static int binarySearch(int arr[], int target){
		int start =0; 
		int end =arr.length-1;
         
          while(start<=end){
         int mid = (start+end)/2;
         if(target>arr[mid]){
         	start = mid+1;
         }
         else if(target<arr[mid]){
         	end = mid-1;
         }
         else{
         	return mid;
         }
     }
     return -1;
	}
}