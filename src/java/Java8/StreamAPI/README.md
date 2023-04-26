# Giới thiệu về Stream API trong Java 8

Giới thiệu về Stream trong Java 8
- Stream (luồng) là một đối tượng mới của Java được giới thiệu từ phiên bản Java 8, giúp cho việc thao tác trên collection và array trở nên dễ dàng và tối ưu hơn.
- Một Stream đại diện cho một chuỗi các phần tử hỗ trợ các hoạt động tổng hợp tuần tự (sequential) và song song (parallel).

Trong Java 8, Collection interface được hỗ trợ 2 phương thức để tạo ra Stream bao gồm:
- stream() : trả về một stream sẽ được xử lý theo tuần tự.
- parallelStream() : trả về một Stream song song, các xử lý sau đó sẽ thực hiện song song.

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

### Filter - lọc:
1. [filter(Predicate<T> predicate)](): Lọc các phần tử theo điều kiện được đưa ra bởi predicate.
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
List<Integer> evenNumbers = numbers.stream()
                                   .filter(n -> n % 2 == 0)
                                   .collect(Collectors.toList());
System.out.println(evenNumbers); // Kết quả: [2, 4, 6, 8, 10]
```

### Mapping - chuyển kiểu: 
2. [map(Function<T, R> mapper)](): phương thức quan trọng được sử dụng để chuyển đổi dữ liệu từ một định dạng sang một định dạng khác.
```java
List<String> names = Arrays.asList("John", "Jane", "Alice", "Bob");
List<Integer> nameLengths = names.stream()
                                 .map(String::length)
                                 .collect(Collectors.toList());
System.out.println(nameLengths); // Kết quả: [4, 4, 5, 3]
```

3. [flatMap(Function<T, Stream<R>> mapper)](): Ánh xạ mỗi phần tử sang một stream mới và sau đó kết hợp các stream đó thành một stream duy nhất.
```java
List<String> words = Arrays.asList("Hello", "World");

List<String> letters = words.stream()
                            .flatMap(word -> Stream.of(word.split("")))
                            .collect(Collectors.toList());

System.out.println(letters); // In ra: [H, e, l, l, o, W, o, r, l, d]
```

### Distinct - duy nhất:
4. [distinct()](): Loại bỏ các phần tử trùng lặp, và đưa về các phần tử duy nhất.
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 4, 5, 5);
List<Integer> distinctNumbers = numbers.stream()
                                       .distinct()
                                       .collect(Collectors.toList());
```

### Sorted - sắp xếp:
5. [sorted()](): Sắp xếp các phần tử theo thứ tự tăng dần.
```java
List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 7, 3);
List<Integer> sortedNumbers = numbers.stream()
                                     .sorted()
                                     .collect(Collectors.toList());
System.out.println(sortedNumbers); // Kết quả: [1, 2, 3, 5, 7, 9]
```

6. [sorted(Comparator<T> comparator)](): Sắp xếp các phần tử theo thứ tự được chỉ định bởi comparator.
```java
List<Person> persons = Arrays.asList(
    new Person("John", 30),
    new Person("Alice", 25),
    new Person("Bob", 35),
    new Person("Charlie", 20)
);

List<Person> sortedPersons = persons.stream()
                                    .sorted(Comparator.comparing(Person::getAge)) // Sắp xếp theo tuổi
                                    .collect(Collectors.toList());
System.out.println(sortedPersons);
// Kết quả: [Person [name=Charlie, age=20], Person [name=Alice, age=25],
//          Person [name=John, age=30], Person [name=Bob, age=35]]
```

7. [peek(Consumer<T> action)](): Thực hiện một hành động trên mỗi phần tử và trả về stream đầu vào.
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> evenNumbers = numbers.stream()
                                    .filter(n -> n % 2 == 0) // Lọc các số chẵn
                                    .peek(System.out::println) // In ra các số đã được lọc
                                    .collect(Collectors.toList());
System.out.println(evenNumbers); // Kết quả: [2, 4]
```

8. [limit(long maxSize)](): Giới hạn số phần tử được trả về trong stream.
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> limitedNumbers = numbers.stream()
                                      .limit(3) // Giới hạn số lượng phần tử là 3
                                      .collect(Collectors.toList());
System.out.println(limitedNumbers); // Kết quả: [1, 2, 3]
```

9. [skip(long n)](): trả về 1 stream nhưng bỏ qua n phần tử đầu tiên từ stream ban đầu.
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> skippedNumbers = numbers.stream()
                                      .skip(2) // Bỏ qua 2 phần tử đầu tiên
                                      .collect(Collectors.toList());
System.out.println(skippedNumbers); // Kết quả: [3, 4, 5]
```

10. [forEach(Consumer<T> action)](): Thực hiện một hành động trên mỗi phần tử.
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.stream()
        .forEach(System.out::println); // In ra từng số trên một dòng
```

11. [toArray()](): Chuyển stream thành một mảng.
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Integer[] array = numbers.stream()
                         .toArray(Integer[]::new); // Chuyển đổi Stream thành một mảng Integer
System.out.println(Arrays.toString(array)); // Kết quả: [1, 2, 3, 4, 5]
```

### Reduce:
12. [reduce(T identity, BinaryOperator<T> accumulator)](): Tính toán kết quả của các phần tử trong stream bằng cách sử dụng một phép tính nhị phân được chỉ định bởi accumulator, với giá trị ban đầu được cung cấp bởi identity.
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Integer sum = numbers.stream()
                     .reduce(0, (a, b) -> a + b); // Tính tổng của các số nguyên trong Stream
System.out.println(sum); // Kết quả: 15
```

13. [collect(Collector<T, A, R> collector)](): Tính toán kết quả của các phần tử trong stream bằng cách sử dụng một đối tượng Collector.
```java
List<String> names = Arrays.asList("John", "Jane", "Alice", "Bob");
String joinedNames = names.stream()
                          .collect(Collectors.joining(", "));
System.out.println(joinedNames); // Kết quả: "John, Jane, Alice, Bob"
```

### Matching - khớp:
14. [anyMatch(Predicate<T> predicate)](): Kiểm tra xem có phần tử nào trong stream thỏa mãn điều kiện được đưa ra bởi predicate hay không.
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
boolean hasEvenNumber = numbers.stream()
                               .anyMatch(n -> n % 2 == 0); // Kiểm tra xem có số chẵn nào trong Stream hay không
System.out.println(hasEvenNumber); // Kết quả: true
```

15. [allMatch(Predicate<T> predicate)](): Kiểm tra xem tất cả các phần tử trong stream đều thỏa mãn điều kiện được đưa ra bởi predicate hay không.
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
boolean allEvenNumbers = numbers.stream()
                                .allMatch(n -> n % 2 == 0); // Kiểm tra xem tất cả các số trong Stream đều là số chẵn hay không
System.out.println(allEvenNumbers); // Kết quả: false
```

16. [noneMatch(Predicate<T> predicate)](): Kiểm tra xem không có phần tử nào trong stream thỏa mãn điều kiện được đưa ra bởi predicate hay không.
```java
List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);
boolean noneEvenNumbers = numbers.stream()
                                 .noneMatch(n -> n % 2 == 0); // Kiểm tra xem không có số chẵn nào trong Stream
System.out.println(noneEvenNumbers); // Kết quả: true
```

### Find - tìm:
17. [findFirst()](): Trả về phần tử đầu tiên trong stream.
```java
List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);
Optional<Integer> firstNumber = numbers.stream()
                                      .findFirst(); // Lấy phần tử đầu tiên trong Stream
if (firstNumber.isPresent()) {
    System.out.println(firstNumber.get()); // Kết quả: 1
} else {
    System.out.println("Stream is empty"); // Kết quả: Stream is empty
}
```

18. [findAny()](): Trả về bất kỳ phần tử nào trong stream.
```java
List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);
Optional<Integer> anyNumber = numbers.stream()
                                     .filter(n -> n > 5) // Lọc các số lớn hơn 5
                                     .findAny(); // Lấy bất kỳ một số nào đó trong Stream sau khi lọc
if (anyNumber.isPresent()) {
    System.out.println(anyNumber.get()); // Kết quả: 7 (hoặc một số khác lớn hơn 5 trong Stream)
} else {
    System.out.println("Stream is empty"); // Kết quả: Stream is empty
}
```

### Count - đếm:
19. [count()](): Đếm số phần tử trong stream.
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
long count = numbers.stream().count();
System.out.println(count); // Kết quả: 5
```

20. [max(Comparator<T> comparator)](): Trả về phần tử lớn nhất theo thứ tự được chỉ định bởi comparator.
```java
List<Integer> numbers = Arrays.asList(1, 3, 2, 5, 4);
Optional<Integer> maxNumber = numbers.stream().max(Integer::compareTo);
if (maxNumber.isPresent()) {
    System.out.println(maxNumber.get()); // Kết quả: 5
} else {
    System.out.println("Stream is empty"); // Kết quả: Stream is empty
}
```

21. [min(Comparator<T> comparator)](): Trả về phần tử nhỏ nhất theo thứ tự được chỉ định bởi comparator.
```java
List<Integer> numbers = Arrays.asList(5, 3, 1, 4, 2);
Optional<Integer> minNumber = numbers.stream().min(Integer::compareTo);
if (minNumber.isPresent()) {
    System.out.println(minNumber.get()); // Kết quả: 1
} else {
    System.out.println("Stream is empty"); // Kết quả: Stream is empty
}
```

22. [forEachOrdered(Consumer<T> action)](): Thực hiện một hành động trên mỗi phần tử theo thứ tự được đảm bảo bởi stream theo thứ tự đúng (ordered).
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.stream().forEachOrdered(System.out::print); // Kết quả: 12345
```

23. [isParallel()](): Kiểm tra xem stream có được thực thi song song (parallel) hay không.
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Stream<Integer> stream = numbers.stream();

boolean isParallel = stream.isParallel();
System.out.println("Is parallel: " + isParallel); // Kết quả: Is parallel: false

Stream<Integer> parallelStream = numbers.parallelStream();
isParallel = parallelStream.isParallel();
System.out.println("Is parallel: " + isParallel); // Kết quả: Is parallel: true
```

24. [sequential()](): Chuyển đổi stream hoạt động ở chế độ song song (parallel) sang chế độ tuần tự (sequential).
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Stream<Integer> parallelStream = numbers.parallelStream();

boolean isParallel = parallelStream.isParallel();
System.out.println("Is parallel: " + isParallel); // Kết quả: Is parallel: true

Stream<Integer> sequentialStream = parallelStream.sequential();
isParallel = sequentialStream.isParallel();
System.out.println("Is parallel: " + isParallel); // Kết quả: Is parallel: false
```

25. [parallel()](): Chuyển đổi stream hoạt động ở chế độ tuần tự (sequential) sang chế độ song song (parallel).
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Stream<Integer> sequentialStream = numbers.stream();

boolean isParallel = sequentialStream.isParallel();
System.out.println("Is parallel: " + isParallel); // Kết quả: Is parallel: false

Stream<Integer> parallelStream = sequentialStream.parallel();
isParallel = parallelStream.isParallel();
System.out.println("Is parallel: " + isParallel); // Kết quả: Is parallel: true
```

26. [unordered()](): Chuyển đổi stream thành một stream không đảm bảo thứ tự.

27. [onClose(Runnable closeHandler)](): Thêm một hàm xử lý được thực thi khi stream bị đóng.
28. [close()](): Đóng stream và giải phóng tài nguyên.
29. [iterator()](): Trả về một iterator cho stream.
```java
List<String> list = Arrays.asList("apple", "banana", "cherry", "date");
Stream<String> stream = list.stream();
Iterator<String> iterator = stream.iterator();
while (iterator.hasNext()) {
    String element = iterator.next();
    System.out.println(element);
}
```

30. [spliterator()](): Trả về một Spliterator cho stream.
```java
List<String> list = Arrays.asList("apple", "banana", "cherry", "date");
Stream<String> stream = list.stream();
Spliterator<String> spliterator = stream.spliterator();
spliterator.forEachRemaining(System.out::println);
```

###  Stream of primitive type:
IntStream, LongStream, DoubleStream Number stream có sẵn các method cho tính toán với kiểu số như method: sum, count, average, max, min

31. [mapToInt()](): Chuyển đổi các phần tử của một Stream thành các giá trị kiểu nguyên.
```java
List<String> list = Arrays.asList("1", "2", "3", "4", "5");
Stream<String> stream = list.stream();
IntStream intStream = stream.mapToInt(Integer::parseInt);
intStream.forEach(System.out::println);
```

Ngoài ra, Stream cũng có thể được tạo ra từ nhiều nguồn khác nhau, bao gồm các collection, mảng, các nguồn I/O và các generator. Các phương thức để tạo Stream từ các nguồn này bao gồm:

1. [stream()](): Tạo Stream từ một collection (tập hợp) như List, Set hoặc Map.
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Stream<Integer> stream = numbers.stream();
```

2. [parallelStream()](): Tạo Stream song song từ một collection.
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Stream<Integer> parallelStream = numbers.parallelStream();
```

3. [of(T... values)](): Tạo Stream từ một mảng giá trị.
```java
Stream<String> stream = Stream.of("apple", "banana", "cherry", "date");

stream.forEach(System.out::println);
```

4. [generate(Supplier<T> s)](): Tạo Stream vô hạn bằng cách sử dụng một Supplier.
5. [iterate(T seed, UnaryOperator<T> f)](): Tạo Stream vô hạn bằng cách sử dụng một hạt giống và một UnaryOperator.
6. [concat(Stream<? extends T> a, Stream<? extends T> b)](): Nối hai Stream lại với nhau.
7. [empty()](): Tạo Stream trống.
8. [ifPresent()]() : Sử dụng để kiểm tra xem có phần tử trong Stream không và thực thi một tác vụ xác định nếu có.
```java
Optional<String> optional = Optional.ofNullable("Hello");

optional.ifPresent(System.out::println); // In ra: Hello
```
