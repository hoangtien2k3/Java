package Hackerrank_Solution.Java_Solutions;

import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        java.util.HashMap<String, Integer> map1 = new java.util.HashMap<>();
        java.util.HashMap<String, Integer> map2 = new java.util.HashMap<>();
        for(int i = 0; i < a.length(); i++) {
            String key = String.valueOf(a.charAt(i)).toLowerCase();
            map1.put(key, map1.containsKey(key) ? map1.get(key) + 1 : 1);
        }
        for(int j = 0; j < b.length(); j++) {
            String key = String.valueOf(b.charAt(j)).toLowerCase();
            map2.put(key, map2.containsKey(key) ? map2.get(key) + 1 : 1);
        }
        return map1.equals(map2) ? true : false;
    }

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
