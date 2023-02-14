
### Trong Java, Stream API cung cấp nhiều hàm hỗ trợ cho việc lọc tập hợp dữ liệu. Một số hàm quan trọng nhất là:

1. [**filter**]():      Dùng để lọc các phần tử trong tập hợp dữ liệu theo điều kiện nào đó.

2. [**distinct**](): Dùng để lọc các phần tử duy nhất trong tập hợp dữ liệu. Không lấy giá trị trùng lặp.

3. [**limit**](): Dùng để giới hạn số lượng phần tử trong tập hợp dữ liệu.

4. [**skip**](): Dùng để bỏ qua một số phần tử đầu tiên trong tập hợp dữ liệu.

5. [**mapToInt**](): chuyển đổi các phần tử của một **Stream** thành các giá trị kiểu nguyên (**int**).

6. [**sum**](): tính toán tổng của các phần tử trong Stream. Phương thức này chỉ có thể được sử dụng cho các Stream của các kiểu dữ liệu nguyên (int, long, double).



### Sử dụng Stream API có một số lợi ích so với việc không sử dụng:

1. [**Tối ưu hoá tốc độ**](): Stream API sử dụng các tối ưu hoá tốc độ để xử lý dữ liệu một cách hiệu quả. Ví dụ, nó có thể sử dụng các chiến lược tối ưu hoá tốc độ để lọc và gộp dữ liệu một cách nhanh nhất có thể.


2. [**Dễ đọc và viết**](): Stream API sử dụng các biểu thức Lambda và các hàm để xử lý dữ liệu, giúp cho mã của bạn trở nên ngắn gọn và dễ đọc hơn.


3. [**Dễ dàng mở rộng**](): Stream API cho phép bạn thêm các thao tác mới dễ dàng bằng cách chỉ cần thêm các hàm vào chuỗi các hàm đang được sử dụng.


4. [**Làm cho mã của bạn bớt nhiễu**](): Stream API giúp bạn tách biệt các logic xử lý dữ liệu từ các logic tổng quát của chương trình của bạn, giúp cho mã của bạn trở nên sạch sẽ và dễ quản lý hơn.


Tất cả các lợi ích này giúp cho Stream API trở nên mạnh mẽ và đáng sử dụng trong việc xử lý dữ liệu lớn.

## Dưới đây là một số ví dụ về việc áp dụng Stream API trong Java:

1. [Lọc dữ liệu](): Bạn có thể sử dụng Stream API để lọc các phần tử của danh sách theo một điều kiện nhất định. Ví dụ, nếu bạn có một danh sách sản phẩm và muốn lọc ra các sản phẩm có giá trị trên 20000, bạn có thể sử dụng mã sau:

```java
List<Product> products = //...
        Stream<Product> filteredData = products.stream()
        .filter(p -> p.price > 20000); 
```

2. [Sắp xếp dữ liệu](): Bạn có thể sử dụng Stream API để sắp xếp dữ liệu theo thứ tự tùy chọn. Ví dụ, nếu bạn muốn sắp xếp các sản phẩm theo giá tăng dần, bạn có thể sử dụng mã sau:

```java
Stream<Product> sortedData = products.stream()
                                .sorted((p1, p2) -> Integer.compare(p1.price, p2.price));
```


3. [Tính toán trên dữ liệu](): Bạn có thể sử dụng Stream API để tính toán trên dữ liệu, chẳng hạn như tính tổng giá của tất cả các sản phẩm trong danh sách. Ví dụ, bạn có thể sử dụng mã sau:

```java
int totalPrice = products.stream()
                            .mapToInt(p -> p.price)
                            .sum();
```

4. [Gộp dữ liệu](): Bạn có thể sử dụng Stream API để gộp dữ liệu từ nhiều nguồn thành một. Ví dụ, nếu bạn có hai danh sách sản phẩm và muốn gộp chúng lại thành một danh sách duy nhất, bạn có thể sử dụng mã sau:

```java
List<Product> products1 = //...
List<Product> products2 = //...
Stream<Product> mergedData = Stream.concat(products1.stream(), products2.stream());
```

5. [Tìm kiếm dữ liệu](): Bạn có thể sử dụng Stream API để tìm kiếm một phần tử trong danh sách theo một điều kiện nhất định. Ví dụ, nếu bạn muốn tìm kiếm sản phẩm có giá trị lớn nhất trong danh sách, bạn có thể sử dụng mã sau:

```java
Product maxPriceProduct = products.stream()
                            .max((p1, p2) -> Integer.compare(p1.price, p2.price))
                            .get();
```
