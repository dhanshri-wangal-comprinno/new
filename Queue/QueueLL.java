import java.util.*;

class Queue{
	static class Node{
		int data;
		Node next;

		Node(int data){
			this.data = data;
			this.next = null;
	}
	}
	Node front = null;
	Node rear = null;

//add
	void add(int val){
		Node newNode = new Node(val);
		if(rear==null){
			front = rear =newNode;
			return;
		}
		rear.next = newNode;
		rear = newNode;
	}

//remove
	int remove(){
		if(front==null){
			System.out.println("Queue is Empty");
			return -1;
		}

		int result = front.data;
		front = front.next;

		if(front==null){
			rear = null;
		}
		return result;
	}

	int peek(){
		if(front==null){
			System.out.println("Queue is empty");
			return -1;
		}
		return front.data;
	}

    //Display
	void display(){
		Node temp = front;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
}
class QueueLL{
	public static void main(String args[]){
		Queue q = new Queue();
		q.add(10);
		q.add(20);
		q.add(30);

		q.display();
		System.out.println(q.peek());
		System.out.println(q.remove());
		q.display();

	}
}