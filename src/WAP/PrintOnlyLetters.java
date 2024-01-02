package WAP;

public class PrintOnlyLetters {
    public static void main(String[] args) {
        String str = "A!B@C#D$E%.";
        String onlyLetter = "";

        for (char c: str.toCharArray()){
            if(Character.isLetter(c)){
                onlyLetter = onlyLetter+c;
            }
        }
        System.out.println(onlyLetter);
    }
}
