package Super;

public class ComputerStore {
    public static void main(String[] args) {
        Computer computer = new Computer(50, 16348);

        ComputerNotebook computerNotebook = new ComputerNotebook(45, 8192, 1000);

        computer.printInfo();
        computerNotebook.printInfo();

    }
}
