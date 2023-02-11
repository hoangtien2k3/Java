
## Functional Expression:

#### Trong Java, có một số functional interface được sử dụng trong lambda expression, bao gồm:

1. Function: Chấp nhận một đối số và trả về một kết quả.
2. Consumer: Chấp nhận một đối số và không trả về kết quả.
3. Supplier: Không chấp nhận đối số và trả về một kết quả.
4. Predicate: Chấp nhận một đối số và trả về một giá trị Boolean.
5. BinaryOperator: Chấp nhận hai đối số và trả về một kết quả.
6. UnaryOperator: Chấp nhận một đối số và trả về một kết quả tương tự.
7. BiPredicate: Chấp nhận hai đối số và trả về một giá trị Boolean.


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



