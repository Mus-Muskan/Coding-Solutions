import java.util.* ;
import java.io.*; 
public class Solution {
	public static int countOnBits(int num) {
		// Write your code here.
        int ch[] = new int[10];
        int n=num , i=0 , count =0;
        while(n!=0)
        {
            ch[i++]=n%2;
            n=n/2;
        }
        for (i=0 ; i<10 ; i++)
            if(ch[i]==1) count++;   
        return count;
	}
}