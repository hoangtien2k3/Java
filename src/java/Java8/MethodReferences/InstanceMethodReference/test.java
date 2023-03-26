package src.java.Java8.MethodReferences.InstanceMethodReference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Shipment {
    public double calculateWeight() {
        double weight = 0;
        // Calculate weight
        return weight;
    }
    public static List<Double> calculateOnShipments(
            List<Shipment> l, Function<Shipment, Double> f) {
        List<Double> results = new ArrayList<>();
        for(Shipment s : l) {
            results.add(f.apply(s));
        }
        return results;
    }
}

public class test {
    public static void main(String[] args) {
        List<Shipment> l = new ArrayList<Shipment>();

        // Using an anonymous class
        Shipment.calculateOnShipments(l, new Function<Shipment, Double>() {
            public Double apply(Shipment s) { // The object
                return s.calculateWeight(); // The method
            }
        });

        // Using a lambda expression
        Shipment.calculateOnShipments(l, s -> s.calculateWeight());

        // Using a method reference
        Shipment.calculateOnShipments(l, Shipment::calculateWeight);
    }
}
