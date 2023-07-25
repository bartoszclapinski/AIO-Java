package Super;

public class Computer {
    private double cpuTemp;
    private int ramMemory;

    public Computer(double cpuTemp, int ramMemory) {
        this.cpuTemp = cpuTemp;
        this.ramMemory = ramMemory;
    }

    public double getCpuTemp() {
        return cpuTemp;
    }

    public void setCpuTemp(double cpuTemp) {
        this.cpuTemp = cpuTemp;
    }

    public int getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }

    public void printInfo() {
        System.out.println("Computer: " + getCpuTemp() + " " + getRamMemory());
    }

    public void coolDown() {
        cpuTemp -= 1;
    }
}
