package src.java.JavaCore;

import java.util.function.Function;

public class Function_interface {
    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(5));
    }
}