import java.util.ArrayList;

class Stack{
    private ArrayList<Integer> list;
    private Integer top; 
    
    public Stack(){
        this.list=new ArrayList<>();
        this.top=-1;
    }

    public boolean isEmpty(){
        if(top==-1 || list==null || list.size()==0){
            return true;
        }
        return false;
    }

    void push(int data){
       this.top++;
       this.list.add(data);
    }

    //peek -> returns the topmost element;
    int peek(){
        if(this.isEmpty()==true){
           System.out.println("stack is empty"); 
           return -1;
        }
        else{
            return list.get(top);
        }
    }

    int pop(){
        if(this.isEmpty()==true){
            System.out.println("stack is empty"); 
             return -1; 
        }
        else{
            return this.list.get(top--);
        }
    }
    
}

public class Main{
    public static void main(String[] args) { 
       Stack stack = new Stack();

       stack.push(5);
       stack.push(10);
       stack.push(15);

       System.out.println(stack.pop() +" is popped.");

       System.out.println(stack.peek()+" current top");


    }
}