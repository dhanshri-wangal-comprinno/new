import java.util.*;
class Traversal{

	public static void display(Queue<Integer> q){
		int n = q.size();
		for(int i=0;i<n;i++){
			System.out.print(q.peek()+" ");
			q.add(q.remove());

		}
		System.out.println();

	}

	public static void AddAtIndex(Queue<Integer>q, int val, int idx){
		if(idx<0 || idx>q.size()){
			System.out.print("Invalid index");
			return;
		}
		int n = q.size();
		for(int i=0;i<idx;i++){
			q.add(q.remove());
		}
		q.add(val);
		for(int i=0;i<n-idx;i++){
			q.add(q.remove());
		}
	}
	public static void main(String args[]){
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		display(q);
		AddAtIndex(q,60,2);
		display(q);

	}
}