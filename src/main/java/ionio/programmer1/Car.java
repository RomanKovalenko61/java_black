package ionio.programmer1;

import java.io.Serializable;

public class Car implements Serializable {
    private static final long serialVersionUID = 8807084026689866118L;

    String model;
    String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
