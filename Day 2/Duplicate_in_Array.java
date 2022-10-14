import java.util.ArrayList;
import java.util.*;

public class Duplicate_in_Array {

	public static int findDuplicate(ArrayList<Integer> arr) {
            int N, sum=0,s=0, element;
            N=arr.size();
            sum=0;
            s=(N*(N-1))/2;
		    for(int i=0; i<=N-1 ; i++)
                sum=sum+arr.get(i);
            element=sum-s;     
            return element;
    }
}