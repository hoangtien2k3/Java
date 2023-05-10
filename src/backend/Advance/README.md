# Lecture 3 - Kotlin

# I. Kotlin's extension functions and properties
Trong Kotlin, extension là một tính năng cho phép bạn thêm các hàm hoặc thuộc tính mới vào một lớp đã được định nghĩa trước đó mà không cần thay đổi mã nguồn của lớp đó.
Điều này cho phép bạn mở rộng chức năng của một lớp có sẵn mà không cần phải kế thừa lớp đó hoặc sửa đổi mã nguồn của nó.
Chúng ta có hai loại extension:
Extension function: định nghĩa function mới cho 1 class sẵn có.
Extension property: định nghĩa property mới cho 1 class sẵn có.
Chúng ta đều biết rằng một lớp được khai báo là final thì không thể nào extends được đúng không?
Ví dụ chúng ta muốn thừa kế lớp Integer để có thêm hàm toBigInteger() chúng ta sẽ làm thế này:

**SLIDE** Ví dụ

``` java
 class IntegerEx extends Integer {
    public BigInteger toBigInteger() {
        return BigInteger.valueOf(this);
    }
}
```

Nhưng rất tiếc chúng ta không thể, vì lớp Integer là một lớp final, với Java thì hiện tại là bó tay, nhưng với Kotlin, mọi việc lại siêu dễ dàng.
Về bản chất thì kotlin khi biên dịch đều có một bước chuyển đổi, và các hàm extension sẽ được chuyển đổi thành các hàm static.

Quay trở lại ví dụ hàm toBigInteger, khi bạn đặt hàm này trong file IntegerExtension.kt thì khi biên dịch, kotlin sẽ tạo ra lớp IntegerExtensionKt thế này:

**SLIDE** Ví dụ

```kotlin
        public class IntegerExtensionKt {
            private IntegerExtensionKt() {}
        
            public static BigInteger toBigInteger(Integer original) {
                return BigInteger.valueOf(original);
            }
        }
```

Kotlin Extension :

Trong Kotlin, để định nghĩa một `extension property`, chúng ta sử dụng cú pháp sau:
**SLIDE** Ví dụ
```kotlin
val <ReceiverType>.<propertyName>: <PropertyType>
    get() = <getter>
    set(value) = <setter>
```

```kotlin
var View.isVisible: Boolean
    set(value) {
        visibility = if (value) View.VISIBLE else View.GONE
    }
    get() = visibility == View.VISIBLE
```
Trong Kotlin, để định nghĩa một `extension function`, chúng ta sử dụng cú pháp sau:
**SLIDE** Ví dụ
```kotlin
      fun <tên class cần mở rộng>.<hàm cần mở rộng>(
          [các tham số]
      ): [kiểu dữ liệu trả về] =
          <Nội dung hàm>
      hoặc với cú pháp dành cho hàm phức tạp chúng ta có thể dùng cú pháp này:
```

```kotlin
      fun <tên class cần mở rộng>.<hàm cần mở rộng>(
          [các tham số]
      ): [kiểu dữ liệu trả về]  {
          <Nội dung hàm>
      }    
```
**SLIDE** Ví dụ
```kotlin
      fun Integer.toBigInteger(): BigInteger =
          BigInteger.valueOf(this.toLong())
      // hoặc kiểu dài:
      
      fun Integer.toBigInteger(): BigInteger {
          return BigInteger.valueOf(this.toLong())
      }
```
Và sử dụng không khác gì với việc gọi hàm thông thường:

**SLIDE** Ví dụ
```kotlin
 val intValue = Integer.valueOf(10)
 val bigIntegerValue = value.toBigInteger()
```

```kotlin

  // Property extension
  
  val String.isPhoneNumber: Boolean
      get() = this.matches("^\\d{10}$".toRegex())
      
  val phoneNumber1 = "1234567890"
  val phoneNumber2 = "123"
  val isPhoneNumber1 = phoneNumber1.isPhoneNumber // true
  val isPhoneNumber2 = phoneNumber2.isPhoneNumber // false
      
   // Function Extension
   
    fun View.gone() {
        visibility = View.GONE
    }
    
    fun View.visible() {
        visibility = View.VISIBLE
    }
    
    fun View.invisible() {
        visibility = View.INVISIBLE
    }
    fun Context.toast(text: CharSequence) = runOnUiThread {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).apply { show() }
    }
    fun ImageView.loadBlur(url: String?) {
        Glide.with(context)
            .load(url)
            .override(Target.SIZE_ORIGINAL, Target.SIZE_ORIGINAL)
            .apply(RequestOptions.bitmapTransform(BlurTransformation(25, 6)))
            .error(R.drawable.ic_placeholder_portrait)
            .into(this)
    }
    fun Int.isEven(): Boolean {
        return this % 2 == 0
    }
    fun <T> List<T>.second(): T? {
        return if (this.size >= 2) this[1] else null
    }
    val list = listOf("Kotlin", "Extension", "Functions")
    val secondItem = list.second() // "Extension"
    
    val String.isPhoneNumber: Boolean
        get() = this.matches("^\\d{10}$".toRegex())
        
    fun String.removeWhitespace(): String {
        return this.replace("\\s".toRegex(), "")
    }
    
    val str = "  Kotlin Extension Functions "
    val result = str.removeWhitespace() // "KotlinExtensionFunctions"
```    

Kotlin dựa trên nguyên tắc Open/Close (đóng với việc thay đổi, mở với việc mở rộng) nên có thể dùng Extension để mở rộng


# II. Scope functions

Kotlin cung cấp nhiều function với mục đích thực thi 1 block code trên 1 object.
Các function này được gọi là scope functions vì chúng tạo ra 1 scope tạm để thực thi block code.
Các scope functions này là: let, run, with, apply, also, takeIf, takeUnless.

## 1. let

**SLIDE**: Function signature
```kotlin
inline fun <T, R> T.let(block: (T) -> R): R
```

- Cho phép bạn truyền đối tượng vào một hàm lambda, xử lý và trả về giá trị của lambda.
  Giá trị trả về của function là giá trị trả về của lambda `block`.

- Cú pháp: `object.let { doSomething(it) }`.
  Object sẽ được sử dụng như 1 tham số của lambda `block` (it).
  Giá trị trả về của function let là giá trị trả về của lambda `block`.

- `let` có thể hữu ích khi chúng ta không muốn define quá nhiều `val` và cũng có ích trong một số trường hợp để
  bỏ qua giá trị `null`.

**SLIDE** Ví dụ:
```kotlin
val numbers = listOf("one", "two", "three", "four", "five")
numbers
  .map { it.length }
  .filter { it > 3 }
  .let(::println)
```

**SLIDE** Ví dụ:
```kotlin
// cách viết này có thể viết gọn lại thành
fun randomNullableInt(): Int? {
  val i = Random.nextInt(10)
  return if (i < 5) i else null
}

// sử dụng let thay vì define 1 local variable  
fun randomNullableInt(): Int? = Random.nextInt(10).let { i -> if (i < 5) i else null }  

val nullableInt: Int? = randomNullableInt()

// in giá trị của nullableInt nếu nó khác null
if (nullableInt != null) {
  println(nullableInt) 
}

// sử dụng ?.let thay vì if
nullableInt?.let(::println) // in giá trị của nullableInt nếu nó khác null
```

## 2. run

**SLIDE**: Function signature
```kotlin
inline fun <T, R> T.run(block: T.() -> R): R
```

- Cho phép bạn truyền đối tượng vào một hàm lambda, xử lý và trả về giá trị của lambda.
  Giá trị trả về của function là giá trị trả về của lambda `block`.

- Cú pháp: `object.run { this.doSomething() }`.
  Object sẽ được sử dụng như 1 tham số receiver của lambda `block` (this).
  Giá trị trả về của function run là giá trị trả về của lambda `block`.

- `run` có thể hữu ích khi chúng ta truy cập vào các thuộc tính và hàm của object mà không cần phải viết lại tên object
  nhiều lần.
- Về công dụng, `run` giống `let`, nhưng `run` sử dụng receiver param `this` trong khi `let` sử dụng param `it`.

**SLIDE** Ví dụ:
```kotlin
class Person(var name: String, var age: Int, var about: String) {
  constructor() : this("", 0, "")
  
  fun moveTo(address: String) { /*...*/ }
}

val peter = Person(name = "Peter", age = 18, about = "I like turtles")

// sử dụng dot notation để truy cập vào các thuộc tính và hàm của object peter
peter.age = 20
peter.about = "I like to play guitar"
peter.moveTo(address = "Boston")

// sử dụng run thay vì peter.name, peter.age, peter.about, peter.moveTo
peter.run {
  age = 20
  about = "I like to play guitar"
  moveTo(address = "Boston")
}
```

## 3. with

**SLIDE**: Function signature
```kotlin
inline fun <T, R> with(receiver: T, block: T.() -> R): R
```

- Cho phép bạn truyền đối tượng vào một hàm lambda, xử lý và trả về giá trị của lambda.
  Giá trị trả về của function là giá trị trả về của lambda `block`.

- Cú pháp: `with(object) { this.doSomething() }`.
  Object sẽ được sử dụng như 1 tham số receiver của lambda `block` (this).
  Giá trị trả về của function with là giá trị trả về của lambda `block`.

- `with` có mục đích tương tự như `run` nhưng `with` là 1 function nhận object như tham số đầu tiên, còn `run` là 1
  extension function của object.

**SLIDE** Ví dụ:

```kotlin
val peter = Person(name = "Peter", age = 18, about = "I like turtles")

// sử dụng dot notation để truy cập vào các thuộc tính và hàm của object peter
peter.age = 20
peter.about = "I like to play guitar"
peter.moveTo(address = "Boston")

// sử dụng with thay vì peter.name, peter.age, peter.about, peter.moveTo
with(peter) {
  age = 20
  about = "I like to play guitar"
  moveTo(address = "Boston")
}
```

## 4. apply

**SLIDE**: Function signature
```kotlin
inline fun <T> T.apply(block: T.() -> Unit): T
```

- Cho phép bạn truyền đối tượng vào một hàm lambda, xử lý và trả về đối tượng đó (this).
  Giá trị trả về của function là đối tượng receiver (this).

- Cú pháp: `object.apply { this.doSomething() }`.
  Object sẽ được sử dụng như 1 tham số receiver của lambda `block` (this).
  Giá trị trả về của function apply là đối tượng receiver object.

- `apply` có thể hữu ích khi chúng ta truy cập vào các thuộc tính và hàm của object mà không cần phải viết lại tên object
  nhiều lần và block lambda không có giá trị trả về.

**SLIDE** Ví dụ:
```kotlin
class Person(val name: String) {
  var age: Int = 0
  var about: String = ""
}

// cách viết thông thường
fun newPerson(): Person {
  val person = Person("Peter")

  person.age = 18
  person.about = "I like turtles"

  return person
}

// sử dụng apply vừa trả về chính object person, vừa cho phép truy cập vào các thuộc tính và hàm của object person mà
// không cần phải viết lại tên object nhiều lần
fun newPerson(): Person = Person("Peter").apply {
  age = 18
  about = "I like turtles"
}
```

## 5. also

**SLIDE**: Function signature
```kotlin
inline fun <T> T.also(block: (T) -> Unit): T
```

- Cho phép bạn truyền đối tượng vào một hàm lambda, xử lý và trả về đối tượng đó (this).
  Giá trị trả về của function là đối tượng receiver (this).

- Cú pháp: `object.also { doSomething(it) }`.
  Object sẽ được sử dụng như 1 tham số của lambda `block` (it).
  Giá trị trả về của function apply là đối tượng receiver object.

- `also` có thể hữu ích khi chúng ta muốn thực hiện 1 hành động nào đó trên 1 object, và trả về chính object đó.
  Nhưng bên trong lambda, chúng ta chỉ muốn truy cập object đó thông qua it mà không phải this.
- Về công dụng, `also` giống `apply`, nhưng `also` sử dụng param `it`, trong khi `apply` sử dụng receiver param `this`.

**SLIDE** Ví dụ:
```kotlin
val numbers: MutableList<String> = mutableListOf("one", "two", "three")
numbers
    .also { println("The list elements before adding new one: $it") }
    .add("four")
```

## 6. takeIf, takeUnless

- Ngoài ra, còn có 2 function `takeIf` và `takeUnless` có thể giúp bạn kiểm tra 1 điều kiện nào đó trên 1 object.

- `takeIf`: trả về chính object đó nếu điều kiện đó đúng, hoặc trả về null nếu điều kiện đó sai.
- `takeUnless`: trả về chính object đó nếu điều kiện đó sai, hoặc trả về null nếu điều kiện đó đúng (ngược với `takeIf`).

**SLIDE**: Ví dụ
```kotlin
val number: Int = Random.nextInt(100)

// Nếu number là số chẵn, thì evenOrNull sẽ bằng number, ngược lại evenOrNull sẽ bằng null
// khi lambda { it % 2 == 0 } == true => evenOrNull == number
val evenOrNull: Int? = number.takeIf { it % 2 == 0 }

// Nếu number là số chẵn, thì oddOrNull sẽ bằng null, ngược lại oddOrNull sẽ bằng number
// khi lambda { it % 2 == 0 } == false => oddOrNull == number
val oddOrNull: Int? = number.takeUnless { it % 2 == 0 }

println("even: $evenOrNull, odd: $oddOrNull")
```

**SLIDE**: Bảng tóm tắt

| Function | Object reference | Return value   | Is extension function |
|----------|------------------|----------------|-----------------------|
| let      | it               | Lambda result  | Yes                   |
| run      | this             | Lambda result  | Yes                   |
| with     | this             | Lambda result  | No                    |
| apply    | this             | Context object | Yes                   |
| also     | it               | Context object | Yes                   |


# III. Operator overloading

- Trong Kotlin, operator overloading cho phép ta định nghĩa lại các toán tử có sẵn để thực hiện các hành động khác nhau đối với các đối tượng của lớp của ta.
  Khi ta định nghĩa lại một toán tử, ta cung cấp một cách để xử lý các thao tác của nó trên đối tượng của lớp của ta.

- Trong Kotlin, `operator fun` là một từ khóa để đánh dấu một hàm là một `phương thức toán tử.`
  Khi một hàm được đánh dấu bằng từ khóa `operator fun`, nó cho phép ta định nghĩa lại một toán tử có sẵn để thực hiện một hành động cụ thể với đối tượng

## 1. Toán tử một ngôi

**SLIDE**: Bảng tóm tắt

| Expression | Translated to    |
|------------|------------------|
| `+a`       | `a.unaryPlus()`  |
| `-a`       | `a.unaryMinus()` |
| `!a`       | `a.not()`        |

Ví dụ
```kotlin
data class Point(val x: Int, val y: Int)

operator fun Point.unaryMinus() = Point(-x, -y)

val point = Point(10, 20)

fun main() {
   println(-point)  // prints "Point(x=-10, y=-20)"
}
```
Nhìn vào bảng, ta sẽ thấy các hàm tương ứng với các toán tử và cách compiler xử lý khi ta sử dụng các toán tử đó. VD: +a, nó sẽ hoạt động theo các bước sau:

- 1 Xác định kiểu dữ liệu của a, giả sử là T
- 2 Tìm kiếm function unaryPlus() với từ khóa operator và không có tham số đối với kiểu T. Function đó có thể là member function hoặc extension function.
- 3 Nếu không có function đó, quá trình compile sẽ bị lỗi
- 4 Nếu function đó có mặt và kiểu trả về của nó là R, biểu thức +a sẽ trả về kiểu dữ liệu R

Giải thích ví dụ : Sau khi định nghĩa lại toán tử -, Đối tượng Point từ bây giờ sẽ dùng được với toán từ -(compile thành công) và khi sử dụng toán tử -, compiler sẽ tìm đến extension function unaryMinus() của đối tượng Point,
function này trả về kiểu Point với giá trị của x,y được đổi dấu.

## 2. Toán tử một ngôi hậu tố/ tiền tố ++, --

**SLIDE** Ví dụ:

| Expression | Translated to         |
|------------|-----------------------|
| `a++`      | `a.inc()` + see below |
| `a--`      | `a.dec()` + see below |

Khi xử lý các toán tử một ngôi hậu tố, compiler sẽ xử lý như sau. VD đối với a++:
- 1: Xác định kiểu dữ liệu của a, giả sử là T
- 2: Tìm kiếm function inc() với từ khóa operator, không có tham số và kiểu trả về của function này phải là kiểu T hoặc kế thừa từ T


Ví dụ
```kotlin
class MyInt(var value: Int) {
    operator fun inc(): MyInt {
        value++
        return this
    }
}

// Sử dụng toán tử ++ được định nghĩa lại cho lớp MyInt
var x = MyInt(10)
x++
println(x.value) // Kết quả là 11
```

## 3. Toán tử hai ngôi

**SLIDE** Ví dụ:

| Expression | Translated to  |
|------------|----------------|
| `a + b`    | `a.plus(b)`    |
| `a - b`    | `a.minus(b)`   |
| `a * b`    | `a.times(b)`   |
| `a / b`    | `a.div(b)`     |
| `a % b`    | `a.rem(b)`     |
| `a..b `    | `a.rangeTo(b)` |

Ví dụ
```kotlin
class PhanSo(val tuSo: Int, val mauSo: Int) {
    operator fun plus(other: PhanSo): PhanSo {
        val lcm = lcm(mauSo, other.mauSo)
        val newTuSo = tuSo * (lcm / mauSo) + other.tuSo * (lcm / other.mauSo)
        return PhanSo(newTuSo, lcm)
    }
}
val ps1 = PhanSo(1, 2)
val ps2 = PhanSo(1, 3)
val ps3 = ps1 + ps2 // ps3 sẽ là PhanSo(5, 6)
```

# IV. Exceptions

- Tất cả các exception classes trong Kotlin đều kế thừa từ Throwable class.
  Mỗi exception có một message, một stack trace, và một optional cause.

- Để throw một exception, ta sử dụng từ khóa `throw` với một instance của một exception class.

**SLIDE**:
```kotlin
fun main() {
  throw Exception("Hi There!")
}
```

- Để bắt một exception, ta sử dụng một khối `try-catch`.
  Trong khối `try`, ta đặt các đoạn code có thể ném ra exception.
  Trong khối `catch`, ta đặt các đoạn code xử lý exception.
  Trong khối `finally`, ta đặt các đoạn code sẽ được thực thi sau cùng dù có exception hay không.
  Khối `catch` là optional (có thể không có), nhưng nếu không có thì khối `try` phải có khối `finally`.

**SLIDE**:
```kotlin
try {
    // some code
} catch (e: SomeException) {
    // handler
} finally {
    // optional finally block
}
```

- Khác với Java, try trong Kotlin là 1 expression (có thể trả về giá trị).
  Vì vậy, ta có thể gán giá trị của try cho một biến.
  Giá trị trả về của try expression là giá trị của biểu thức cuối cùng trong try block hoặc giá trị của biểu thức
  cuối cùng trong catch block (hoặc các block). Nội dung của finally block không ảnh hưởng đến kết quả của biểu thức.

**SLIDE**:
```kotlin
val a: Int? = try { input.toInt() } catch (e: NumberFormatException) { null }
```

- `throw` là 1 expression có kiểu `Nothing`. Vì vậy, ta có thể sử dụng `throw` trong các biểu thức khác.
  (type `Nothing` là subtype của tất cả các type khác, vì vậy nó có thể được gán cho bất kỳ biến nào).

**SLIDE**
```kotlin
val s: String = person.name ?: throw IllegalArgumentException("Name required")
s.length // 's' is known to be non-nullable at this point
```

# V. Collections and operations.

<img src="collections-diagram.png" alt="drawing" width="500"/>

Diagram của Kotlin Collection cho thấy các interface và class chính của Collection Framework trong Kotlin và các quan hệ giữa chúng.

Các interface cốt lõi của Kotlin Collection bao gồm:

1. `Iterable`: đại diện cho một tập hợp các phần tử có thể duyệt qua (iterate) được.
2. `Collection`: tiển khai từ `Iterable` và đại diện cho một tập hợp các phần tử có thể lặp lại (trùng lặp) và đếm được (countable).
3. `List`: tiển khai từ `Collection` Collection có lẽ là được dùng nhiều nhất. Nó đại diện cho một tập các phần tử có thứ tự. Bởi vì có thứ tự, ta có thể truy cập các phần tử thông qua chỉ số.
4. `Set`: tiển khai từ `Collection` và đại diện cho một tập hợp các phần tử không có thứ tự và không có phần tử trùng lặp.
5. `Map`: đại diện cho một Map (mapping) ánh xạ cặp key-value, trong đó mỗi key phải là duy nhất và có thể được sử dụng để truy cập value tương ứng.

Dưới đây là danh sách các class cài đặt các interface trong Kotlin Collection:

1. Iterable:
    - ArrayList
    - LinkedList
    - HashSet
    - TreeSet
    - HashMap
    - TreeMap

2. Collection:
    - ArrayList
    - LinkedList
    - HashSet
    - TreeSet
    - ArrayDeque
    - LinkedHashSet

3. List:
    - ArrayList
    - LinkedList

4. Set:
    - HashSet
    - LinkedHashSet
    - TreeSet

5. Map:
    - HashMap
    - LinkedHashMap
    - TreeMap

## 1. List

List là một danh sách trong Kotlin, lưu trữ các phần tử theo thứ tự được chỉ định và cung cấp truy cập theo chỉ mục cho chúng.
Trong Kotlin, List là một interface đại diện cho một tập hợp (collection) các phần tử có thứ tự và có thể lặp lại.
Các phần tử trong List có thể được truy cập bằng chỉ số, tương tự như mảng.

Có hai loại List trong Kotlin: MutableList và List.
- 1: MutableList cho phép thêm, xoá và sửa đổi các phần tử,
- 2: List là một danh sách chỉ đọc, không thể thay đổi các phần tử.
-
## 2. Set

Set là một tập hợp trong Kotlin lưu trữ một tập hợp duy nhất các phần tử.
Điều này có nghĩa là nó không thể chứa các phần tử trùng lặp.
Các phần tử trong Set không được định nghĩa theo thứ tự cụ thể.
Set cũng có thể chứa giá trị null, nhưng chỉ có thể chứa một giá trị null duy nhất. Hai Set được coi là bằng nhau nếu chúng có cùng kích thước và cho mỗi phần tử trong một Set thì tồn tại một phần tử tương đương trong Set khác.

## 3. Map
một tập các cặp key - value với key trong map là duy nhất
Map không implement từ interface Collection, tuy nhiên nó cũng là một loại Collection trong Kotlin.
Map lưu trữ các cặp key-value (hoặc entry); keys là duy nhất, nhưng khác nhau keys có thể giá trị bằng nhau.
Interface Map cung cấp các chức năng cụ thể, chẳng hạn như truy cập vào giá trị thông qua key, tìm kiếm keys và values và các chức năng khác.





# VI. Delegation, Lazy Delegation, Built-in Delegation

## 1. Delegation

- Kotlin hỗ trợ [Delegation pattern](https://en.wikipedia.org/wiki/Delegation_pattern) thông qua `by` keyword.
- Kotlin delegation là một cách thức cho phép 1 object uỷ quyền các hành vi của nó cho 1 object khác.

Một class `Derived` có thể triển khai một interface `Base` bằng cách uỷ quyền tất cả các thành phần public của nó cho một object được chỉ định:
```kotlin
interface Base {
    fun print()
}

class BaseImpl(private val x: Int) : Base {
    override fun print() = println(x)
}

class Derived(b: Base) : Base by b

fun main() {
    val b = BaseImpl(10)
    Derived(b).print() // prints 10
}
```

- Câu lệnh `by` trong danh sách supertype cho `Derived` cho biết rằng `b` sẽ được lưu trữ bên trong các object `Derived`
  và trình biên dịch sẽ tạo ra tất cả các method của `Base` forward đến `b`.
  Trình biên dịch sẽ generate các method của `Base` trong `Derived`, và chúng sẽ được forward đến `b`, như sau:

```kotlin
class Derived(private val b: Base) : Base {
    override fun print() = b.print()
}
```

- Ví dụ trong Android

```kotlin
data class Movie(val id: String, val title: String, val poster: String)

interface MoviesRepository {
  fun getTrendingMovies(): List<Movie>
  fun getFavoriteMovies(): List<Movie>
  fun getPopularMovies(): List<Movie>
}

class MoviesRepositoryImplV1(private val apiV1: MoviesApiV1) : MoviesRepository {
  override fun getTrendingMovies(): List<Movie> = apiV1.getTrendingMovies()
  override fun getFavoriteMovies(): List<Movie> = apiV1.getFavoriteMovies()
  override fun getPopularMovies(): List<Movie> = apiV1.getPopularMovies()
}

class MoviesRepositoryImplV2(
  private val apiV2: MoviesApiV2,
  delegate: MoviesRepository
) : MoviesRepository by delegate {
  override fun getFavoriteMovies(): List<Movie> = apiV2.getFavoriteMovies()
}

fun provideMoviesRepository(): MoviesRepository {
  return MoviesRepositoryImplV1(provideMoviesApiV1())
}

// lúc sau
fun provideMoviesRepository(): MoviesRepository {
  val v1 = MoviesRepositoryImplV1(provideMoviesApiV1())
  return MoviesRepositoryImplV2(provideMoviesApiV2(), v1)
}
```

## 2. Delegated properties

- Trong Kotlin, Delegated Properties là một tính năng cho phép ta thay đổi cách lưu trữ giá trị của một thuộc tính của một lớp.
  Thay vì lưu trữ giá trị trực tiếp, Delegated Properties cho phép ta chuyển trách nhiệm việc lưu trữ giá trị sang một đối tượng khác.
  Khi giá trị của thuộc tính được truy cập hoặc thay đổi, đối tượng được ủy quyền sẽ được thông báo và có thể thực hiện các xử lý thích hợp.

Ví dụ
```kotlin
import kotlin.reflect.KProperty

class Example {
    var p: String by Delegate()
}

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}

val e = Example()
println(e.p)
e.p = "NEW"
```

- Các yêu cầu của một Property Delegate là
    - read-only property (val): một Delegate phải cung cấp một phương thức `operator fun getValue()` với các tham số sau:
        - thisRef: tham chiếu đến đối tượng nơi thuộc tính được gọi
        - property: metadata của thuộc tính được gọi
      ```kotlin
      class Resource
      
      class Owner {
          val valResource: Resource by ResourceDelegate()
      }
      
      class ResourceDelegate(private val resource: Resource = Resource()) {
          operator fun getValue(thisRef: Owner, property: KProperty<*>): Resource {
              return resource
          }
      }
      ```
    - mutable property (var): một Delegate phải cung cấp một phương thức `operator fun setValue()` với các tham số sau:
        - thisRef: tham chiếu đến đối tượng nơi thuộc tính được gọi
        - property: metadata của thuộc tính được gọi
        - value: giá trị mới của thuộc tính
      ```kotlin
      class Resource
      
      class Owner {
          var varResource: Resource by ResourceDelegate()
      }
      
      class ResourceDelegate(private var resource: Resource = Resource()) {
          operator fun getValue(thisRef: Owner, property: KProperty<*>): Resource {
              return resource
          }
          operator fun setValue(thisRef: Owner, property: KProperty<*>, value: Any?) {
              if (value is Resource) {
                  resource = value
              }
          }
      }
      ```
    - Để dễ dàng đúng với các yêu cầu, ta có thể `implements` hai interface `ReadOnlyProperty` và `ReadWriteProperty`
      ```kotlin
      fun resourceDelegate(resource: Resource = Resource()): ReadWriteProperty<Any?, Resource> =
          object : ReadWriteProperty<Any?, Resource> {
              var curValue = resource
              override fun getValue(thisRef: Any?, property: KProperty<*>): Resource = curValue
              override fun setValue(thisRef: Any?, property: KProperty<*>, value: Resource) {
                  curValue = value
              }
          }
      
      val readOnlyResource: Resource by resourceDelegate()  // ReadWriteProperty as val
      var readWriteResource: Resource by resourceDelegate()
      ```

- Kotlin cũng cho phép delegate tới các thuộc tính khác
  Ví dụ
```kotlin
var topLevelInt: Int = 0
class ClassWithDelegate(val anotherClassInt: Int)

class MyClass(var memberInt: Int, val anotherClassInstance: ClassWithDelegate) {
    var delegatedToMember: Int by this::memberInt
    var delegatedToTopLevel: Int by ::topLevelInt
    val delegatedToAnotherClass: Int by anotherClassInstance::anotherClassInt
}
var MyClass.extDelegated: Int by ::topLevelInt
```

- Delegate các giá trị được lưu trữ trong 1 Map
  Ví dụ
```kotlin
class User(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int     by map
}

val user = User(
  mapOf(
    "name" to "John Doe",
    "age"  to 25
  )
)
println(user.name) // Prints "John Doe"
println(user.age)  // Prints 25
```

## 3. Lazy delegation

- Lazy delegation là một loại delegate đặc biệt, được sử dụng để giữ giá trị của thuộc tính chỉ khi cần thiết.
  Khi một thuộc tính được khởi tạo bằng cách sử dụng lazy delegate, giá trị của nó chỉ được tính toán khi được truy cập lần đầu tiên,
  và sau đó được lưu trữ để sử dụng cho các truy cập tiếp theo.
  Điều này giúp tránh việc tính toán giá trị của thuộc tính khi nó không cần thiết.
  Lazy delegate được sử dụng rất nhiều trong Android, khi ta muốn khởi tạo một đối tượng nào đó mất nhiều thời gian, ví dụ như một đối tượng Retrofit.
  Khi đó, ta sẽ sử dụng lazy delegate để khởi tạo đối tượng Retrofit chỉ khi nào cần thiết.

Ví dụ
```kotlin
class LazySample {
    init {
        println("created!")
    }
    val lazyStr: String by lazy {
        println("computed!")
        "my lazy"
    }
}

val sample = LazySample()
sample.lazyStr
sample.lazyStr
```

- Hàm `lazy()` nhận vào 1 lambda, trả về 1 instance `Lazy<T>`, nó có thể đưược sử dụng như một delegate cho thuộc tính.
  Giá trị của thuộc tính chỉ được tính toán khi được truy cập lần đầu tiên, và sau đó được lưu trữ để sử dụng cho các truy cập tiếp theo.
  Những lần truy cập sau đó, giá trị được tính toán ở lần đâ sẽ được trả về ngay lập tức.

- Ngoài ra, `lazy` còn có thể chấp nhận 1 tham số là 1 `enum class LazyThreadSafeMode`, enum này có 3 giá trị:
    - `SYNCHRONIZED` (mặc định): đảm bảo rằng giá trị chỉ được tính toán trên 1 thread duy nhất, các thread khác sẽ nhìn thấy cùng 1 giá trị.
    - `PUBLICATION`: lambda có thể thực thi nhiều lần trên nhiều thread, nhưng chỉ có 1 giá trị là giá trị cuối cùng được trả về.
    - `NONE`: giá trị có thể được tính toán trên nhiều thread, nhưng các thread khác nhau có thể nhìn thấy các giá trị khác nhau.
      Ta nên sử dụng `NONE` nếu biết property sẽ được truy cập trên 1 thread duy nhất, tránh việc đồng bộ hóa không cần thiết.
      Ví dụ trong Android Activity, đa số ta chỉ truy cập property trên Main Thread, nên thường sử dụng `lazy(NONE) { ... }`

```kotlin
class MainActivity : AppCompatActivity() {
    private val value by lazy(NONE) {
        println("computed!")
        1
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onCreate()")
        println("value = $value")
        println("value = $value")
    }
}
```

## 4. Built-in delegation

- Kotlin cung cấp một số Delegation thông qua object Delegates.

```kotlin
 import kotlin.properties.Delegates
 
 class User {
    var name: String by Delegates.observable("<no name>") { prop, old, new ->
        println("$old -> $new")
    }
    var address: String by Delegates.notNull()
    var age: Int by Delegates.vetoable(0) { prop, old, new ->
        new >= 0
    }
    
    override fun toString() = "User(name=$name, address=$address, age=$age)"
}

fun main() {
    val u = User()
    u.address = "123"
    println(u)
    u.name = "hoc"
    println(u)
    u.age = -1
    println(u)
    u.age = 12
    println(u)
}
```

# VII. Pair, Triple, Desctructuring Declarations

- Pair trong Kotlin là một cặp giá trị, có thể là 2 giá trị cùng kiểu hoặc khác kiểu.
  Pair được sử dụng khi ta muốn trả về 2 giá trị từ một hàm, hoặc truyền vào một hàm như một tham số.
  Pair được khởi tạo bằng cách sử dụng toán tử `to` hoặc hàm `Pair()`.
  Pair có 2 thuộc tính là `first` và `second`, có thể truy cập trực tiếp hoặc thông qua hàm `component1()` và `component2()`.

```kotlin
val pair1 = Pair("key", 1)
val pair2 = "key" to 1
val pair3 = Pair("key", 1)

println(pair1 == pair2)
println(pair1.first)
println(pair1.second)

val (f, s) = pair1
```

- Triple cũng tương tự Pair, nhưng là một cặp 3 giá trị.

```kotlin
val triple1 = Triple("key", 1, 2)
val triple2 = Triple("key", 1, 2)

println(triple1 == triple2)
println(triple1.first)
println(triple1.second)
println(triple1.third)

val (f, s, t) = triple1
```