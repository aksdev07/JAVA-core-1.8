package smallespositive;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int x = 1;
        int m = 0;
        int k = 1;
        boolean result=false;
        Arrays.sort(A);

        Set<Integer> hashSet = new HashSet<>();
        for (int b : A) {
            if (b > 0)
                hashSet.add(b);
        }
        Integer B[] = new Integer[hashSet.size()];

        for (int n : hashSet) {
            B[m++] = n;
        }
        HashMap<Integer, Integer> hm = new HashMap();
            for (int c:B)
                if(c>0) {
                    hm.put(c, k++);
                }
            for(int key : hm.keySet()){
                if(key!=hm.get(key)){
                    x=hm.get(key);
                    result=true;
                    break;
                }
            }
            if(result==false){
                x=hm.size()+1;
            }
        return x;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int A[] = {1,2,3};
        System.out.println(obj.solution(A));
    }
}