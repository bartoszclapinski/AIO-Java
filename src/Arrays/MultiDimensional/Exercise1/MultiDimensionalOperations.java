package Arrays.MultiDimensional.Exercise1;

public class MultiDimensionalOperations {
    public static void main(String[] args) {
        double[][] arr = { {1.0, 1.5, 2.0}, {1.5, 2.0, 2.5}, {2.0, 2.5, 3.0} };

        System.out.println("Sum of products of diagonals: " + sumOfProductsOfDiagonals(arr));
        System.out.println("Product of sums of middle row and column: " + productOfSumsOfMiddleRowAndColumn(arr));
        System.out.println("Sum of all elements at edges: " + sumOfAllElementsAtEdges(arr));
    }

    private static double sumOfProductsOfDiagonals(double[][] arr){
        return (arr[0][0] * arr[1][1] * arr[2][2]) + (arr[0][2] * arr[1][1] * arr[2][0]);
    }

    private static double productOfSumsOfMiddleRowAndColumn(double[][] arr){
        return (arr[1][0] + arr[1][1] + arr[1][2]) * (arr[0][1] + arr[1][1] + arr[2][1]);
    }

    private static double sumOfAllElementsAtEdges(double[][] arr){
        return arr[0][0] + arr[0][1] + arr[0][2] + arr[1][0] + arr[1][2] + arr[2][0] + arr[2][1] + arr[2][2];
    }
}
