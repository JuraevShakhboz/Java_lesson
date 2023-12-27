package Ikkinchi_Oy.OOP;

import java.util.Arrays;
import java.util.List;

public class DrawingApp {

    public static void main(String[] args) {

        List<Polygon> polygons = Arrays.asList(
                new Circle(),
                new Triangle(),
                new Rectangle(),
                new Square());

        
        for (Polygon p : polygons) {
            p.draw();
        }
    }
}