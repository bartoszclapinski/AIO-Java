package Abstract.interfaces;

public interface StringUtils {
    static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
