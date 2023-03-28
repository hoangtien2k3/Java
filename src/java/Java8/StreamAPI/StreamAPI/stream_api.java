package src.java.Java8.StreamAPI.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public boolean getPrices() {
        return price > 30000;
    }
}

public class stream_api {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));


        // Filtering Collection without using Stream
        List<Float> productPriceList = new ArrayList<Float>();
        for (Product product : productsList) {
            // filtering data of list
            if (product.price < 30000) {
                productPriceList.add(product.price);                        // adding price to a productPriceList
            }
        }
        System.out.println("\nPrice<30000: " + productPriceList);           // displaying data


        // Filtering Collection by using Stream
        List<Float> productPriceList2 = productsList
                .stream()
                .filter(p -> p.price < 30000)   // Product::getPrices
                .map(p -> p.price)                // fetching price
                .collect(Collectors.toList());  // collecting as list
        System.out.println("Price<30000: " + productPriceList2);


        // This is more compact approach for filtering data
        Float totalPrice = productsList.stream()
                .map(product -> product.price)
                .reduce(0.0f, (sum, price) -> sum + price);   // accumulating price
        System.out.println("\nSum price: " + totalPrice);           // tổng tất cả các price


        // More precise code
        float totalPrice2 = productsList.stream()
                .map(product -> product.price)
                .reduce(0.0f, Float::sum);                    // accumulating price, by referring method of Float class
        System.out.println("Sum price: " + totalPrice2);            // tổng tất cả các price


        // Sum by using Collectors Methods
        double totalPrice3 = productsList.stream()
                .collect(Collectors.summingDouble(product -> product.price));
        System.out.println("Sum price: " + totalPrice3);


        // Find Max and Min Product Price
        Product productA = productsList.stream()
                .max((product1, product2) -> product1.price > product2.price ? 1 : -1)
                .get();
        System.out.println("\nMax price: " + productA.price);


        // min() method to get min Product price
        Product productB = productsList
                .stream()
                .min((product1, product2) -> product1.price > product2.price ? 1 : -1)
                .get();
        System.out.println("Min price: " + productB.price);


        // count number of products based on the filter
        long count = productsList
                .stream()
                .filter(product -> product.price < 30000)
                .count();
        System.out.println("\nCount price < 30000: " + count);


        // Converting product List into Set
        Set<Float> productPriceLists = productsList.stream()
                .filter(product -> product.price < 30000)   // filter product on the base of price
                .map(product -> product.price)
                .collect(Collectors.toSet());       // collect it as Set(remove duplicate elements)
        System.out.println("\nConvert List -> Set: " + productPriceLists);


        // Converting Product List into a Map
        Map<Integer, String> productPriceMap = productsList
                .stream()
                .collect(Collectors.toMap(p -> p.id, p -> p.name));
        System.out.println("\nConvert List -> Map: " + productPriceMap);


        // Method Reference in stream
        List<Float> productPriceList_1 = productsList.stream()
                .filter(p -> p.price > 30000) // filtering data
                .map(Product::getPrice)         // fetching price by referring getPrice method
                .collect(Collectors.toList());  // collecting as list
        System.out.println("\nPrince > 30000: " + productPriceList_1);

    }
}