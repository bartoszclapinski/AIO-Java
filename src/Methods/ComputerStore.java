package Methods;

public class ComputerStore {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();

        Computer computer1 = new Computer("Intel Core i5", 8_192);
//        Computer computer1 = factory.create("Intel Core i5", 8_192);
//        computer1.processor = "Intel Core i5";
//        computer1.memory = 8_192;

        Computer computer2 = new Computer("AMD Ryzen 1700", 16_384);
//        Computer computer2 = factory.create("AMD Ryzen 1700", 16_384);
//        computer2.processor = "AMD Ryzen 1700";
//        computer2.memory = 16_384;

        System.out.println(computer1.processor + " " + computer1.memory);
        System.out.println(computer2.processor + " " + computer2.memory);

        computer1.printInfo();
        computer2.printInfo();

        ComputerUpdate computerUpdate = new ComputerUpdate();
        computerUpdate.addMemory(computer1, 4_096);
        computer1.printInfo();

    }
}
