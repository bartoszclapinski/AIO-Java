package Arrays.OneDimensional.Exercise2;

public class Elevator {
    Person[] people;
    int maxOccupancy;
    int currentOccupancy;

    public Elevator(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
        this.people = new Person[maxOccupancy];
        this.currentOccupancy = 0;
    }

    public void startElevator(){
        if (checkWeight() < 400) {
            System.out.println("Elevator is moving.");
        } else {
            System.out.println("Elevator is too heavy by " + (checkWeight() - 400) + " kg.");
        }
    }

    private double checkWeight() {
        double totalWeight = 0;
        for (int i = 0; i < getCurrentOccupancy(); i++) {
            totalWeight += people[i].getWeight();
        }
        return totalWeight;
    }

    private void stopElevator(){
        System.out.println("Elevator is stopped.");
    }

    public void emptyElevator(){
        stopElevator();
        for (int i = 0; i < getCurrentOccupancy(); i++) {
            people[i] = null;
        }
        setCurrentOccupancy(0);
        System.out.println("Elevator is empty.");
    }

    public Person[] getPeople() {
        return people;
    }

    private void addPerson(Person person){
        people[getCurrentOccupancy()] = person;
    }
    public void add(Person person){
        if (getCurrentOccupancy() < getMaxOccupancy()) {
            addPerson(person);
            setCurrentOccupancy(getCurrentOccupancy() + 1);
        } else {
            System.out.println("Elevator is full.");
        }
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public int getCurrentOccupancy() {
        return currentOccupancy;
    }

    private void setCurrentOccupancy(int currentOccupancy) {
        this.currentOccupancy = currentOccupancy;
    }
}
