


## Trong Java 8, interface java.util.stream.Stream cung cấp một số method để xử lý dữ liệu tập hợp. Các method chính của Stream bao gồm:

1. [filter](): Lọc ra các phần tử trong Stream theo một điều kiện nhất định.

2. [map](): Áp dụng một hàm để chuyển đổi từng phần tử trong Stream sang một giá trị khác.

3. [flatMap](): Áp dụng một hàm để chuyển đổi từng phần tử trong Stream sang một Stream khác và sau đó nối chúng lại thành một Stream duy nhất.

4. [reduce](): Thực hiện tổng hợp các phần tử trong Stream theo một cách nhất định để tạo ra một giá trị duy nhất.

5. [collect](): Thực hiện thu thập và tổng hợp các phần tử trong Stream để tạo ra một java.util.Collection hoặc một object khác.

6. [forEach](): Duyệt qua từng phần tử trong Stream và thực hiện một hành động nhất định cho mỗi phần tử.

7. [min và max](): Tìm ra phần tử nhỏ nhất hoặc lớn nhất trong Stream theo một tiêu chí nhất định.

8. [count](): Đếm số lượng phần tử trong Stream.

9. [anyMatch](): Kiểm tra xem


## Trong Java 8, các method của Stream có thể chia thành nhiều nhóm, bao gồm:

1. [Method tạo Stream](): Những method này sử dụng để tạo một Stream từ các nguồn khác nhau như mảng, danh sách, số tự nhiên, tập hợp, ...
    - of(): Tạo một Stream từ một danh sách các phần tử.
    - ofNullable(): Tạo một Stream từ một phần tử có thể null.
    - iterate(): Tạo một Stream từ một nguồn của các giá trị số tự tăng.
    - generate(): Tạo một Stream từ một nguồn của các giá trị tạo bởi một Supplier.

2. [Method xử lý Stream](): Những method này sử dụng để xử lý dữ liệu trong Stream, bao gồm:
    - map(): Chuyển đổi từng phần tử trong Stream thành một phần tử khác.
    - filter(): Lọc các phần tử trong Stream theo điều kiện.
    - flatMap(): Chuyển đổi từng phần tử trong Stream thành một Stream khác và gộp chúng lại.
    - distinct(): Loại bỏ các phần tử trùng lặp trong Stream.
    - sorted(): Sắp xếp các phần tử trong Stream theo thứ tự từ nhỏ đến lớn hoặc ngược lại.

3. [Method kết thúc Stream](): Những method này sử dụng để kết thúc một Stream, bao gồm:
    - count(): Đ





