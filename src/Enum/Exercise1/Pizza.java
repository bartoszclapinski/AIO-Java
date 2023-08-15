package Enum.Exercise1;

public enum Pizza {
    MARGHERITA(true, true, false, false),
    CAPRICIOSA(true, true, true, false),
    PROSCIUTTO(true, true, false, true);

    private final boolean tomatoSauce;
    private final boolean cheese;
    private final boolean mushrooms;
    private final boolean ham;

    Pizza(boolean tomatoSauce, boolean cheese, boolean mushrooms, boolean ham) {
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.mushrooms = mushrooms;
        this.ham = ham;
    }

    public boolean isTomatoSauce() {
        return tomatoSauce;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    public boolean isHam() {
        return ham;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "tomatoSauce=" + tomatoSauce +
                ", cheese=" + cheese +
                ", mushrooms=" + mushrooms +
                ", ham=" + ham +
                "} " + super.toString();
    }
}
