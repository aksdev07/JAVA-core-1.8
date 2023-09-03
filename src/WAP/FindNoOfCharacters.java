package WAP;

import java.util.HashMap;
import java.util.Map;

public class FindNoOfCharacters {
    public static void main(String[] args) {
        String s = "aaaabbbb";
        HashMap<Character,Integer> hm = new HashMap<>();
        for (char c : s.toCharArray()){
            if(hm.containsKey(c))
                hm.put(c, hm.get(c)+1);
                else{
                    hm.put(c,1);
            }
        }
        for (Map.Entry<Character,Integer> entry: hm.entrySet()){
            System.out.printf(String.valueOf(entry.getKey()));
            System.out.printf(String.valueOf(entry.getValue()));
        }

    }
}
