
## Từ khóa final:

Có các loại final sau:
1. Lớp final

2. Phương thức final
```java
public double bake(int quantity, final double price, final Pizza pizza) {
    pizza.meat = "chicken"; // cho phép
    pizza = new Pizza("pork"); // gán lại, không cho phép
    price /= 2.0; // gán lại, không cho phép
    return quantity * price;
}
```

3. Biến final
   - Nếu một biến được đánh dấu là final, nó được xem như một hằng số mặc dù vẫn là biến, không thể thay đổi trị của nó một khi
    nó đã khởi tạo, nghĩa là chỉ gán trị cho nó một lần khi khởi tạo. Thử gán trị lại cho biến final sẽ gây lỗi biên dịch.
```java
public class Bank {
    private static final double DEFAULT_INTERREST_RATE = 3.2;
    // các khai báo khác
}
```










