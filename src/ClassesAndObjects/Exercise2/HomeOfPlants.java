package ClassesAndObjects.Exercise2;

public class HomeOfPlants {
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        plant1.name = "Cactus";
        plant1.description = "Cacti are succulent plants that live in dry areas.";
        plant1.dailyWaterConsumption = 0.1;

        Plant plant2 = new Plant();
        plant2.name = "Aloe Vera";
        plant2.description = "Aloe vera is a succulent plant species of the genus Aloe.";
        plant2.dailyWaterConsumption = 0.2;

        Plant plant3 = new Plant();
        plant3.name = "Orchid";
        plant3.description = "Orchids are a diverse and widespread family of flowering plants.";
        plant3.dailyWaterConsumption = 0.3;

        var dailyWaterConsumption =
                plant1.dailyWaterConsumption + plant2.dailyWaterConsumption + plant3.dailyWaterConsumption;
        System.out.println("Daily water consumption of all plants: " + dailyWaterConsumption);

        var weeklyWaterConsumption = 7 * dailyWaterConsumption;
        System.out.println("Daily water consumption of all plants: " + weeklyWaterConsumption);

        var yearlyWaterConsumption = 365 * dailyWaterConsumption;
        System.out.println("Daily water consumption of all plants: " + yearlyWaterConsumption);
    }
}
