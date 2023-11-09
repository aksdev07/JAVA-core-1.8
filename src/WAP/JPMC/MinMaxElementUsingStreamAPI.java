package WAP.JPMC;

import java.util.Arrays;

public class MinMaxElementUsingStreamAPI {
    public static void main(String[] args) {
        String[] array = {"100","nitin","venkat","aa","z","Cognizant"};

        String minLength = Arrays
                .stream(array)
                .min((str1,str2)->Integer.compare(str1.length(),str2.length()))
                .orElse("");
String maxLength = Arrays
                .stream(array)
                .max((str1,str2)->Integer.compare(str1.length(),str2.length()))
                .orElse("");

//        int max = Arrays
//                .stream(array)
//                .max()
//                .orElse(Integer.MAX_VALUE);
//        System.out.println(min);
        System.out.println(minLength);
  System.out.println(maxLength);
    }
}
