package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class UniqueChars {
    public static void main(String[] args) {
        String sentence = "This is a sentence";
        Map<Character, Long> unique = sentence.toUpperCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        for (Character x : unique.keySet())
            System.out.print(x);
    }
}
