
## Optional in Java 8 là gì ?

- Optional trong Java 8 là một Container object, nó bao bọc (warpper) một object.
- Khi object là null thì Optional trả về empty. 
- Đặc biệt Optional hỗ trợ lambda expression.


### *Construction của Optional*
- Optional<String> empty = Optional.empty(); Empty Optional.
- Optional<String> full = Optional.of("Framgia"); Not null Optional

Khi bạn không chắc tham số của nó có null hay không thì sử dụng method ofNullable()
- Optional<String> halfFull = Optional.ofNullable(someOtherString);


## Một số phương thức của Optional<T> ?

1. [of()](): Tạo một Optional từ giá trị được chỉ định. Nếu giá trị là null, nó sẽ ném ra một **NullPointerException**.
2. [ofNullable()](): Tạo một Optional từ giá trị được chỉ định. Nếu giá trị là null, nó sẽ trả về một Optional rỗng.
3. [empty()](): Trả về một Optional rỗng.
4. [isPresent()](): Kiểm tra xem giá trị trong Optional có tồn tại hay không.
5. [get()](): Trả về giá trị trong Optional nếu có tồn tại. Nếu không, nó sẽ ném ra một **NoSuchElementException**.
6. [orElse()](): Trả về giá trị trong Optional nếu có tồn tại. Nếu không, nó sẽ trả về giá trị được chỉ định.
7. [orElseGet()](): Trả về giá trị trong Optional nếu có tồn tại. Nếu không, nó sẽ trả về giá trị được cung cấp bởi một Supplier.
8. [map()](): Thực hiện một phép ánh xạ trên giá trị trong Optional và trả về một Optional mới chứa kết quả.
9. [flatMap()](): Thực hiện một phép ánh xạ trên giá trị trong Optional và trả về một Optional mới chứa kết quả đã được giải phóng.
10. [filter()](): Kiểm tra giá trị trong Optional và trả về Optional rỗng nếu không đáp ứng một điều kiện được chỉ định.
11. [ifPresent()](): Thực thi một hành động nếu giá trị trong Optional tồn tại.
12. [or()](): Trả về một Optional chứa giá trị đầu tiên không phải là rỗng từ hai Optional.
13. [equals()](): So sánh hai Optional để xác định chúng có chứa cùng một giá trị hay không.
14. [hashCode()](): Trả về mã băm của giá trị trong Optional.
15. [stream()](): Trả về một Stream chứa giá trị trong Optional nếu có tồn tại. Nếu không, nó sẽ trả về một Stream rỗng.

































