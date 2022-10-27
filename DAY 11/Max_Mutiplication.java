import java.util.* ;
import java.io.*; 
public class Solution {
	public static int ninjaCandidate(ArrayList<Integer> arr) {
		 //Write your code here
        int n=arr.size();
        Collections.sort(arr);
        
        int start=arr.get(n-1)*arr.get(n-2)*arr.get(n-3);
        int end=arr.get(0)*arr.get(1)*arr.get(2);
        return Math.max(start,end);
	}
}
