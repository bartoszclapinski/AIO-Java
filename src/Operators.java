public class Operators {
    public static void main(String[] args) {
        int x = 10;
        int y = 4;

        //  Arithmetic operators
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);

        //  Assignment operators
        y += 5;
        y -= 5;
        y *= 5;
        y /= 5;
        System.out.println(y);

        //  Comparison operators
        System.out.println("Is x higher than y? " + (x > y));
        System.out.println("Is x lower than y? " + (x < y));
        System.out.println("Is x equal to y? " + (x == y));
        System.out.println("Is x different than y? " + (x != y));
        System.out.println("Is x higher or equal to y? " + (x >= y));
        System.out.println("Is x lower or equal to y? " + (x <= y));

        //  Logical operators
        System.out.println("Is x higher than y and x lower than 10? " + ((x > y) && (x < 10)));
        System.out.println("Is x higher than y or x lower than 10? " + ((x > y) || (x < 10)));
        System.out.println("Is x higher than y and x lower than 10? " + (!(x > y) && (x < 10)));

        //  Incrementation and decremental operators
        var number = 5;
        //  Incrementation postfix
        System.out.println(number++);
        System.out.println(number);
        //  Incrementation prefix
        System.out.println(++number);
        System.out.println(number);
        //  Decremental postfix
        System.out.println(number--);
        System.out.println(number);
        //  Decremental prefix
        System.out.println(--number);
        System.out.println(number);

        //  Concatenation operator
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1 + " " + s2);

        int a = 2;
        int b = 3;
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + b + " is a sum of " + a + " and " + b);
        System.out.println("Sum of " + a + " and " + b + " is " + (a + b));

        System.out.println("True in boolean is " + true);
        System.out.println("Is x higher than y? " + (x > y));

        //  Conversions
        int i = 10;
        double j = 5.8;
        //  Implicit conversion
        double k = i;
        // int l = j;  //  Error
        //  Explicit conversion
        int l = (int) j;
        System.out.println(l);

        // Operators, exercise 1
        x = 5;
        y = 7;
        System.out.println("Is x higher than y? " + (x > y));
        System.out.println("Is x * 2 higher than y? " + ((x * 2) < y));
        System.out.println("Is y less than x + 3 and higher than x - 2? " + ((y < (x + 3)) && (y > (x - 2))));
        System.out.println("Is x * y even? " + (((x * y) % 2) == 0));

        //  Operators, exercise 2
        int price = 1000;
        double tax = 0.23;
        double taxValue = price * tax;
        double priceWithTax = price + taxValue;
        System.out.println("Price without tax: " + price);
        System.out.println("Tax rate: " + tax);
        System.out.println("Tax value: " + taxValue);
        System.out.println("Price with tax: " + priceWithTax);

    }
}
