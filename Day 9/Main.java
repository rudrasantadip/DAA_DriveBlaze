/*
* STACK USING LINKEDLIST
*/

class StackNode{
    Integer data;
    StackNode next;

    public StackNode(int data){
        this.data=data;
        this.next=null;
    }
}

class Stack{
    private StackNode head;

    //insert or push.....

    /*
     * Insert at the head of a linkedlist...
     */
    public void push(int data){
        StackNode newNode = new StackNode(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        return;
    }

    /*
     * Delete the head of a linkedlist...
     */
    public Integer pop(){
        if(head==null){
            System.out.println("Stack is empty");
            return -1;
        }
        StackNode free = head;
        int temp=free.data;
        head=head.next;
        free=null;
        return temp;
    }

    /*
     * Peek :- Returns the top value 
     */

     public Integer peek(){
        if(head==null){
            System.out.println("Stack is empty");
            return -1;
        }
        return head.data;
     }    
}



public class Main{
    public static void main(String[] args) {
        
    }
}