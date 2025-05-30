class QueueNode{
    Integer data;
    QueueNode next;
    

    public QueueNode(int data){
        this.data=data;
        this.next=null;
    }
}

class Queue{
    QueueNode front;
    QueueNode rear;


    public void enqueue(Integer data){
        
        QueueNode newNode = new QueueNode(data);

        //queue is empty;
        if(front==null && rear==null){
            rear=newNode;
            front=newNode;
        }
        else
        {
            rear.next=newNode;
            rear=newNode;
        }

    }

    public Integer dequeue(){
        if(rear==null && front==null){
            System.out.println("Queue is empty");
            return null;
        }
        Integer temp = front.data;
        // if only 1 element
        if(rear==front){
            rear=null;
            front=null;
        }
        //if more than one element
        else{
            front=front.next;
        }
        return temp;
    }
}



public class Main2 {
    public static void main(String[] args) {
        
    }
}
