public class Main{

    //function delcaration
    static void print(int x){
        if(x>5){
            return;
        }
        System.out.println(x++);
        print(x);
        return;
    }

    

    static void printRev(int x){
        if(x>=5){
            return;
        }
        printRev(++x);
        System.out.println(x);
        return;   
    }


    static void printReverse(int x){
        if(x<1){
            return;
        }
        System.out.println(x--);
        printReverse(x);
    }

    public static void main(String[] args) {
        //function call
        int x=5;
        printRev(x);;
    }
}