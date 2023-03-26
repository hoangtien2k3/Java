
## Default Methods in Java 8:
[**Default Methods**](): Cho phép định nghĩa các phương thức mặc định trong các giao diện Java, giúp nâng cao khả năng mở rộng của giao diện và tăng tính linh hoạt của chương trình.


## Tại sao lại cần Default Methods ?

[**Nguyên nhân**]():
Nếu một interface có một hoặc nhiều implementations thì khi ta thêm vào interface đó một hoặc nhiều phương thức mới thì tất cả các implementations buộc phải implement các phương thức mới đó.

#### Default methods là một cách hiệu quả để giải quyết vấn đề trên.
- Nó cho phép chúng ta thêm vào interface các phương thức mới cùng với cài đặt sẵn nội dung thân hàm.
- Và từ đó chúng ta không phải tìm và sửa các class đang implement interface đó.
- Việc này sẽ giúp tăng khả năng mở rộng chương trình mà không cần phải sửa đổi quá nhiều.


```java
public interface Vehicle {
  String getBrand();
  
  default String turnAlarmOn() {
    return "Turning the vehicle alarm on.";
  }
   
  default String turnAlarmOff() {
    return "Turning the vehicle alarm off.";
  }
}
```

và ta có một class implements:
```java
public class Car implements Vehicle {
  private String brand;
   
  public Car(String brand) {
    this.brand = brand;
  }
   
  @Override
  public String getBrand() {
    return brand;
  }
}
```

ta có hàm main:
```java
public class Main {
  public static void main(String[] args) {
    Vehicle v = new Car("Vinfast");
    System.out.println(v.getBrand());
    System.out.println(v.turnAlarmOn());
    System.out.println(v.turnAlarmOff());
  }
}
```



## Vấn đề gì sẽ xảy ra khi kết thừa nhiều interface ?

[Default methods]() là một tính năng khá hay, nhưng vẫn gặp phải một số vấn đề như trong trường hợp thừa kế từ nhiều interfaces.

- Vậy chuyện gì sẽ xảy ra khi các interface đó định nghĩa các default methods giống nhau?

ví dụ: interface Alarm có 2 default methods giống với Vehicle
```java
public interface Alarm {
  default String turnAlarmOn() {
    return "Turning the alarm on.";
  }
 
  default String turnAlarmOff() {
    return "Turning the alarm off.";
  }
}
```

Class Car bây giờ sẽ implement từ cả hai interface là Vehicle và Alarm:
```java
public class Car implements Vehicle, Alarm {
  // ...
}
=> code sẽ báo lỗi  compile (vì Class Car đã kế thừa 2 bộ phương thức mặc định từ interface)
vì thế trình biên dịch sẽ không biết phương thức nào sẽ được gọi đến.
```

Để giải quyết thì class Car phải override cả 2 phương thức:
```java
@Override
public String turnAlarmOff() {
  return Vehicle.super.turnAlarmOff();
}
 
@Override
public String turnAlarmOn() {
  return Vehicle.super.turnAlarmOn();
}
```














