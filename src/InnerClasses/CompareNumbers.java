package InnerClasses;

public class CompareNumbers {
    public static void main(String[] args) {
        int[] tab = {5, 10, -8, -23, 1009, 2938, 153, 24};

        // Anonymous class
        BiggestNumber biggestNumber = new BiggestNumber() {
            @Override
            public int takeBiggest(int[] numbers) {
                if (numbers == null || numbers.length == 0) {
                    throw new IllegalArgumentException("Array is empty");
                }
                int result = numbers[0];
                for (int i = 1; i < numbers.length; i++) {
                    if (numbers[i] > result) {
                        result = numbers[i];
                    }
                }
                return result;
            }
        };

        System.out.println("The biggest number: " + biggestNumber.takeBiggest(tab));
    }
}
