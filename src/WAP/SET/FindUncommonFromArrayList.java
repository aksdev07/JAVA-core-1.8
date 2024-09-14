package WAP.SET;

import java.util.*;

public class FindUncommonFromArrayList {
    public static void main ( String[] args ) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(1,2,3,4,9);
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        Set<Integer> uncommon1 = new HashSet<>(set1);
        uncommon1.removeAll(set2);

         Set<Integer> uncommon2 = new HashSet<>(set2);
         uncommon2.removeAll(set1);


         uncommon1.addAll(uncommon2);
        System.out.println(uncommon1);
    }



}
