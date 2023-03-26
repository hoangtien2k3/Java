package src.java.Java8.LambdaExpression;

interface Operation {
    public int add(int a, int b);
}

public class test2_2 {
    // Ví dụ biểu thức Lambda có nhiều tham số
    public static void main(String[] args) {
        // không cần khai báo int cho a và b, vì nó tự hiểu đó là int, còn khai báo thì cũng được.
        Operation operation = (a, b) -> {
            return a + b;
        };
        System.out.println("a + b = " + operation.add(10, 20));

        // viết ngắn gọn hơn và không cần từ khóa "return".
        Operation operation1 = (int a, int b) -> (a + b);
        System.out.println("a + b = " + operation1.add(20, 40));


        // Anonymous class
        Operation operation2 = new Operation() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println("a + b = " + operation2.add(5, 6));


    }
}
