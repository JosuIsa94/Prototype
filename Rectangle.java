
package main;


// Clases concretas que implementan figuras geométricas específicas
public class Rectangle extends Shape {
    public Rectangle(String color) {
        super("Rectangle", color);
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this.color);
    }
}
