
package main;


// Clase abstracta base para figuras geométricas
abstract class Shape implements Prototype {
    protected String name;
    protected String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public abstract Shape clone();

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}




