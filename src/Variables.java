public class Variables {
    public static void main(String[] args) {
        String firstName = "Jan";
        String lastName = "Kowalski";
        int age = 25;
        double height = 180.5;
        final String pesel = "1234567890";

        System.out.println(firstName + " " + lastName + " ma " + age + " lat");
        System.out.println("Pan " + lastName + " ma pesel " + pesel);
        System.out.println(firstName + " ma wzrost " + height + "cm");
        System.out.println("Jeżeli " + firstName + " urośnie 5cm, to będzie miał " + (height + 5) + "cm");

        firstName = "Krzysztof";
        System.out.println("Imię po zmianie: " + firstName);


        //  Variables, exercise 1
        String marka = "Toyota";
        String model = "Corolla";
        int rok = 2023;
        double cena = 172432.23;

        System.out.println("Moje auto to " + marka + " " + model + " z " + rok + " roku, za kwotę " + cena + " PLN");

        //  Variables, exercise 2
        final String url = "http://javastart.pl";
        System.out.print("Strona, z której uczę się Javy to: ");
        System.out.println(url);

        int kevinYear = 1990;
        System.out.print("Film Kevin sam w domu został wydany w roku: ");
        System.out.println(kevinYear);

        double voterTurnout = 58;
        voterTurnout = 61.1;
        System.out.print("Procentowa frekwencja podczas ostatnich wyborów wyniosła: ");
        System.out.println(voterTurnout);
    }
}
