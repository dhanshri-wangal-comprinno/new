class rangeLs{
	public static void main(String args[]){
		int nums[] = {1,67,34,92,45,90};
		int target = 92;
		int ans = rangeLinearSearch(nums,target,2,6);
		System.out.println(ans);

	}
     public static int rangeLinearSearch(int arr[],  int target, int start, int end){
     	if(arr.length==0){
     		return -1;

     	}
     	for(int i=start;i<=end;i++){
     		int element =arr[i];
     		if(element == target){

     			return i;
     		}
     	}
     	return -1;
     }
}