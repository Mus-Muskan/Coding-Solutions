import java.util.* ;
import java.io.*; 
public class Solution {
    public static int isCyclicRotation(String p, String q)  {
        String check =p+p;
        if(check.contains(q))
            return 1;
        return 0;
        
    
    }
}