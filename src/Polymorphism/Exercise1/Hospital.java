package Polymorphism.Exercise1;

public class Hospital {
    private Person[] persons;
    private final int HOSPITAL_SIZE = 3;

    public Hospital() {
        this.persons = new Person[HOSPITAL_SIZE];
    }

    public void addPerson(Person person) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] == null) {
                persons[i] = person;
                break;
            }
        }
    }

    public void printPersons() {
        for (Person person : persons) {
            if (person != null) {
                person.printInfo();
            }
        }
    }


}
