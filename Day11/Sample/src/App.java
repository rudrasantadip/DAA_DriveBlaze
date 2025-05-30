import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import linkedlist.Node;

public class App {
    public static void main(String[] args) throws Exception {
        Node node = new Node(1);

        //. operator
        
        Field[] arr = Node.class.getDeclaredFields();
        Constructor[] constructors=   Node.class.getDeclaredConstructors();

        for(int i=0;i<arr.length;i++){
            System.out.println(
                arr[i].getName()+" "+
                arr[i].getType()
                );
        }

          for(int i=0;i<constructors.length;i++){
            System.out.println(constructors[i].getName()+" "+constructors[i].getParameterCount());
        }
        
    }
}
// First Principle -> 1 Job Per Class