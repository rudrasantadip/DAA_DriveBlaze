class Queue{
    private Integer front;
    private Integer rear;
    private Integer[] array;

    private Integer size = 10;

    public Queue(){
        this.front=-1;
        this.rear=-1;
        array = new Integer[size];
    }

    // INSERT OPERATION -> enqueue
    // DELETE OPERATION -> dequeue

    public Integer[] replaceArray(){
        size=size*2;
        Integer[] newArray = new Integer[size];

        for(int i=0;i<array.length;i++){
            newArray[i]=array[i];
        }
        return newArray;
    }
    
    public void enqueue(int data){
        //queue is empty...
        if(rear==-1 && front==-1){
            rear++; // 0
            front++;   //0 
            array[rear]=data;
            return;
        }
        // size overflow
        if(array.length>=size){
            array = replaceArray();
        }

        rear++;
        array[rear]=data;
        return;
    }

    public Integer dequeue(){
        //check if queue is empty..
        
        if(rear==-1 && front==-1){
            System.out.println("Queue is empty");
            return null;
        }

        Integer temp = array[front];
         array[front]=null;

        //if only one element...
        if(front==rear){  
            front=-1;
            rear=-1;
        }
        // more than one
        else{
            front++;
        }
        return temp;
    }
}

public class Main{
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}