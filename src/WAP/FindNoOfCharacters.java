package WAP;

import java.util.HashMap;
import java.util.Map;

public class FindNoOfCharacters {
   /*
   This method prints the char and it equivalent count
   * for example: aabbaa --->
   *              a2
   *              b2
   *              a2
   * Don't get confused with HashMap logic where all the repeated characters are counted at once
   * */
    public static void charactersWithCount(String string){
        StringBuilder stringBuilder = new StringBuilder(string);
        char c = stringBuilder.charAt(0);
        int count =0;
        for (char x : stringBuilder.toString().toCharArray()){
            if(c==x){
                count++;
            }else {
                System.out.println(String.valueOf(c)+count);
                c=x;
                count=1;
            }
        }
        System.out.println(String.valueOf(c)+(count));

    }
    public static void main(String[] args) {
        String s = "ddddjjaaaaaa";

FindNoOfCharacters.charactersWithCount(s);
        HashMap<Character,Integer> hm = new HashMap<>();
        for (char c : s.toCharArray()){
            if(hm.containsKey(c))
                hm.put(c, hm.get(c)+1);
                else{
                    hm.put(c,1);
            }
        }

        for (Map.Entry<Character,Integer> entry: hm.entrySet()){
            System.out.print(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
