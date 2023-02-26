package src.java.Collection.List.Vector.Vector_Methods;

import java.util.Vector;

public class add {
    public static void main(String arg[]) {
        Vector <String> colors = new Vector <String>();
        colors.add("White");
        colors.add("Green");
        colors.add("Black");
        colors.add("Pink");
        for (String color: colors) {
            System.out.println("Element at index: "+colors.indexOf(color) + " Color: " +color);
        }
        colors.add(1, "Yellow");
        System.out.println("New color Yellow added at first position.");
        for (String color: colors) {
            System.out.println("Element at index: "+colors.indexOf(color) + " Color: " +color);
        }
    }
}
