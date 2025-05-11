/*
 * You are given an array arr of positive integers.
 * Your task is to find all the leaders in the array.
 * An element is considered a leader if it is greater than or equal to all elements to its right. 
 * The rightmost element is always a leader.
 * 
 * Example:- 
 * Input: arr = [16, 17, 4, 3, 5, 2]
   Output: [17, 5, 2]
   Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.

   Input: arr = [10, 4, 2, 4, 1]
   Output: [10, 4, 4, 1]
   Explanation: Note that both of the 4s are in output, as to be a leader an equal element is also allowed on the right. side
 */

import java.util.ArrayList;
import java.util.List;

public class Main{
  public static void main(String[] args) {
    int [] arr = {16,17,4,3,5,2};
    List<Integer> leaders = new ArrayList<>();

    for(int i=0;i<arr.length;i++)
    {
      for(int j=i+1;j<arr.length;j++)
      {
        if(arr[i]<=arr[j]){
          break;
        }
        else{
          leaders.add(arr[i]);
        }
      }
    }
    leaders.add(arr[arr.length-1]);

    System.out.println(leaders);
  }


 }