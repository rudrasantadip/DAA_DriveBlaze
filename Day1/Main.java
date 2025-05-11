import java.util.Scanner;

public class Main{

    /**
     * @param arr
     * @param n
     * @return none
     * @implNote for inserting in an array
    */
    public static void takeArray(int arr[], int n)
    {
        Scanner sc = new Scanner(System.in);   // taking user input
        for(int i=0;i<n;i++){ // 0->n-1
            System.out.print("["+i+"]: ");
            arr[i]=sc.nextInt();
        }
        sc.close(); // to avoid resource leakage
    }


    public static void printArray(int arr[], int n){
        System.out.print("(");
        int i=0;
        for(;i<n-1;){
            System.out.print(arr[i]+" ,");
            i+=1;
        }
        System.out.print(arr[i]+")\n");
    }

    public static void insert(int arr[],int n,int targetValue, int targetIndex){
        for(int i=n-1;i>=targetIndex;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[targetIndex]=targetValue;
    }

    public static void delete(int arr[], int n, int targetIndex){
        for(int i=targetIndex+1;i<n;i++){
            arr[i-1]=arr[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[100]; // creation 
        takeArray(arr, 5);
        System.out.println("Before inserting");
        printArray(arr, 5);
        insert(arr, 5,100, 2);  
        insert(arr, 6, 45, 0);

        System.out.println("After Inserting");
        printArray(arr, 6);

        System.out.println("After deleting");
        delete(arr, 6, 3);
        printArray(arr, 5);
    }
}