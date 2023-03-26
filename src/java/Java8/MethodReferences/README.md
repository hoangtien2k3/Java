
## Method References in Java

Trong Java 8, có ba kiểu method references:

1. [Reference tới method static](): Khi bạn trỏ tới một method static bằng tên class và tên method.
   - Ví dụ: Math::pow

2. [Reference tới method instance](): Khi bạn trỏ tới một method instance của một đối tượng cụ thể.
   - Ví dụ: "hello"::length

3. [Reference tới constructor](): Khi bạn trỏ tới một constructor của một class.
   - Ví dụ: Person::new

   
```html
- Ta có một lambda expression như sau:
    (args) -> Class.staticMethod(args)
- Có thể chuyển thành method reference như sau:
    Class::staticMethod
```


## Stream Method:

Các method trong Stream trong Java 8 là các hàm dùng để xử lý dữ liệu trong một tập hợp dữ liệu. Các method chính bao gồm:

1. [filter](): dùng để lọc các phần tử trong stream dựa trên một điều kiện được chỉ định.

2. [map](): dùng để ánh xạ các phần tử trong stream với một hàm để tạo ra một stream mới.

3. [flatMap](): tương tự như map, nhưng nó tạo ra một stream mới bằng cách gộp nhiều stream. 

4. [reduce](): dùng để tính toán một giá trị tổng quát từ tất cả các phần tử trong stream.

5. [forEach](): dùng để lặp qua tất cả các phần tử trong stream và thực hiện một hành động nào đó.

6. [count](): dùng để đếm số lượng phần tử trong stream.

7. [min và max](): dùng để tìm phần tử nhỏ nhất và lớn nhất trong stream.

8. [sum](): dùng để tính tổng của tất cả các phần tử trong stream.

9. [average](): dùng để tính trung bình cộng của tất cả các phần tử trong stream.


Chúng ta có thể kết hợp các method trên để tạo ra các biểu thức xử lý dữ liữ liệu phức tạp hơn. Ví dụ, chúng ta có thể sử dụng filter để lọc ra những phần tử của stream có tuổi lớn hơn 18, sau đó sử dụng map để chuyển đổi các phần tử của stream thành chuỗi với định dạng "tên, tuổi", cuối cùng sử dụng forEach để in ra màn hình các phần tử của stream mới:

```java
List<Person> people = ...;
people.stream()
      .filter(person -> person.getAge() > 18)
      .map(person -> person.getName() + ", " + person.getAge())
      .forEach(System.out::println);
```






