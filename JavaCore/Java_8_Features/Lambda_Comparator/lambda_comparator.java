package JavaCore.Java_8_Features.Lambda_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class lambda_comparator {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();

        // Add cac san pham
        list.add(new Product(1, "Dell Laptop", 25000f));
        list.add(new Product(3, "Keyboard", 300f));
        list.add(new Product(2, "Dell Mouse", 150f));

        System.out.println("Sap xep cac san pham theo ten: ");

        // cai dat bieu thuc lambda
        Collections.sort(list, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });
        for (Product p : list) {
            System.out.println(p.id + " " + p.name + " " + p.price);
        }
    }
}
