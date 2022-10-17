package Day 1;

public class Flying_Bird {

    static boolean Fly(int[] arr){
        int current = 0;
        int till = 0;
        for(int i = 0 ; i < arr.length - 1 ; i++){
            till = Math.max(till , arr[i]+i);
            if(current == i){
                current = till;
            }
        }
        if(current>= arr.length-1){
            return true;
        }
        return false;
}
    
}
