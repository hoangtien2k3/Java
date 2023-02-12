## [*Luồng I/O trong Java - Viblo*](https://viblo.asia/p/luong-io-trong-java-vlZL990WLQK)
Trong project này chúng ta sẽ cùng nhau làm quen với khái niệm luồng (streams) và file.
- **Khái niệm luồng (stream)**: Một stream có thể được định nghĩa như là một dãy liên tục dữ liệu. Java định nghĩa 2 kiểu luồng: byte và ký tự (phiên bản gốc chỉ định nghĩa kiểu luồng byte, và sau đó luồng ký tự được thêm vào trong các phiên bản về sau). Luồng ký tự được thiết kế hỗ trợ việc nhập xuất dữ liệu kiểu ký tự (Unicode). Trong một vài trường hợp luồng ký tự sử dụng hiệu quả hơn luồng byte, nhưng ở mức hệ thống thì tất cả những xuất nhập đều phải qui về byte. Luồng ký tự hỗ trợ hiệu quả chỉ đối với việc quản lý, xử lý các ký tự.

### Luồng Byte:
- Các luồng byte được định nghĩa dùng hai lớp phân cấp, mức trên cùng là hai lớp trừu tượng **InputStream** và **OutputStream**, là các lớp cha của các lớp xuất nhập kiểu byte. InputStream định nghĩa những đặc điểm chung cho những luồng nhập byte. OutputStream mô tả cách xử lý của các luồng xuất byte.

<h1 align="center"><img src="http://i.imgur.com/TdlBT3Z.png"></h1>

Nhìn trong hình, bạn có thể hiểu được quan hệ giữa các class trong IO với nhau. Chúng ta cần quan tâm nhiều đến **FileInputStream** (FileOutputStream) và **BufferedInputStream** (BufferedOutputStream) khi làm việc xuất nhập với file.
- **FileInputStream**: Làm việc với file, Đọc từng byte dữ liệu bằng phương thức read(), khi kết thúc nó trả về giá trị -1. Cách này có tốc độ tương đối chậm.
  Đọc theo từng byte:


```sh
FileInputStream in = new FileInputStream("data.txt");
while ((byteRead = in.read()) != -1) {
  System.out.println(byteRead);
}
```
Đọc theo từng mảng byte.
```java
//Dữ liệu đọc được lưu vào mảng byteBuf.
//byteRead là số byte đọc được
FileInputStream in = new FileInputStream("data.txt");
byte[] byteBuf = new byte[4096];
while ((byteRead = in.read()) != -1) {
  for(int i = 0; i <= byteRead; i++){
    System.out.println(byteBuf[i]);
  }
}
```

### Tuy nhiên điều này dường như không được khuyến khích. Để tăng tốc độ bằng việc sử dụng bộ đệm, hãy sử dụng [**BufferedInputStream**].
- **BufferedInputStream**: Java sử dụng cơ chế nhập/xuất có lập vùng đệm để tạm thời lập cache dữ liệu vào/ra của một dòng. Nó giúp chương trình đọc/ghi lượng dữ liệu nhỏ không ảnh hưởng lớn đến hiệu năng chung của hệ thống. Trong khi thực hiện vào có vùng đệm, một số lượng byte lớn được đọc tại một thời điểm, và lưu trữ trong một vùng đệm nhập. Khi chương trình đọc dòng nhập thì thay vì ra dòng vào để đọc nó đọc từ vùng đệm nhập. Tiến trình lập vùng đệm ra cũng thực hiện tương tự. khi dữ liệu được một chương trình ghi ra dòng ra, dữ liệu ra được lưu trữ trong một vùng đệm ra. Dữ liệu được lưu trữ đến khi vùng đệm đầy hoặc các dòng tra thực hiện xả trống (flush). Cuối cùng liệu ra trong vùng đệm được chuyển đến dòng ra.

Lớp này tự động tạo ra và duy trì vùng đệm để hỗ trợ thao tác vào. Nhờ đó chương trình có thể đọc dữ liệu từ dòng từng byte một mà không ảnh hưởng đến tốc độ thực hiện của hệ thống. Bởi lớp **BufferedInputStream** là một bộ lọc, nên có thể áp dụng nó cho một số đối tượng nhất định của lớp InputStream (không nhất thiết chỉ làm việc với file) và cũng có thể phối hợp với các tập tin đầu vào khác.
BufferedInputStream được hiểu một phương thức trung gian, tham số truyền vào của nó là một dòng inputstream (ví dụ FileInputStream). Khác với FileInputStream có tham số truyền vào 1 file.
```sh
BufferedInputStream in = new BufferedInputStream(new FileInputStream("data.txt"));
while ((byteRead = in.read()) != -1) {
  System.out.println(byteRead);
}
```
Đọc theo mảng byte:
```sh
BufferedInputStream in = new BufferedInputStream(new FileInputStream("data.txt"));
byte[] byteBuf = new byte[4096];
while ((byteRead = in.read()) != -1) {
  for(int i = 0; i <= byteRead; i++){
    System.out.println(byteBuf[i]);
  }
}
```
- **Các phương thức của lớp InputStream**

|Tên phương thức	|Mô tả|
|------------------------|-----|
|read()|	Đọc các byte dữ liệu từ một dòng. Nếu như không có byte dữ liệu nào, nó phải chờ. Khi một phương thức phải chờ, các luồng đang thực hiện phải tạm dừng cho đến khi có dữ liệu.|
|read (byte [])|	Trả về số byte đọc được hay ‘-1’ nếu như đã đọc đến cuối dòng. Nó gây ra ngoại lệ IOException nếu có lỗi xảy ra.|
|read (byte [], int, int)|	Nó cũng đọc vào một mảng byte. Nó trả về số byte thực sự đọc được cho đến khi kết thúc dòng. Nó gây ra ngoại lệ IOException nếu lỗi xảy ra.|
|available()|	Phương pháp này trả về số lượng byte có thể đọc được mà không pahỉ chờ. Nó trả về số byte hiện tại có trong dòng. Nó không phải là phương thức tin cậy để thực hiện tiến trình xử lý đầu vào.|
|close()|	Phương thức này đóng dòng. Nó dùng để giải phóng mọi tài nguyên dòng đã sử dụng. Luôn luôn đóng dòng để chắc chắn rằng dòng xử lý được kết thúc. Nó gây ra ngoại lệ IOException nếu lỗi xảy ra.|
|mark()|	Đánh dấu vị trí hiện tại của dòng.|
|markSupported()|	Trả về giá trị boolean chỉ ra rằng dòng có hỗ trợ các khả năng mark và reset hay không. Nó trả về True nếu dòng hỗ trợ ngược lại trả về False.|
|reset()|	Phương thức này định vị lại dòng theo vị trí được đánh lần cuối cùng. Nó gây ra ngoại lệ IOException nếu lỗi xảy ra.|
|skip()|	Phương thức này bỏ qua ‘n’ byte dòng vào. "-n" chỉ định số byte được bỏ qua. Nó gây ra ngoại lệ IOException nếu lỗi xảy ra. Phương thức này sử dụng để di chuyển tới vị trí đặc biệt bên trong dòng vào.|

- **Các phương thức của lớp OutputStream**

|Tên phương thức	   |Mô tả|
|--------------------|-----|
|write(int)|	Phương thức này ghi một byte|
|write(byte[])|	Phương thức này phong toả cho đến khi một byte được ghi. dòng phải chờ cho đến khi tác vụ ghi hoàn tất. Nó gây ra ngoại lệ IOException nếu lỗi xảy ra.|
|write(byte[],int,int)|	Phương thức này ghi mảng các byte. Lớp OutputStream định nghĩa ba dạng khác nhau của phương thức để có thể ghi một byte riêng lẻ, một mảng các byte, hay một đoạn của một mảng byte.|
|flush()|	Phương thức này xả sạch dòng.Đệm dữ liệu được ghi ra dòng. Nó kích hoạt IOException nếu lỗi xảy ra.|
|close()|	Phương thức đóng dòng.Nó được dùng để giải phóng mọi tài nguyên gắn với dòng. Nó kích hoạt IOException nếu lỗi xảy ra.|

### Luồng ký tự:
Trong nhiều trường hợp luồng byte không phải là cách tốt nhất để quản lý nhập xuất dữ liệu ký tự. Trong lập trình Java có kiểu luồng ký tự phục vụ riêng cho việc nhập xuất dữ liệu trên luồng. Mức trên cùng là 2 lớp trừu tường Reader và Writer. Các lớp dẫn xuất từ Reader và Writer hỗ trợ thao tác trên các luồng ký tự Unicode.

<img src="http://i.imgur.com/2Ltj8wI.png">

Để thao tác với file, bạn cần quan tâm đến các class *FileReader* và *BufferedReader*
Ví dụ chỉ sử dụng FileReader
```sh
//Đọc từng ký tự một
FileReader inputStream = new FileReader("data.txt");
int c;
while ((c = inputStream.read()) != -1) {
  System.out.print((char)c);
}
```

Nếu sử dụng BufferedReader
```sh
//Có thể đọc theo từng dòng
FileReader fin = new FileReader("data.txt");
BufferedReader in = new BufferedReader(fin);
String str;
while ((str = in.readLine()) != null) {
  System.out.println(str);
}
```
Ví dụ đọc dữ liệu từ hệ thống (Console)
```sh
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Nhập chuỗi ký tự, kết thúc bằng dấu chấm .");
do {
  c = (char) br.read();
  System.out.println(c);
} while (c != '.');
```
Ở đây, chúng ta không có cách nào xây dựng 1 lớp BufferedReader trực tiếp từ System.in vì thế nên cần chuyển nó thành luồng ký tự bằng cách dùng InputStreamReader để chuyển byte thành ký tự.

- **Các phương thức của lớp Reader**

|Phương thức |Mô tả|
|------------|-----|
|void close | Đóng luồng|
|void mark(int numChars)| Đánh dấu vị trí hiện tại trên luồng|
|int read()| Đọc một ký tự|
|int read(char buffer[])| đọc buffer.length ký tự và ghi vào buffer|
|abstract int read(char buffer[], int offset, int numChars)| Đọc numChars ký tự cho vào vùng đệm buffer tại vị trí buffer[offset]|
|boolean ready()| Kiểm tra xem luồng có đọc được không|
|void reset()| Dời con trỏ nhập đến vị trí đánh dấu trước đó|
|long skip(long numChars| Bỏ qua numChars của luồng nhập|

- **Các phương thức của lớp Writer**

| abstract void close() | Đóng luồng xuất|
|-----------------------|----------------|
| void flush() | Dọn dẹp luồng. (Xuất buffer ra)|
| void write(int ch) | Ghi một ký tự|
| void write(byte buffer[]) | Ghi một mảng ký tự|
| void write(char buffer[], int offset, int numChars) | Ghi một phần của mảng ký tự|
| void write(String str) | Ghi một chuỗi|
| void write(String str, int offset, int numChars) | Ghi một phần của chuỗi ký tự|

### Đọc và ghi đối tượng trong Java
Trong Java, việc đọc và ghi một object do class ObjectOutputStream và ObjectInputStream đảm nhiệm. Đây là 2 lớp con của lớp java.io.OutputStream và java.io.InputStream. Để đọc ghi theo Object trong Java thì tại class Object đó ta cần đặt giao tiếp java.io.Serializable. Một ví dự đơn giản đọc ghi 1 Object MyStudent như sau:
```Java
public class ReadWriteObject {
    public static void main(String[] args){
        MyStudent myStudent = new MyStudent(); // tao doi tuong myStudent
 
        //Ghi Object vao file
 
        try {   // dat try cacth de tranh ngoai le khi tao va viet File
            FileOutputStream f = new FileOutputStream("student.dat"); // tao file f tro den student.dat
            ObjectOutputStream oStream = new ObjectOutputStream(f); // dung de ghi theo Object vao file f
            oStream.writeObject(myStudent); // ghi MyStudent theo kieu Object vao file
            oStream.close();
        } catch (IOException e) {
            System.out.println("Error Write file");
        }
 
        // doc Object tu file
        MyStudent ms = null;
 
        try {   // dat try cacth de tranh ngoai le khi tao va doc File
            FileInputStream f = new FileInputStream("student.dat"); // tao file f tro den student.dat
            ObjectInputStream inStream = new ObjectInputStream(f);  // dung de doc theo Object vao file f
            // dung inStream doc theo Object, ep kieu tra ve la MyStudent
            ms = (MyStudent) inStream.readObject();
            inStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.out.println("Error Read file");
        }
 
        // Xuat KQ
        System.out.println("My name is " + ms.name + ". I am " + ms.age + " years old");
    }
}
 
class MyStudent implements Serializable{
    String name = "Nguyen Cong Thanh";
    int age = 21;
}
```



