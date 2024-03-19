
package main;


// Clases concretas que implementan figuras geométricas específicas
public class Circle extends Shape {
    public Circle(String color) {
        super("Circle", color);
    }

    @Override
    public Circle clone() {
        return new Circle(this.color);
    }
}

