package Methods;

public class ComputerFactory {

    Computer create(String processor, double memory) {
        Computer computer = new Computer(processor, memory);
//        computer.processor = processor;
//        computer.memory = memory;
        return computer;
    }
}
