class minLs{
	public static void main(String args[]){
		int nums[] = {32,76,54,-32,78};
		System.out.println(minSearch(nums));
	}
	public static int minSearch(int arr[]){
		int ans = arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>ans){
				ans = arr[i];
			}
		}
       return ans;
	}
}