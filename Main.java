
package main;

// Clase de prueba
public class Main {
    public static void main(String[] args) {
        // Obtener instancias de figuras geométricas del registro
        Shape circle = ShapeRegistry.getShape("Circle");
        Shape rectangle = ShapeRegistry.getShape("Rectangle");

        // Clonar una figura geométrica para obtener una nueva instancia
        Shape clonedCircle = circle.clone();
        Shape clonedRectangle = rectangle.clone();

        // Mostrar las figuras geométricas originales y las clonadas
        System.out.println("Original Circle: " + circle);
        System.out.println("Cloned Circle: " + clonedCircle);

        System.out.println("Original Rectangle: " + rectangle);
        System.out.println("Cloned Rectangle: " + clonedRectangle);
    }
}
