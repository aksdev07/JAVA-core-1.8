package stream;

import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedChars {
    private final String input;

    public void repeatedChar() {

        Map<Character, Long> repeatedChar = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(repeatedChar);
    }

    RepeatedChars(String s) {
        this.input = s;
        repeatedChar();
    }

    public static void main(String[] args) {
        RepeatedChars repeatedChars = new RepeatedChars("aa");
    }
}
