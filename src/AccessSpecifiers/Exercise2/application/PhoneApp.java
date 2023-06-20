package AccessSpecifiers.Exercise2.application;

import AccessSpecifiers.Exercise2.logic.Charger;
import AccessSpecifiers.Exercise2.model.Telephone;

public class PhoneApp {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("Samsung", "Galaxy S21", 4000, 50);
        System.out.println(telephone);

        Charger charger = new Charger();
        for (int i = 0; i < 5; i++) charger.charge(telephone);

        System.out.println(telephone);
    }
}
