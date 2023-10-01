package Abstract.interfaces;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width < 0) throw new IllegalArgumentException("Width must be positive");
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height < 0) throw new IllegalArgumentException("Height must be positive");
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * width + 2 * height;
    }
}
