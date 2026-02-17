class recBS{
	public static void main(String args[]){
		int nums[] = {-7,2,5,8,11,12};
		int target = 11;
		int ans = recurrsiveBS(nums, target, 0,5);
		System.out.println(ans);
	}

	public static int recurrsiveBS(int arr[],int target,  int start, int end){
		if(start<=end){
			int mid = start + (end-start)/2;
			if(target>arr[mid]){
				return recurrsiveBS(arr, target, mid+1,end);
			}
			else if(target<arr[mid]){
				return recurrsiveBS(arr, target, start,mid-1);
			}
			else {
				return mid;
			}
		}
		return -1;
	}
}