class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next=null;
    }
}

class LinkedList {
    Node head;

    public LinkedList(int data) {
        this.head = new Node(data);

    }

    public LinkedList() {

    }

    public void insertAtEnd(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
    }


    public void printList(){
        if(head==null){
            return;
        }
        
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
    }

    public Node middleNode(){

        if(head==null){
            return null; 
        }
        Node slow=head, fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

}

public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
    
        ll.printList();
    }


}