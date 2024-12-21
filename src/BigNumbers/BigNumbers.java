package BigNumbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {

        long x = 1234567890123456789L;
        System.out.println(x);
        //long y = 1234567890123456789123421L;

        double y = 0.7;
        double z = 0.3;
        // Why? Because of the way computers store numbers in memory.
        System.out.println(y - z); // 0.39999999999999997

        BigDecimal y1 = new BigDecimal("0.7");
        BigDecimal z1 = new BigDecimal("0.3");
        BigDecimal result1 = y1.subtract(z1);
        System.out.println(result1); // 0.4


        BigInteger a = new BigInteger("1234567890123456789");
        BigInteger b = new BigInteger("1234567890123456789123421");
        BigInteger result = a.add(b);
        System.out.println(result); // 1234567890124690258013310
        result = a.subtract(b);
        System.out.println(result); // -1234567890122203320239522
        
        BigInteger c = BigInteger.valueOf(1234567890123456789L); // long
        BigInteger one = BigInteger.ONE;
        BigInteger zero = BigInteger.ZERO;
        System.out.println(c + " " + one + " " + zero);


        double pow = Math.pow(2, 3);// 2^3 = 8
        double sqrt = Math.sqrt(9);// 3
        int abs = Math.abs(-5);// 5
        int max = Math.max(5, 6);// 6
        int min = Math.min(5, 6);// 5
        long round = Math.round(5.5);// 6
        double floor = Math.floor(5.5);// 5
        double ceil = Math.ceil(5.5);// 6
        double random = Math.random();// 0.0 <= x < 1.0
        double pi = Math.PI;// 3.141592653589793
        double e = Math.E;// 2.718281828459045
        double sin = Math.sin(0);
        System.out.println(pow + " " + sqrt + " " + abs + " " + max + " " + min + " " + round + " " + floor + " " + ceil + " " + random + " " + pi + " " + e + " " + sin);
        

    }
}
