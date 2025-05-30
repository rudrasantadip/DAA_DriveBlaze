package linkedlist;

public class Node {
    Integer data;
    Node next;

    public Node(){

    }

    /* A special method with the same name as the class,
     * it has no return type because it returns the object it self
     */
    public Node(Integer data){
        this.data=data;
        this.next=null;
    }
}
