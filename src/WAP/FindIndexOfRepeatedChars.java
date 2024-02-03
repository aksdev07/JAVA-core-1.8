package WAP;

import java.util.HashMap;

public class FindIndexOfRepeatedChars {
    public static void main(String[] args) {
        String  input = "1234555567";
        HashMap<Character, String> hm = new HashMap<>();
        int count = 0;
        for (Character c : input.toCharArray()){
            if(hm.containsKey(c)){
                hm.put(c,(hm.get(c)+count++));
            }
            else {
                hm.put(c, String.valueOf(count++));
            }
        }



        int max = 0;
        String x = null;
        for (String s: hm.values()){
            if(s.length()>1 || s.length()>max){
                max=s.length();
                x=s;
            }
        }

        System.out.print("{"+x.charAt(0)+",");
        System.out.print(x.charAt(x.length()-1)+"}");


    }
}
