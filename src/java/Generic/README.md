
# Generic in Java

## Generic naming conventions:
- T : It represents type.
- E : It represents element.
- K – It represents keys.
- V – It represents values.
- N – It represents numbers.


## Generics terms:
![generics1](https://user-images.githubusercontent.com/122768076/234642733-85324b1a-a674-4f18-b878-9c359fe02cc4.jpg)


## 1. Lớp generic (Generic class):  
Lớp generic là một lớp có thể được khai báo với một hoặc nhiều tham số generic. Tham số generic có thể được sử dụng để xác định kiểu đối tượng mà lớp sẽ hoạt động trên.

Syntax:
```java
class MyClass<T> {
   //code
}
```

Ex:
```java
public class MyGenericClass<T> {
   private T t;

   public void set(T t) {
      this.t = t;
   }

   public T get() {
      return t;
   }

   public static void main(String[] args) {
      MyGenericClass<Integer> myInt = new MyGenericClass<Integer>();
      MyGenericClass<String> myString = new MyGenericClass<String>();

      myInt.set(10);
      myString.set("Hello World");

      System.out.println(myInt.get());
      System.out.println(myString.get());
   }
}
```


## 2. Interface generic (Generic interface):
Tương tự như lớp generic, interface generic cũng có thể được khai báo với một hoặc nhiều tham số generic.

Syntax:
```java
interface MyInterface<T> {
   //code
}
```

Ex:
```java
interface MyGenericInterface<T> {
   T process(T t);
}

public class MyGenericClass implements MyGenericInterface<String> {
   public String process(String str) {
      return str.toUpperCase();
   }

   public static void main(String[] args) {
      MyGenericClass obj = new MyGenericClass();
      System.out.println(obj.process("Hello World"));
   }
}
```


## 3. Phương thức generic (Generic method):
Phương thức generic là một phương thức có thể hoạt động trên nhiều loại đối tượng khác nhau mà không cần phải viết lại code cho từng loại đối tượng đó. Tham số generic của phương thức được khai báo trước tên phương thức.

Syntax:
```java
public <T> void myMethod(T t) {
   //code
}


///////////////////////////////////////////

interface IDemoClassA {
    void print();
}

interface IDemoClassB {
    void print();
}

public <T extends ClassA> void myMethod(T t) {
    //code
}

public <T extends IDemoClassA & IDemoClassB> void myMethod(T t) {
    //code
}
```

Ex:
```java
public class MyGenericClass {
   public <T> void printArray(T[] array) {
      for (T element : array) {
         System.out.println(element);
      }
   }

   public static void main(String[] args) {
      Integer[] intArray = {1, 2, 3, 4, 5};
      String[] stringArray = {"Hello", "World"};

      MyGenericClass obj = new MyGenericClass();
      obj.printArray(intArray);
      obj.printArray(stringArray);
   }
}
```

## 4. Wildcard generic (Generic wildcard):
Wildcard generic cho phép ta chỉ định một loại không xác định để sử dụng trong lớp generic hoặc phương thức generic. Wildcard generic có thể được sử dụng để giới hạn kiểu đối tượng mà một phương thức hoặc lớp generic có thể hoạt động trên.

Syntax:
```java
public void myMethod(List<?> list) {
   //code
}
```

Ex:
```java
public class MyGenericClass {
   public void printList(List<?> list) {
      for (Object element : list) {
         System.out.println(element);
      }
   }

   public static void main(String[] args) {
      List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
      List<String> stringList = Arrays.asList("Hello", "World");

      MyGenericClass obj = new MyGenericClass();
      obj.printList(intList);
      obj.printList(stringList);
   }
}
```


## 5. Bounded Type Parameter:
Bounded Type Parameter cho phép giới hạn các kiểu đối tượng mà một lớp generic hoặc phương thức generic có thể hoạt động trên. Có hai loại giới hạn: Upper Bounded và Lower Bounded.

### 1. [Upper Bounded]():
Cho phép chỉ định một giới hạn kiểu đối tượng phải là một lớp con của một lớp cụ thể.

Syntax:
```java
public <T extends MyClass> void myMethod(T t) {
   //code
}
```

Ex:
```java
class MyClass {}
class MySubClass extends MyClass {}

public class MyGenericClass {
   public <T extends MyClass> void printMyClass(T t) {
      System.out.println(t.getClass().getName());
   }

   public static void main(String[] args) {
      MyClass myObj = new MyClass();
      MySubClass mySubObj = new MySubClass();

      MyGenericClass obj = new MyGenericClass();
      obj.printMyClass(myObj);
      obj.printMyClass(mySubObj);
   }
}
```

### 2. [Lower Bounded]():
Cho phép chỉ định một giới hạn kiểu đối tượng phải là một lớp cha của một lớp cụ thể.

Syntax:
```java
public <T super MyClass> void myMethod(T t) {
   //code
}
```

Ex:
```java
class MyClass {}
class MySuperClass extends MyClass {}

public class MyGenericClass {
   public <T super MyClass> void printMyClass(T t) {
      System.out.println(t.getClass().getName());
   }

   public static void main(String[] args) {
      MyClass myObj = new MyClass();
      MySuperClass mySuperObj = new MySuperClass();

      MyGenericClass obj = new MyGenericClass();
      obj.printMyClass(myObj);
      obj.printMyClass(mySuperObj);
   }
}
```
