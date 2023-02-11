
## Functional Expression:

#### Trong Java, có một số functional interface được sử dụng trong lambda expression, bao gồm:

1. **Function**: Chấp nhận một đối số và trả về một kết quả.
2. **Consumer**: Chấp nhận một đối số và không trả về kết quả.
3. **Supplier**: Không chấp nhận đối số và trả về một kết quả.
4. **Predicate**: Chấp nhận một đối số và trả về một giá trị Boolean.
5. **BinaryOperator**: Chấp nhận hai đối số và trả về một kết quả.
6. **UnaryOperator**: Chấp nhận một đối số và trả về một kết quả tương tự.
7. **BiPredicate**: Chấp nhận hai đối số và trả về một giá trị Boolean.


Các functional interface trên có thể được sử dụng để tạo ra các lambda expression và sử dụng chúng trong các phương thức của các lớp Java Collections như 'Stream', 'List', 'Map' vv.



## Anonymous Class và Lambda Expression: 

#### Anonymous class và lambda expression là hai cách để tạo một đối tượng mà không cần tên cho class. Tuy nhiên, có một số sự khác nhau giữa hai cách này:


1. Cú pháp: 
    - Anonymous class có một cú pháp phức tạp hơn so với lambda expression
    - Lambda expression có một cú pháp ngắn gọn và dễ hiểu hơn.


2. Sử dụng: 
    - Anonymous class thường được sử dụng để tạo một đối tượng mới của một class hoặc interface
    - Lambda expression thường được sử dụng để tạo một đối tượng cho một interface functional.


3. Sức mạnh: 
    - Anonymous class cung cấp khả năng tạo một class mới với toàn bộ các thuộc tính và phương thức của class cha
    - Lambda expression chỉ cung cấp khả năng thực hiện một hành động cụ thể như một đối tượng functional interface.


## Dưới đây là một số ví dụ về việc áp dụng Stream API trong Java:

1. Lọc dữ liệu: Bạn có thể sử dụng Stream API để lọc các phần tử của danh sách theo một điều kiện nhất định. Ví dụ, nếu bạn có một danh sách sản phẩm và muốn lọc ra các sản phẩm có giá trị trên 20000, bạn có thể sử dụng mã sau:

```java
List<Product> products = //...
        Stream<Product> filteredData = products.stream()
        .filter(p -> p.price > 20000); 
```

2. Sắp xếp dữ liệu: Bạn có thể sử dụng Stream API để sắp xếp dữ liệu theo thứ tự tùy chọn. Ví dụ, nếu bạn muốn sắp xếp các sản phẩm theo giá tăng dần, bạn có thể sử dụng mã sau:

```java
Stream<Product> sortedData = products.stream()
                                .sorted((p1, p2) -> Integer.compare(p1.price, p2.price));
```


3. Tính toán trên dữ liệu: Bạn có thể sử dụng Stream API để tính toán trên dữ liệu, chẳng hạn như tính tổng giá của tất cả các sản phẩm trong danh sách. Ví dụ, bạn có thể sử dụng mã sau:

```java
int totalPrice = products.stream()
                            .mapToInt(p -> p.price)
                            .sum();
```

4. Gộp dữ liệu: Bạn có thể sử dụng Stream API để gộp dữ liệu từ nhiều nguồn thành một. Ví dụ, nếu bạn có hai danh sách sản phẩm và muốn gộp chúng lại thành một danh sách duy nhất, bạn có thể sử dụng mã sau:

```java
List<Product> products1 = //...
List<Product> products2 = //...
Stream<Product> mergedData = Stream.concat(products1.stream(), products2.stream());
```

5. Tìm kiếm dữ liệu: Bạn có thể sử dụng Stream API để tìm kiếm một phần tử trong danh sách theo một điều kiện nhất định. Ví dụ, nếu bạn muốn tìm kiếm sản phẩm có giá trị lớn nhất trong danh sách, bạn có thể sử dụng mã sau:

```java
Product maxPriceProduct = products.stream()
                            .max((p1, p2) -> Integer.compare(p1.price, p2.price))
                            .get();
```

Đây chỉ là một số ví dụ về việc sử dụng Stream API trong Java. Bạn có thể sử dụng Stream API để thực hiện rất nhiều tác vụ khác nữa, và các tác vụ này có thể được thực hiện một cách rất dễ dàng và hiệu quả.
















