class StackUsingArray{

	int arr[] = new int[5];
	int top = -1;

	void push(int data){
		if(top==4){
			System.out.println("Stack is overflow");
		}
		else{
			top++;
			arr[top] = data;
		}
	}

	void pop(){
		if(top==-1){
			System.out.println("Stack is Underflow");
		}
		else{
			System.out.print("Deleted : "+arr[top]+" ");
			top--;
		}
	}

	void display(){
		for(int i=top;i>=0;i--){
			System.out.println(arr[i]);
		}
	}
	public static void main(String args[]){
		StackUsingArray s = new StackUsingArray();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.display();
		s.pop();
		s.display();
	}
}