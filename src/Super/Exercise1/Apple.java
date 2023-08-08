package Super.Exercise1;

public class Apple extends Fruit {
    private String appleType;

    public Apple(int weight, String type, String appleType) {
        super(weight, type);
        this.appleType = appleType;
    }

    public String getAppleType() {
        return appleType;
    }

    public void setAppleType(String appleType) {
        this.appleType = appleType;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " " + getAppleType();
    }
}
