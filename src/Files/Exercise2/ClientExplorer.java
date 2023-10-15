package Files.Exercise2;

import java.util.Scanner;

public class ClientExplorer {
    public static void main(String[] args) {
        final String fileName = "src/Files/Exercise2/clients.csv";

        try {
            Client[] clients = ClientDataReader.readClient(fileName);
            printMostValuableClient(clients);
            String country = readCountryFromUser(clients);
            printClientsFromCountry(clients, country);
            printAvgValueFromCountry(clients, country);
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }


    }

    private static void printAvgValueFromCountry(Client[] clients, String country) {
        double totalValue = 0;
        int clientsFromCountry = 0;
        for (Client client : clients) {
            if (client.getCountry().equals(country)) {
                totalValue += client.getValue();
                clientsFromCountry++;
            }
        }
        if (totalValue > 0)
            System.out.println("Average value from " + country + ": " + totalValue / clientsFromCountry);
    }

    private static void printClientsFromCountry(Client[] clients, String country) {
        boolean isAnyClientFromCountry = false;
        System.out.println("Clients from " + country + ":");
        for (Client client : clients) {
            if (client.getCountry().equals(country)) {
                System.out.println(client);
                isAnyClientFromCountry = true;
            }
        }
        if (!isAnyClientFromCountry) {
            System.out.println("No clients from " + country);
        }
    }

    private static String readCountryFromUser(Client[] clients) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter country: ");
        return scanner.nextLine();
    }

    private static void printMostValuableClient(Client[] clients) {
        Client mostValuableClient = clients[0];
        for (Client client : clients) {
            if (client.getValue() > mostValuableClient.getValue()) {
                mostValuableClient = client;
            }
        }
        System.out.println("Most valuable client: " + mostValuableClient);
    }
}
