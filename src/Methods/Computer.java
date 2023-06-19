package Methods;

public class Computer {
    String processor;
    double memory;

    public Computer(String processor, double memory) {
        this.processor = processor;
        this.memory = memory;
    }

    public Computer(String processor) {
        this.processor = processor;
    }

    public Computer(double memory) {
        this.memory = memory;
    }

    public Computer() {
    }

    String getInfo() {
        return processor + " " + memory;
    }

    void printInfo() {
        System.out.println(getInfo());
    }
}
