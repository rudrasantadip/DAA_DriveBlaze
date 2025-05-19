class Stack{
    private int arr[];
    private int top;
    private int size=10;
    private int limit=1000;

    public Stack(){
        arr = new int[size];
        top=-1;
    }

    //push operation
    public void push(int data){
        if(size>=limit-1){
            int dummy[] = new int[arr.length];
            for(int i=0;i<dummy.length;i++){
                dummy[i]=arr[i];
            }
            size=size*2;
            arr = new int[size];

             for(int i=0;i<dummy.length;i++){
                arr[i]=dummy[i];
            }
        }
        top++;
        arr[top]=data;
    }

    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }

    public int peek() throws Exception{
        if(this.isEmpty()){
            System.out.println("Stack is empty");
            throw new Exception("Stack is empty");
        }
        else{
            return arr[top];
        }

    }

}


public class Test {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(55);
        stack.push(66);

        try {
            System.out.println(stack.peek());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
