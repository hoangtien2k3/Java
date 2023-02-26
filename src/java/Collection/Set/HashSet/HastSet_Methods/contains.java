package src.java.Collection.Set.HashSet.HastSet_Methods;

import java.util.HashSet;

public class contains {
    public static void main(String[] args) {
        HashSet<String> setA = new HashSet<String>();
        HashSet<String> setB = new HashSet<String>();
        setB.add("Java");
        setB.add("Python");
        setB.add("Java");
        setB.add("PHP");
        // Thêm các phần tử setB khác vào setA trong Java
        setA.addAll(setB);

        System.out.println("Số phần tử của setA: " + setA.size());
        System.out.println("Các phần tử của setA: " + setA);
        System.out.println("setA có chứa Java không? " + setA.contains("Java")); // true (vì setA có chưa contains "Java" )
        System.out.println("setA có chứa C++ không? " + setA.contains("C++"));  // false ( vì setA không contais "C++" )

    }
}
