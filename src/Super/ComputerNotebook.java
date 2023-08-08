package Super;

public class ComputerNotebook extends Computer {
    private int batteryLife;

    public ComputerNotebook(double cpuTemp, int ramMemory, int batteryLife) {
        super(cpuTemp, ramMemory);
        this.batteryLife = batteryLife;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public void printInfo() {
        System.out.println("ComputerNotebook: " + getCpuTemp() + " " + getRamMemory() + " " + getBatteryLife());
    }

    @Override
    public void coolDown() {
        super.coolDown();
        turboCoolDown();
    }

    private void turboCoolDown() {
        setCpuTemp(getCpuTemp() - 2);
    }
}
