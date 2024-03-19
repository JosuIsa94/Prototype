
package main;

import java.util.HashMap;
import java.util.Map;

// Clase que actúa como un registro de prototipos
public class ShapeRegistry {
    private static Map<String, Shape> shapes = new HashMap<>();

    static {
        shapes.put("Circle", new Circle("Red"));
        shapes.put("Rectangle", new Rectangle("Blue"));
    }

    public static Shape getShape(String name) {
        Shape shape = shapes.get(name);
        if (shape != null) {
            return shape.clone();
        }
        return null;
    }
}
