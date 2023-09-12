package WAP;

import java.util.HashMap;

/*
*WAP to find if two string are anagram of each other
* */
public class Anagram {
    HashMap<Character,Integer> h1=new HashMap<>();
    HashMap<Character,Integer> h2=new HashMap<>();
    String s1,s2;
    Anagram(String S1, String S2){
        this.s1=S1;
        this.s2=S2;
    }

    public static void main(String[] args) {
        Anagram Obj = new Anagram("bbaa","bbaa");
        for (Character c:Obj.s1.toCharArray()){
            Obj.h1.put(c,1+Obj.h1.getOrDefault(c,0));
        }
        for (Character c:Obj.s2.toCharArray()){
            Obj.h2.put(c,1+Obj.h2.getOrDefault(c,0));
        }
        if (Obj.h1.equals(Obj.h2)){
            System.out.println("YES");
        }else
            System.out.println("NO");
    }
}
