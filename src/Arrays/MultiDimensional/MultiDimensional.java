package Arrays.MultiDimensional;

public class MultiDimensional {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        arr1[0][0] = 5;
        arr1[1][1] = 5;
        arr1[2][2] = 5;

        int[][] arr2 = new int[3][];
        arr2[0] = new int[3];
        arr2[1] = new int[2];
        arr2[2] = new int[1];

        int[][] arr3 = {{1, 2, 3}, {4, 5}, {6}};

        String[] firstNames = {"John", "Mike", "Anna"};
        String[] lastNames = {"Smith", "Brown", "Lee"};

        String[][] fullNames = { firstNames, lastNames };
        System.out.println(fullNames[0][0] + " " + fullNames[1][0]);
        System.out.println(fullNames[0][1] + " " + fullNames[1][1]);
        System.out.println(fullNames[0][2] + " " + fullNames[1][2]);

        int[][][] cube = new int[3][3][3];
    }

}
