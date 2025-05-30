public class Main{

    // non parameterized
    static int i=0;
    static void print(){
        if(i==5){
            return;
        }
        System.out.println(i);
        i=i+1;
        print(); // same function is called again and again and again
    }

    //print from 1 to N
    static void printN(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        printN(i+1, n);
    }

    //find the sum of n numbers using recurssion...
    void sum(int i,int sum){
        if(i==0){
            return;
        }
        sum(i-1,sum+i);
    }

    static void sumofN(int i, int sum[]){
        if(i==0){
            return;
        }
        sum[0]=sum[0]+i;
        
        sumofN(i-1, sum);
    }


    //print from 1 to n using recursion

    //0
    public static void main(String[] args) {
        int sum[]= new int[1];
        sum[0]=0;
        //inorder to pass something as a reference in java we use an array...
        sumofN(5, sum);
        System.out.println(sum[0]);
    }
}