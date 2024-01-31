package GenericTypes;

public class GenericMethods {
    public static void main(String[] args) {
        print5times("Hello five times");
    }

    public static <T> void print5times(T arg){
        for (int i = 0; i < 5; i++) {
            System.out.println(arg);
        }
    }
}
