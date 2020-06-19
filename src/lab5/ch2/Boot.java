package lab5.ch2;

public class Boot implements Shoe {
    private String color;
    private double size;

    public Boot(String color, double size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Boot{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
