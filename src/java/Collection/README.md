
## Sự khác nhau giữa **Collection** và **Collections** trong Java

### [Collection]() 
Collection: Một ví dụ đơn giản về Collection là interface List. List là một tập hợp các phần tử được sắp xếp theo thứ tự và cho phép trùng lặp.

```java
List<String> myList = new ArrayList<>();
myList.add("apple");
myList.add("banana");
myList.add("orange");
System.out.println(myList); // output: [apple, banana, orange]
```

### [Collections]()
Collections: Một ví dụ về Collections là phương thức sort(). Phương thức này được sử dụng để sắp xếp các phần tử trong một Collection theo thứ tự tăng dần hoặc giảm dần. 

```java
List<Integer> myList = new ArrayList<>();
myList.add(5);
myList.add(2);
myList.add(8);
Collections.sort(myList);
System.out.println(myList); // output: [2, 5, 8]
```
        












