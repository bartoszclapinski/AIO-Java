package Arrays.OneDimensional.Exercise1;

public class SumOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int sum1 = arr1[0] + arr1[1] + arr1[2];
        int sum2 = arr2[0] + arr2[1] + arr2[2];

        System.out.println("Sum of all elements: " + (sum1 + sum2));

        System.out.println("Sum of all elements: " + sumOfArrays(arr1, arr2));
    }

    private static int sumOfArrays(int[] arr1, int[] arr2){
        int sum1 = arr1[0] + arr1[1] + arr1[2];
        int sum2 = arr2[0] + arr2[1] + arr2[2];
        return sum1 + sum2;
    }
}
