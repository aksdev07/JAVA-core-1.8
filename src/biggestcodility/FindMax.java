package biggestcodility;

public class FindMax {
    public static int Max(String s) {
        var max = 0;
        char[] a = s.toCharArray();
        for (int i = 1; i < s.length(); i++) {
            int current = (a[i - 1] - '0') * 10 + (a[i] - '0');
            if (current > max)
                max = current;

        }
        return max;
    }

    public static void main(String[] args) {
        String s = "01";
        String m = "SAM123SUNG456";
        m = m.replace("123", "");
        m = m.replace("456", "");
        System.out.println(m);
        char[] a = m.toCharArray();
        char[] b = new char[m.length()];
        for (int i = 0, j = 0; i < a.length; i++) {
            if (!(a[i] >= '0' && a[i] <= '9')) {
                b[j] = a[i];
                j++;
            }
        }
       // System.out.println(new String(b));
        System.out.println(Max(s));
    }
}
