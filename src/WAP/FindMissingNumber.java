package WAP;

import java.util.HashMap;
import java.util.Map;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 8};
        findGaps(arr);
    }

    public static void findGaps ( int[] arr ) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0; i<arr.length - 1; i++) {
            hm.put(arr[i], i);
        }
        int min=arr[0];
        int max=arr[arr.length - 1];
        for(int j=min; j<max; j++) {
            if( !hm.containsKey(j) )
                System.out.println(j);
        }
    }
}