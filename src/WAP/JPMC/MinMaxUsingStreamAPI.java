package WAP.JPMC;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class MinMaxUsingStreamAPI {

    public static void main(String[] args) {
        int[] array = {-1,3,8,11,23,-9,98,-45,40};

        int min = Arrays
                .stream(array)
                .min()
                .orElse(Integer.MIN_VALUE);
       int max = Arrays
               .stream(array)
               .max()
               .orElse(Integer.MAX_VALUE);
        System.out.println(min);
        System.out.println(max);
    }
}
