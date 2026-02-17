class CLL{
    
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        Node head = null;
        
        void insert(int data){
            Node newNode = new Node(data);
            //empty list
            if(head==null){
                head = newNode;
                newNode.next = head;
                return;
            }
        
            
            //non empty list
            Node temp =head;
            while(temp.next!=head){
               temp =temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
            
        }
        
        //delete head node
        void delete(){
            //empty list
            if(head== null){
                return;
        
            }
            //Onlly one node
            if(head.next==head){
                head = null;
                return;
            }
            //More than one node
            Node temp =head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next = head.next;
            head = head.next;
        }
        
        //remove tail
        void removeTail(){
            if(head==null){
                return;
            }
            
            if(head.next==head){
                head= null;
                return;
            }
            
            Node temp = head;
            while(temp.next.next!=head){
                temp = temp.next;
            }
            temp.next = head;
        }
        
        void display(){
            if(head==null){
                return;
            }
            Node temp =head;
            do{
                System.out.print(temp.data+" ");
                temp =temp.next;
            }while(temp!=head);
            System.out.println();
        
    }
    public static void main(String args[]){
        CLL list = new CLL();
        list.insert(10);
        list.insert(6);
        list.insert(15);
        list.display();
        list.delete();
        list.display();
    }
}