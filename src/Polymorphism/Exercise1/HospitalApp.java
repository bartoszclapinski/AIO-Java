package Polymorphism.Exercise1;

public class HospitalApp {
    public static void main(String[] args) {
        Person doctor = new Doctor("John", "Smith", 10000, "Surgeon");
        Person nurse1 = new Nurse("Jane", "Smith", 5000, 10);
        Person nurse2 = new Nurse("Ann", "Smith", 5000, 10);

        Hospital hospital = new Hospital();
        hospital.addPerson(doctor);
        hospital.addPerson(nurse1);
        hospital.addPerson(nurse2);

        hospital.printPersons();
    }
}
