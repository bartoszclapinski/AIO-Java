package Loops;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i % 2 == 0) System.out.println(i);
            i++;
        }

        int j = 0;
        do {
            if (j % 2 == 0) System.out.println(j);
            j++;
        } while (j < 10);

        int[] numbers = { 1, 2, 3, 4, 5 };
        int k = 0;
        while (k < numbers.length) {
            System.out.println(numbers[k]);
            k++;
        }

        int[] numbers2 = { 1, 2, 3, 4, 5 };
        int l = 0;
        do {
            System.out.println(numbers2[l]);
            l++;
        } while (l < numbers2.length);

        int[] numbers3 = { 1, 2, 3, 4, 5 };
        int m = 0;
        while (m < numbers3.length) {
            if (m % 2 == 0) {
                m++;
                continue;
            }
            System.out.println(numbers3[m]);
            m++;
        }

        int[] numbers4 = { 1, 2, 3, 4, 5 };
        int n = 0;
        while (n < numbers4.length) {
            if (n == 3) break;
            System.out.println(numbers4[n]);
            n++;
        }

        int[] numbers5 = { 1, 2, 3, 4, 5 };
        int o = 0;
        while (o < numbers5.length) {
            if (o == 3) {
                o++;
                continue;
            }
            System.out.println(numbers5[o]);
            o++;
        }

        int[] numbers6 = { 1, 2, 3, 4, 5 };
        int p = 0;
        while (p < numbers6.length) {
            if (p == 3) {
                break;
            }
            System.out.println(numbers6[p]);
            p++;
        }

    }
}
