package WrapperTypes;

public class WrapperTypes {
    /*

    Wrapper types are classes that encapsulate primitive types.
    They are used to represent primitive types as objects.
    They are immutable.
    They are final.
    They are used in collections.
    They are used in generics.

    Primitive type | Wrapper type
    byte           | Byte
    short          | Short
    int            | Integer
    long           | Long
    float          | Float
    double         | Double
    char           | Character
    boolean        | Boolean

     */

    public static void main(String[] args) {
        // Boxing
        int primitiveInt = 5;
        Integer wrapperInt = Integer.valueOf(primitiveInt);
        System.out.println(wrapperInt);

        // Unboxing
        int primitiveInt2 = wrapperInt.intValue();
        System.out.println(primitiveInt2);

        // Autoboxing
        Integer wrapperInt2 = primitiveInt;
        System.out.println(wrapperInt2);

        // Autounboxing
        int primitiveInt3 = wrapperInt2;
        System.out.println(primitiveInt3);

        // Wrapper types are immutable
        Integer wrapperInt3 = 5;
        wrapperInt3 = wrapperInt3 + 1;
        System.out.println(wrapperInt3);

        // Wrapper types are final
        // Integer wrapperInt4 = new Integer(5);
        // wrapperInt4 = wrapperInt4 + 1;
        // System.out.println(wrapperInt4);

        // Wrapper types are used in collections
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);

        // Wrapper types are used in generics
        java.util.ArrayList<Integer> list2 = new java.util.ArrayList<>();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        System.out.println(list2);

        // Wrapper types are used in collections
        java.util.ArrayList<Integer> list3 = new java.util.ArrayList<>();
        list3.add(5);
        list3.add(6);
        list3.add(7);

        // Parsing from String to primitive type
        String string = "5";
        int primitiveInt4 = Integer.parseInt(string);
        System.out.println(primitiveInt4);

        // Parsing from String to wrapper type
        String string2 = "5";
        Integer wrapperInt4 = Integer.valueOf(string2);
        System.out.println(wrapperInt4);





    }
}
