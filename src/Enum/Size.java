package Enum;

public enum Size {
    XSMALL("XS"),
    SMALL("S"),
    MEDIUM("M"),
    LARGE("L");

    private final String description;

    Size(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static Size fromDescription(String description) {
        for (Size size : Size.values()) {
            if (size.getDescription().equals(description)) {
                return size;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Size{" +
                "description='" + description + '\'' +
                "} " + super.toString();
    }
}
