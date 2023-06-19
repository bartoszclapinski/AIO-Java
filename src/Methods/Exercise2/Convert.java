package Methods.Exercise2;

public class Convert {
    public static void main(String[] args) {
        ConvertMetricUnits convertMetricUnits = new ConvertMetricUnits();
        System.out.println(convertMetricUnits.convertMetersToCentimeters(2));
        System.out.println(convertMetricUnits.convertMetersToMillimeters(2));
        System.out.println(convertMetricUnits.convertCentimetersToMeters(200));
        System.out.println(convertMetricUnits.convertMillimetersToMeters(2000));

        ConvertTimeUnits convertTimeUnits = new ConvertTimeUnits();
        double hoursToMinutes = convertTimeUnits.convertHoursToMinutes(14);
        double minutesToSeconds = convertTimeUnits.convertMinutesToSeconds(hoursToMinutes);
        double secondsToMilliseconds = convertTimeUnits.convertSecondsToMilliseconds(minutesToSeconds);
        System.out.println(secondsToMilliseconds);

    }
}
