package AccessSpecifiers.Exercise2.logic;

import AccessSpecifiers.Exercise2.model.Telephone;

public class Charger {

    public Telephone charge(Telephone telephone) {
        telephone.setChargeLevel(telephone.getChargeLevel() + 1);
        return telephone;
    }
}
