package WAP;

import java.util.*;

public class RemoveDuplicateCharsUsingHashSet {
    public static void main(String[] args) {


        String c1 = "aabbccd";

        Set<Character> hs = new HashSet<>();
        for (char ch : c1.toCharArray()){
            hs.add(ch);
        }

        Iterator<Character> itr = hs.iterator();
        String h = "";
        while (itr.hasNext()){
            h=h+itr.next();
        }
        System.out.println(h);

    }
}
