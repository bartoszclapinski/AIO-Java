package String;

public class Formatting {
    public static void main(String[] args) {
        {
            String firstName = "John";
            String lastName = "Doe";
            int age = 25;
            char gender = 'M';
            double height = 180.5;

            System.out.println(
                    "First name: " + firstName +
                            ", last name: " + lastName +
                            ", age: " + age +
                            ", gender: " + gender +
                            ", height: " + height
            );

            // %[index$][flag][width][.precision]conversion
            //  %b - boolean, %c - char, %d - decimal, %f - float, %s - String
            System.out.printf(
                    "First name: %s, last name: %s, age: %d, gender: %c, height: %f \n",
                    firstName, lastName, age, gender, height
            );

            System.out.printf(
                    "First name: %2$s, last name: %3$s, age: %4$d, gender: %5$c, height: %1$f \n",
                    height, firstName, lastName, age, gender
            );

            String format = "First name: %s, last name: %s, age: %d, gender: %c, height: %f";
            String formatted = format.formatted(firstName, lastName, age, gender, height);
            System.out.println(formatted);
        }

        {
            double number = 1.23456789;
            System.out.printf("%.2f \n", number);

            int number1 = 123;
            double number2 = 123.456;
            String name = "John";

            System.out.printf("%5d %n", number1);
            System.out.printf("%10.2f %n", number2);
            System.out.printf("%10s %n", name);

            double positiveNumber = 123.456;
            double negativeNumber = -123.456;
            System.out.printf("%+.2f %n", positiveNumber);
            System.out.printf("%(010.2f %n", negativeNumber);

            int bigNumber = 123456789;
            System.out.printf("%,d %n", bigNumber);

            String name1 = "Ann";
            String name2 = "Sylvestre";
            int age1 = 25;
            int age2 = 30;

            System.out.printf("%-20s %s %n", "Name", "Age");
            System.out.printf("%-20s %d %n", name1, age1);
            System.out.printf("%-20s %d %n", name2, age2);

        }
    }
}
