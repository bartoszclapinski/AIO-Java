package Arrays.Exercise2;

import java.util.Arrays;

public class CompareLetters {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "cBa";
        System.out.println(compareLetters(s1, s2));

        String s3 = "abc";
        System.out.println(compareLetters(s3, null));

        System.out.println(compareLetters(null, null));

    }

    public static boolean compareLetters(String s1, String s2) {
        if (s1 == null && s2 == null) return true;
        if (s1 == null || s2 == null) return false;

        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
