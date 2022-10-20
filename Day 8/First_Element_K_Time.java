//{ Driver Code Starts
    import java.util.*;
    import java.io.*;
    import java.lang.*;
    
    public class GfG { 
        public static void main (String[] args) throws IOException  {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            while(t-->0){
                String inputLine[] = br.readLine().trim().split(" ");
                int n = Integer.parseInt(inputLine[0]);
                int m = Integer.parseInt(inputLine[1]);
                int[] arr = new int[n];
                inputLine = br.readLine().trim().split(" ");
                for(int i=0; i<n; i++)arr[i] = Integer.parseInt(inputLine[i]);
                
                Solution obj = new Solution();
                System.out.println(obj.firstElementKTime(arr, n, m));
            }
        }
    }
    
    // } Driver Code Ends
    
    
    class Solution
    {
        public int firstElementKTime(int[] a, int n, int k) { 
            
            HashMap<Integer, Integer> Hmap = new HashMap<>();
    
            for(int i=0; i<n; i++)
            {
    
               if( Hmap.containsKey(a[i]) && Hmap.get(a[i]) < k ) 
               {  
                   Hmap.put(a[i], Hmap.get(a[i])+1);
               }
    
               else
               {
                   Hmap.put(a[i], 1);     
               }
    
               if(Hmap.get(a[i]) == k)
               return a[i];
    
            }
    
            return -1;
        } 
    }