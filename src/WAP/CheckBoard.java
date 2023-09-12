package WAP;

import java.math.BigInteger;

public class CheckBoard {
    public static void main(String[] args) {
        BigInteger a= new BigInteger("2");
        BigInteger b= new BigInteger("2");
        System.out.println("a = "+1);
        System.out.println("a = "+2);
        for (int i=3;i<=64;i++){
            b= b.multiply(a);
            System.out.println(i+ " = "+b);
        }
    }
}
