/*
    1. Serialization trong java:
        => Tuần tự hoá trong java hay serialization trong java là một cơ chế để ghi trạng thái
        của một đối tượng vào một byte stream.

        import java.io.Serializable;
        public class Student_1 implements Serializable {
            int id;
            String name;
            public Student_1(int id, String name) {
                this.id = id;
                this.name = name;
            }
        }


    2. Deserialization trong java:
        => Deserialization là quá trình tái thiết lại các đối tượng từ trạng thái serialized.
        Đây là hoạt động ngược lại của serialization.


    3. Java Serialization với thừa kế (Mối quan hệ IS-A):
            public class Person {
                int id;
                String name;

                Person(int id, String name) {
                    this.id = id;
                    this.name = name;
                }
            }

            public class Student_1 extends Person {
                String course;
                int fee;

                public Student_1(int id, String name, String course, int fee) {
                    super(id, name);
                    this.course = course;
                    this.fee = fee;
                }
            }


    4. Java Serialization với sự kết hợp (Mối quan hệ HAS-A)
            public class Address {
                String addressLine, city, state;

                public Address(String addressLine, String city, String state) {
                    this.addressLine = addressLine;
                    this.city = city;
                    this.state = state;
                }
            }

            import java.io.Serializable;

            public class Student_1 implements Serializable {
                int id;
                String name;
                Address address;// HAS-A

                public Student_1(int id, String name) {
                    this.id = id;
                    this.name = name;
                }
            }


    5. Java Serialization với thành viên dữ liệu static
            => Nếu có bất kỳ thành viên dữ liệu static trong một lớp, nó sẽ không được serialized
            bởi vì static là một phần của lớp chứ không phải đối tượng.

            import java.io.Serializable;

            public class Employee implements Serializable {
                int id;
                String name;
                static String company = "VietTuts";// it won't be serialized

                public Employee(int id, String name) {
                    this.id = id;
                    this.name = name;
                }
            }


    6. Java Serialization với array hoặc collection:
            => Trong trường hợp mảng hoặc bộ sưu tập, tất cả các đối tượng của
            array hoặc collection phải được tuần tự hóa.

    7. Externalizable trong java

        Giao tiếp Externalizable cung cấp hai phương thức:
            public void writeExternal(ObjectOutput out) throws IOException
            public void readExternal(ObjectInput in) throws IOException

* */

package src.java.Serialization.Serialization;

public class Serialization {
}
