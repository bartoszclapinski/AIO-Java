package Recursion;

public class NumberAdder {
    public static void main(String[] args) {
        System.out.println(addNumbers(5));
    }

    private static int addNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return n + addNumbers(n - 1);
    }
}
