
// void putAll(Map t)	Sao chép các phần tử của Map được chỉ định vào HashMap.

package src.java.Collection.Map.HashMap.HashMap_Methods;

import java.util.HashMap;

public class putAll {
    public static void main(String[] args) {
        // khai báo một hashmap tên primeNumbers
        HashMap<String, Integer> primeNumbers = new HashMap<>();
        // sử dụng phương thức put() để thêm các cá thể cho primeNumbers
        primeNumbers.put("Two", 2);
        primeNumbers.put("Three", 3);
        System.out.println("\nprimeNumbers: " + primeNumbers);

        // khai báo một hashmap tên numbers
        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Five", 5);
        System.out.println("numbers: " + numbers);

        // thêm tất cả các cá thể ở primeNumbers vào numbers
        numbers.putAll(primeNumbers);
        System.out.println("numbers sau khi thêm: " + numbers);
    }
}
