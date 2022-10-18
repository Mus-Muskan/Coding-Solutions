import java.util.* ;
import java.io.*; 

public class Solution {

  public static int[] parityMove(int a[], int n) {
    // Write your code here.
      int i=0, ar[]= new int[n];int j=0;
    for (i=0; i<n ; i++)
    {
        if((a[i]%2)==0)
        ar[j++]=a[i];         
    }
        for (i=0; i<n ; i++)
    {
        if((a[i]%2)!=0)
        ar[j++]=a[i];         
    }
      for (i=0 ; i < n ; i++)
          a[i]=ar[i];
      return a;
  }
}