public class DataTypes {
    public static void main(String[] args) {
        System.out.println('b' + 'a');
        System.out.println('\u2603');

        //  Data types, exercise 1
        var age = 25;
        var firstCharOfName = 'J';
        var firstCharOfSurname = 'K';
        var bool = true;

        System.out.println("Cześć Jan, słyszałem, że masz " + age + " i uczysz się programowania. Czy to prawda?");
        System.out.println(bool);
        System.out.println("Czy Twoje inicjały to " + firstCharOfName + " " + firstCharOfSurname + "?");
        System.out.println("Tak, " + bool);

        //  Data types, exercise 2
        System.out.println("Mam Audi A4");
        System.out.println("Rocznik:");
        System.out.println(2004);
        System.out.println("Silnik o pojemności:");
        System.out.println(2.0);
    }
}
