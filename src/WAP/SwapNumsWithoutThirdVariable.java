package WAP;

public class SwapNumsWithoutThirdVariable {
    public static void main(String[] args) {
        int a=4, b=8;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("a="+a);
        System.out.print("b="+b);

    }
}
