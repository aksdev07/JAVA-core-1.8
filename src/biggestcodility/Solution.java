package biggestcodility;
//
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
//        int x = 0;
//        int c = 0;
//        int h=0;
//
//        Aays.sort(A);
//        int[] B = Aays.stream(A).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toAay();
//        HashSet<Integer> hs = new HashSet<>();
//        HashMap<Integer,Integer> hm = new HashMap<>();
//        HashMap<Integer,Integer> hm1 = new HashMap<>();
//        for (int n : B) {
//            if (n > 0)
//                hm1.put(n,n);
//        }
//        Integer C[] = new Integer[hm1.size()];
//        for (int k=hm1.size()-1;k>=0;k--) {
//            C[h++] = hm1.ge;
//        }
//        for (int n : hm1.keySet()) {
//            for (int i = A.length - 1; i > 0; i--) {
//                if (n == A[i]) {
//                    c++;
//                }
//            }
//            if(c==n){
//                hm.put(n,c);
//            }
//
//        }
//
//        return x;
//    }

       /* int max = 0;
        int counter = 1;
        for (int i=0; i<A.length;) {
            if (A[i]>max) {
                max = A[i];
                i++;
            }
            else i++;
        }
        for(int j = 0; j<A.length; j++) {
            if (A[j]==max) {
                counter++;
                j++;
            }
            else {
                j++;
            }
        }

        if(max == counter) {
            return counter;
        }
        else return 0;*/

        if (A == null || A.length == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : A) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int res = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int k = entry.getKey(), v = entry.getValue();
            if (k == v) {
                res = Math.max(res, k);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        int A[] = {3,8,2,3,3,2};
        System.out.println(obj.solution(A));
    }



}
