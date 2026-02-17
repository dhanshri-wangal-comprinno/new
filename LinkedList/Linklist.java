class Linklist{
	Node head;
	private int size;

Linklist(){
      this.size = 0;
	}

	class Node{
		String data;
		Node next;

		Node(String data){
			this.data = data;
			this.next = null;
             size++;
		}
	}

	//adding first and last element
	public void addFirst(String data){
		Node newNode = new Node(data);
		if(head==null){
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;
	}

	public void addLast(string data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			return;
		}

		Node currNode = head;
		while(currNode.next != null){
			currNode = currNode.next;
		}

		currNode.next = newNode;
	}

	public void printList(){
		if(head==null){
			System.out.println("list is empty");
			return;
		}

		Node currNOde = head;
		while(currNode!=null){
			System.out.print(CurrNode.data+"->");
			currNode = currNode.next;
		}

		System.out.println("NULL");
	}

	public void deleteFirst(){
		if(head==null){
			System.out.println("this list is empty");
			return;
		}
		size--;
		head = head.next;
	}
	public void deleteLast(){
		if(head == null){
			System.out.println("This list is empty");
			return;
		}
		if(head.next == null){
			head =null;
			return;
		}

		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next != null){
			lastNode = lastNode.next;
			secondLast = secondLast.next;		}
	}

	secondLAST.NEXT = null;
}

public static void main(String args[]){
	Linklist list = new Linklist();
	list.addFirst("a");
}