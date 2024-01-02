package WAP;

import java.util.*;

public class RemoveDuplicateCharsUsingHashSet {
    public static void main(String[] args) {


        String c1 = "aabbccdddcc";

//        Set<Character> hs = new HashSet<>();
//        for (char ch : c1.toCharArray()){
//            hs.add(ch);
//        }
//
//        Iterator<Character> itr = hs.iterator();
//        String h = "";
//        while (itr.hasNext()){
//            h=h+itr.next();
//        }
//        System.out.println(h);
        HashSet<Character> hs = new HashSet<>();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch : c1.toCharArray()){
            if(!(hs.add(ch))){
                System.out.println(ch);
                if(hm.containsKey(ch)){
                    hm.put(ch,hm.get(ch)+1);
                }else
                    hm.put(ch,1);
            }
        }
       for(char key : hm.keySet()){
           if(hm.get(key)>=2)
           System.out.println("Key : "+key+" Value : "+hm.get(key));
       }

    }
}