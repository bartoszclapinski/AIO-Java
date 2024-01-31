package Arrays.Exercise1;

public class PersonApp {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("John", "Smith", "12345678901");
        people[1] = new Person("Jane", "Smith", "12345623112");
        people[2] = new Person("Marry", "Don", "12345678901");

        System.out.println("People: ");
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("PeopleDatabase: ");
        PersonDatabase personDatabase = new PersonDatabase();
        personDatabase.add(people[0]);
        personDatabase.add(people[1]);
        personDatabase.add(people[2]);
        personDatabase.print();

        System.out.println("Removing Jane Smith:");
        personDatabase.remove(people[1]);
        personDatabase.print();

        System.out.println("Removing John Smith: ");
        personDatabase.remove(people[0]);
        personDatabase.print();

    }
}
