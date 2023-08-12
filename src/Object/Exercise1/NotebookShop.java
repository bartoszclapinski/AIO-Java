package Object.Exercise1;

public class NotebookShop {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();
        dataStore.add(new Computer("Dell", 1234));
        dataStore.add(new Computer("Apple", 1234));
        dataStore.add(new Computer("Asus", 123));
        dataStore.add(new Computer("Asus", 123));
        dataStore.add(new Computer("Asus", 234));

        System.out.println("Check availability of computer: "
                + dataStore.checkAvailability(new Computer("Asus", 123)));

        for (var computer : dataStore.getComputers()) {
            System.out.println(computer);
        }
    }
}
