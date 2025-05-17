class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
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

    public void printList() {
        if (head == null) {
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public static void printList(Node head) {
        if (head == null) {
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public Node middleNode() {

        if (head == null) {
            return null;
        }
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node addTwoNos(Node head1, Node head2) {
        Node temp1 = head1, temp2 = head2;
        Node dummy = new Node(-1);
        Node dummyHead = dummy;
        int carry = 0, sum = 0;

        while (temp1 != null || temp2 != null) {
            sum = carry;
            if (temp1 != null) {
                sum = sum + temp1.data;
            }
            if (temp2 != null) {
                sum = sum + temp2.data;
            }
            carry = sum / 10; // msb
            dummy.next = new Node(sum % 10);
            dummy = dummy.next;

            if (temp1 != null) {
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                temp2 = temp2.next;
            }
        }
        if (carry > 0) {
            Node newNode = new Node(carry);
            dummy.next = newNode;
        }
        return dummyHead.next;
    }

    public Node seperateOddEven() {

        if (head == null) {
            return null;
        }
        Node odd = head;
        Node even = head.next;

        Node evenHead = even;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;

            // shift
            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }

    /*
     * Given a singly linked list, delete the middle of the linked list.
     * 
     * Note:
     * 
     * If there are even nodes, then there would be two middle nodes, we need to
     * delete the second middle element.
     * If the input linked list has a single node, then it should return NULL.
     */


     public void deleteMiddle(){
        if(head==null || head.next==null){
            return;
        }

        Node slow = head,fast=head;
        Node prev=null;

        while (fast!=null && fast.next!=null){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        prev.next=slow.next;
        slow.next=null;
     }

     public Node moveZeroes(Node head) {
        // Your Code here.
        
        if(head==null){
            return null;
        }
        
        Node zeroHead=new Node(-1);
        Node zero=zeroHead;
        Node nonZeroHead=new Node(-1);
        Node nonZero=nonZeroHead;
        
        Node temp=head;
        
        while(temp!=null){
            if(temp.data==0){
               zero.next=temp; 
               zero=zero.next;
            }
            else{
                nonZero.next=temp;
                nonZero=nonZero.next;
            }
            temp=temp.next;
        }

        zero.next=nonZeroHead.next;
        nonZero.next=null;
        return zeroHead.next;
    }


    public void delete(int x){
        Node temp=head;
        Node prev=null;
        for(int i=1;i<x;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
    }

    Node insertInSorted(int key){
        if(head==null){
            return null;
        }
        
        Node temp=head;
        Node prev=null;

        while(temp.data>key && temp!=null){
            prev=temp;
            temp=temp.next;
        }

        Node newNode = new Node(key);
        
        if(prev==null){
            newNode.next=head;
            head=newNode;
        }else{
            prev.next=newNode;
            newNode.next=temp;
        }
        return head;
    }

    /*
     * Remove Nth Node From End of List
     * Given the head of a linked list, remove the nth node from the end of the list and return its head.
     */

     public void deleteFromEnd(int n){
        Node slow=head;
        Node fast=head;

        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
     }


}

public class Main {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insertAtEnd(1);
        l1.insertAtEnd(2);
        l1.insertAtEnd(3);
        l1.insertAtEnd(4);
        l1.insertAtEnd(5);

        int x = 2;
        l1.deleteFromEnd(x);

        l1.printList();

    }

}