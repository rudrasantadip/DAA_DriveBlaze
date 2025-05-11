public class Question1 {
    public static void main(String[] args) {
        int arr []= {1,2,4,5};
        int i,j;
        boolean flag=false;
        // for values
        for(i=1;i<=5;i++)
        {
            flag=false;
            for(j=0;j<arr.length;j++)
            {
                /* i=3
                    j-> 0 , arr[0]=1, arr[1]->2,arr[2]->, arr[3]-> arr[4]->
                 * 
                 */
                if(arr[j]==i) 
                {
                    flag=true;
                    break;
                }
                else{
                    flag=false;
                }
            }
            if(flag==false)
            {
                break;
            }
        }
        System.out.println(i);
    }
}
