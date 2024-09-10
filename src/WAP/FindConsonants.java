package WAP;

public class FindConsonants {
    public static void main ( String[] args ) {
        String a = "Deepak";
        char[] s= a.toCharArray();
        for(int i=0;i<a.length();i++){
            if(!(s[i]=='a'||s[i]=='i'||s[i]=='e'||s[i]=='o'||s[i]=='u'||s[i]=='A'||s[i]=='I'||s[i]=='E'||s[i]=='O'||s[i]=='U')){
                System.out.println(s[i]);
            }
        }
    }
}
