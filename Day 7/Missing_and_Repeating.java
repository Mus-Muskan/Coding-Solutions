import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int s=(n*(n+1))/2;
        Collections.sort(arr);
        int i=0 , k=0 , sum=0, ans[]= new int[2];
        for (k=0 ; k<n ; k++)
            sum+=arr.get(k);
        for(i=1 ; i<=n ;i++)
        {
            if(!(arr.contains(i))) //Changed the function to find the missing element
            { 
                ans[0]=i;
                break;
            }
           
        }  
         ans[1]=sum+ans[0]-s;
       return ans; 
    }
}