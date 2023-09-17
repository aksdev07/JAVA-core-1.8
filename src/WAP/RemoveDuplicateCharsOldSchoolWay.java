package WAP;

public class RemoveDuplicateCharsOldSchoolWay {
    public static void main(String[] args) {
        String name1 = "aaaaabbbbbbccccc";

        char name[] = name1.toCharArray();
        int index = 0;
        for (int i = 0; i < name1.length(); i++) {
            int j = 0;
            for (j = 0; j < i; j++) {
                if (name[i] == name[j]) {
                    break;
                }
            }
            if (i == j) {
                name[index++] = name[i];
            }
        }

        for (int i=0;i<index;i++) {
            System.out.println(name[i]);
        }

    }
}
