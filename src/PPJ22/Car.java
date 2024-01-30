package PPJ22;

import java.awt.*;

public class Car {
    private String make;
    private java.awt.Color color;

    public Car(String make, Color color) {
        this.make = make;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", color=" + color +
                '}';
    }

    public String getMake() {
        return make;
    }

    public Color getColor() {
        return color;
    }
}
