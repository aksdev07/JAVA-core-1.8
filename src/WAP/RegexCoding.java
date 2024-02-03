package WAP;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCoding {

    public static void regexByPatternMatcher(){
        long start = System.nanoTime();
        Pattern pattern = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools6!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            long end = System.nanoTime();
            System.out.println("Match found");
            System.out.println(matcher.toMatchResult().group());

            System.out.println("Time Taken to find the regex value " +
                    (end - start) + "ms");

        } else {
            System.out.println("Match not found");
        }
    }

    public static void regexByCharacterClassMethods(){
        long start = System.nanoTime();
        String s = "Visit W3Schools6!";
        for (char c : s.toCharArray()){
            if(Character.isDigit(c)){
                long end = System.nanoTime();
                System.out.println("Time Taken to find the regex value " +
                        (end - start) + "ms");
                System.out.println(c);
            }
        }
    }
    public static void regexByOldSchoolWay(){
        long start = System.nanoTime();
        String s = "Visit W3Schools6!";
        String[] str = s.split("[^0-9]");
        for (String string : str){

            System.out.println(string);
        }
        long end = System.nanoTime();
        System.out.println("Time Taken to find the regex value " +
                (end - start) + "ms");
    }
    public static void main(String[] args) {
        //regexByPatternMatcher();
        //regexByCharacterClassMethods();
        regexByOldSchoolWay();
    }
}