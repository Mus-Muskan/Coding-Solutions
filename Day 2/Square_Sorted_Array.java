import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public static ArrayList<Integer> sqsorted(ArrayList<Integer> arr) {
		int n=arr.size();
        
        int elmt=0;
        for(int i=0; i<n ; i++)
        {
           elmt=arr.get(i); 
           elmt=elmt*elmt;
           arr.set(i, elmt);
        }
        Collections.sort(arr);
        
        
        return arr;
        
	}
}