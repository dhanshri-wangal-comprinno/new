import java.util.*;
class RevQueue{
	public static void main(String args[]){
		Queue<Integer> q = new LinkedList<>();
		Stack<Integer> s = new Stack<>();

		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);

		System.out.println("Original queue "+q);


		while(!q.isEmpty()){
			s.push(q.remove());
		}
		while(!s.isEmpty()){
			q.add(s.pop());
		}
		System.out.println("reversed queue"+q);
	}
}