package InnerClasses.Exercise;

public class SortApp {
    public static void main(String[] args) {
        int[] arrayToSort = { 123, 1, 1345, 34, 54, 234, 99, 33, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

        // Anonymous class, implementing Sortable interface
        // Implementing sort() method as bubble sort
        Sortable sortable = new Sortable() {
            @Override
            public int[] sort(int[] numbers) {
                if (numbers == null || numbers.length == 0) {
                    throw new IllegalArgumentException("Array is empty");
                }
                int[] result = numbers.clone();
                for (int i = 0; i < result.length; i++) {
                    for (int j = 0; j < result.length - 1; j++) {
                        if (result[j] > result[j + 1]) {
                            int temp = result[j];
                            result[j] = result[j + 1];
                            result[j + 1] = temp;
                        }
                    }
                }
                return result;
            }
        };

        int[] sortedArray = sortable.sort(arrayToSort);
        for (int number : sortedArray) {
            System.out.print(number + " ");
        }

    }

}
