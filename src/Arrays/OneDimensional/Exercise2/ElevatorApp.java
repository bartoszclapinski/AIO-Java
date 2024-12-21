package Arrays.OneDimensional.Exercise2;

public class ElevatorApp {
    public static void main(String[] args) {
        Person p1 = new Person(1, 70);
        Person p2 = new Person(2, 80);
        Person p3 = new Person(3, 100);
        Person p4 = new Person(4, 50);
        Person p5 = new Person(5, 60);
        Person p6 = new Person(6, 90);        

        Elevator elevator = new Elevator(5);
        elevator.add(p1);
        elevator.add(p2);
        elevator.add(p3);
        elevator.add(p4);
        elevator.add(p5);
        elevator.add(p6);

        elevator.startElevator();
        elevator.emptyElevator();
    }
}
