![](https://gpcoder.com/wp-content/uploads/2018/05/java-stream-api.png)


## Method References in Java
Trong Java 8, có ba kiểu method references:
1. [Reference tới method static](): Khi bạn trỏ tới một method static bằng tên class và tên method.
   - Ví dụ: Math::pow
2. [Reference tới method instance](): Khi bạn trỏ tới một method instance của một đối tượng cụ thể.
   - Ví dụ: "hello"::length
3. [Reference tới constructor](): Khi bạn trỏ tới một constructor của một class.
   - Ví dụ: Person::new

## Stream Method:
Stream trong Java là một thành phần quan trọng của Java 8 và được sử dụng để thao tác trên các tập dữ liệu. Sau đây là danh sách các method có sẵn trong interface Stream trong Java:

1. [filter(Predicate<T> predicate)](): Lọc các phần tử theo điều kiện được đưa ra bởi predicate.
2. [map(Function<T, R> mapper)](): Ánh xạ mỗi phần tử sang một phần tử mới theo một hàm được đưa ra bởi mapper.
3. [flatMap(Function<T, Stream<R>> mapper)](): Ánh xạ mỗi phần tử sang một stream mới và sau đó kết hợp các stream đó thành một stream duy nhất.
4. [distinct()](): Loại bỏ các phần tử trùng lặp.
5. [sorted()](): Sắp xếp các phần tử theo thứ tự tăng dần.
6. [sorted(Comparator<T> comparator)](): Sắp xếp các phần tử theo thứ tự được chỉ định bởi comparator.
7. [peek(Consumer<T> action)](): Thực hiện một hành động trên mỗi phần tử và trả về stream đầu vào.
8. [limit(long maxSize)](): Giới hạn số phần tử được trả về trong stream.
9. [skip(long n)](): Bỏ qua n phần tử đầu tiên của stream.
10. [forEach(Consumer<T> action)](): Thực hiện một hành động trên mỗi phần tử.
11. [toArray()](): Chuyển stream thành một mảng.
12. [reduce(T identity, BinaryOperator<T> accumulator)](): Tính toán kết quả của các phần tử trong stream bằng cách sử dụng một phép tính nhị phân được chỉ định bởi accumulator, với giá trị ban đầu được cung cấp bởi identity.
13. [collect(Collector<T, A, R> collector)](): Tính toán kết quả của các phần tử trong stream bằng cách sử dụng một đối tượng Collector.
14. [anyMatch(Predicate<T> predicate)](): Kiểm tra xem có phần tử nào trong stream thỏa mãn điều kiện được đưa ra bởi predicate hay không.
15. [allMatch(Predicate<T> predicate)](): Kiểm tra xem tất cả các phần tử trong stream đều thỏa mãn điều kiện được đưa ra bởi predicate hay không.
16. [noneMatch(Predicate<T> predicate)](): Kiểm tra xem không có phần tử nào trong stream thỏa mãn điều kiện được đưa ra bởi predicate hay không.
17. [findFirst()](): Trả về phần tử đầu tiên trong stream.
18. [findAny()](): Trả về bất kỳ phần tử nào trong stream.
19. [count()](): Đếm số phần tử trong stream.
20. [max(Comparator<T> comparator)](): Trả về phần tử lớn nhất theo thứ tự được chỉ định bởi comparator.
21. [min(Comparator<T> comparator)](): Trả về phần tử nhỏ nhất theo thứ tự được chỉ định bởi comparator.
22. [forEachOrdered(Consumer<T> action)](): Thực hiện một hành động trên mỗi phần tử theo thứ tự được đảm bảo bởi stream.
23. [isParallel()](): Kiểm tra xem stream có được thực thi song song hay không.
24. [sequential()](): Chuyển đổi stream sang chế độ thực thi tuần tự.
25. [parallel()](): Chuyển đổi stream sang chế độ thực thi song song.
26. [unordered()](): Chuyển đổi stream thành một stream không đảm bảo thứ tự.
27. [onClose(Runnable closeHandler)](): Thêm một hàm xử lý được thực thi khi stream bị đóng.
28. [close()](): Đóng stream và giải phóng tài nguyên.
29. [iterator()](): Trả về một iterator cho stream.
30. [spliterator()](): Trả về một Spliterator cho stream.

Ngoài ra, Stream cũng có thể được tạo ra từ nhiều nguồn khác nhau, bao gồm các collection, mảng, các nguồn I/O và các generator. Các phương thức để tạo Stream từ các nguồn này bao gồm:

1. [stream()](): Tạo Stream từ một collection.
2. [parallelStream()](): Tạo Stream song song từ một collection.
3. [of(T... values)](): Tạo Stream từ một mảng giá trị.
4. [generate(Supplier<T> s)](): Tạo Stream vô hạn bằng cách sử dụng một Supplier.
5. [iterate(T seed, UnaryOperator<T> f)](): Tạo Stream vô hạn bằng cách sử dụng một hạt giống và một UnaryOperator.
6. [concat(Stream<? extends T> a, Stream<? extends T> b)](): Nối hai Stream lại với nhau.
7. [empty()](): Tạo Stream trống.








