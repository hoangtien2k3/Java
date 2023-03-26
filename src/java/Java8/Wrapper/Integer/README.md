
#### Trong Java, lớp Integer cung cấp một số hàm con (utility functions) để thực hiện các thao tác liên quan đến số nguyên. Dưới đây là một số hàm con tiêu biểu trong lớp Integer:

[1. parseInt(String s)](): Chuyển đổi một chuỗi thành một giá trị kiểu nguyên. Ví dụ: int x = Integer.parseInt("123").

[2. toString(int i)](): Chuyển đổi một giá trị kiểu nguyên thành một chuỗi. Ví dụ: String s = Integer.toString(123).

valueOf(String s): Chuyển đổi một chuỗi thành một đối tượng Integer. Ví dụ: Integer x = Integer.valueOf("123").

valueOf(int i): Chuyển đổi một giá trị kiểu nguyên thành một đối tượng Integer. Ví dụ: Integer x = Integer.valueOf(123).

compare(int x, int y): So sánh hai giá trị kiểu nguyên. Trả về 0 nếu x bằng y, trả về giá trị âm nếu x nhỏ hơn y, và trả về giá trị dương nếu x lớn hơn y.

max(int x, int y): Trả về giá trị lớn hơn trong hai giá trị kiểu nguyên.

min(int x, int y): Trả về giá trị nhỏ hơn trong hai giá trị kiểu nguyên.

sum(int... values): Tính tổng của một mảng các giá trị kiểu nguyên.

reverse(int i): Đảo ngược các bit của một giá trị kiểu nguyên.

rotateLeft(int i, int distance): Quay trái các bit của một giá trị kiểu nguyên.

rotateRight(int i, int distance): Quay phải các bit của một giá trị kiểu nguyên.

numberOfLeadingZeros(int i): Đếm số lượng bit 0 đứng đầu của một giá trị kiểu nguyên.

numberOfTrailingZeros(int i): Đếm số lượng bit 0 đứng sau của một giá trị kiểu nguyên.

bitCount(int i): Đếm số lượng bit 1 trong một giá trị kiểu nguyên.

highestOneBit(int i): Tìm bit 1 cao nhất trong một giá trị kiểu nguyên.

lowestOneBit(int i): Tìm bit 1 thấp nhất trong một giá trị kiểu nguyên.

#### Các hàm con này giúp cho việc thao tác với các giá trị kiểu nguyên trở nên dễ dàng và thuận tiện hơn

