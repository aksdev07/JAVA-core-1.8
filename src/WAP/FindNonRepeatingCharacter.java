package WAP;

import java.util.HashMap;
import java.util.Map;

public class FindNonRepeatingCharacter {
    HashMap<Character, Integer> h1 = new HashMap<>();
    String s1;

    public FindNonRepeatingCharacter(String s1) {
        this.s1 = s1;
    }

    protected Character getNonRepeatChar() {
        char a = 'a';
        for (Character c : s1.toCharArray()) {
            h1.put(c, 1+h1.getOrDefault(c, 0));
        }
        for (Map.Entry<Character, Integer> set : h1.entrySet()) {
            if (set.getValue() == 1) {
                a = set.getKey();
                break;
            }

        }
        return a;
    }

    static class Demo extends FindNonRepeatingCharacter {

        Demo(String s1) {
            super(s1);
        }

        public static void main(String[] args) {
            Demo obj = new Demo("aabc");
            System.out.println(obj.getNonRepeatChar());
        }
    }
}
