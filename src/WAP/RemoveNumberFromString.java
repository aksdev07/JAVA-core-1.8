package WAP;

import java.util.*;

public class RemoveNumberFromString {
     String n = "";

    public String returnAlphabetsUsingisDigit(String s) {
        n="";

        for (char ch : s.toCharArray()) {
            if (!Character.isDigit(ch)) {
                n = n + ch;
            }
        }
        return n;
    }

    public String returnAlphabetsUsingRegex(String s) {
        n="";

        n = s.replaceAll("\\d", "");
        return n;
    }

    public String returnNumsUsingisDigit(String s) {
        n="";

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                n = n + ch;
            }
        }
        return n;
    }

    public String returnNumsUsingRegex(String s) {

        n = s.replaceAll("[^\\d]", "");
        return n;
    }

    public static void main(String[] args) {
        String s = "Anuj123Kaushik";
        RemoveNumberFromString obj = new RemoveNumberFromString();
        System.out.println(obj.returnAlphabetsUsingisDigit(s));
        System.out.println(obj.returnAlphabetsUsingRegex(s));
        System.out.println(obj.returnNumsUsingisDigit(s));
        System.out.println(obj.returnNumsUsingRegex(s));

    }
}
