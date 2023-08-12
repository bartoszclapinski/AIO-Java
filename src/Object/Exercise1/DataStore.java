package Object.Exercise1;

public class DataStore {
    private final int MAX_COMPUTERS = 100;
    private final Computer[] computers = new Computer[MAX_COMPUTERS];
    private int computersNumber;

    public void add(Computer computer) {
        if (computersNumber < MAX_COMPUTERS) {
            computers[computersNumber] = computer;
            computersNumber++;
        } else {
            System.out.println("Store is full");
        }
    }

    public Computer get(int index) {
        if (index < computersNumber) {
            return computers[index];
        } else {
            return null;
        }
    }

    public int checkAvailability(Computer computer) {
        int count = 0;
        for (int i = 0; i < computersNumber; i++) {
            if (computer.equals(computers[i])) {
                count++;
            }
        }
        return count;
    }

    public Computer[] getComputers() {
        Computer[] comps = new Computer[computersNumber];
        System.arraycopy(computers, 0, comps, 0, computersNumber);
        return comps;
    }
}
