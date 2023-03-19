package src.java.Java8.LambdaExpression;

interface Sayable_5 {
    public String say(String word);
}

public class test1_1 {
    // Ví dụ biểu thức Lambda có một tham số duy nhất
    public static void main(String[] args) {
        Sayable_5 s = (word) -> {
            return word;
        };
        System.out.println(s.say("Meo meo!"));


        Sayable_5 str = index -> {
            return index;
        };
        System.out.println(str.say("Hoàng Tiến"));


    }
}