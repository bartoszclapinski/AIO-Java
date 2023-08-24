package String;

public class StringsTest {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s3 == s4); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s3.equals(s4)); // true
        System.out.println(s1.intern() == s2.intern()); // true
        System.out.println(s1.intern() == s3.intern()); // true
        System.out.println(s3.intern() == s4.intern()); // true

        String s5 = "Hello";
        String s6 = s5 + " World";

        long start1 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append(i);
            sb.append(" ");
        }
        String numbers = sb.toString();
        long end1 = System.nanoTime() - start1;


        long start2 = System.nanoTime();
        String numbers2 = "";
        for (int i = 0; i < 1000; i++) {
            numbers2 += i + " ";
        }
        long end2 = System.nanoTime() - start2;

        System.out.println("Time 1: " + end1);
        System.out.println("Time 2: " + end2);
        System.out.println("Time 2 / Time 1: " + (double) end2 / end1);

        String s7 = "   One two three four    ";
        System.out.println(s7);
        String substring = s7.substring(3, 7);
        System.out.println(substring);
        String two = s7.replaceAll("two", "H@H@");
        System.out.println(two);

        String trim = s7.trim();
        System.out.println(trim);

        System.out.println(s7.charAt(5));
        System.out.println(s7.indexOf("t"));
        System.out.println(s7.lastIndexOf("t"));
        System.out.println(s7.startsWith("O"));
        System.out.println(s7.endsWith("r"));
        System.out.println(s7.contains("two"));
        System.out.println(s7.isEmpty());
        System.out.println(s7.length());
        System.out.println(s7.replace(" ", "_"));
        System.out.println(s7.toUpperCase());
        System.out.println(s7.toLowerCase());

    }
}
