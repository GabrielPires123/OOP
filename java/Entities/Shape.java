package Entities;

import EntitiesEnum.Color;

public abstract class Shape {

    private Color color;

    public abstract double area();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shape(Color color) {
        this.color = color;
    }
}
