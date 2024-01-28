package Recursion;

public class OddTester {
    public static void main(String[] args) {
        System.out.println(isOdd(5));
    }

    private static boolean isOdd(int n) {
        if (n == 1) {
            return true;
        }
        return !isOdd(n - 1);
    }
}
