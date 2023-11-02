package src.java.Annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Định nghĩa một Annotation đơn giản
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME) // có 3 thời điểm chạy chương trình
@Target(ElementType.METHOD) // chú thích một annotation là hạn chế áp dụng với thành phần Java nào đó.
@interface MyAnnotation {
    String value() default ""; // Định nghĩa một trường giá trị cho Annotation
}


// Sử dụng Annotation trong một lớp
class MyClass {
    @MyAnnotation(value = "welcome to Java !!! Annotation")
    public void myMethod() {
        System.out.println("Hello, Annotation!");
    }
}

public class Annotation_Java {
    public static void main(String[] args) {
        // Sử dụng Reflection để truy cập vào Annotation trong phương thức myMethod
        try {
            Method myMethod = MyClass.class.getMethod("myMethod");
            MyAnnotation myAnnotation = myMethod.getAnnotation(MyAnnotation.class);
            if (myAnnotation != null) {
                System.out.println("Giá trị của MyAnnotation là: " + myAnnotation.value());
            }
        } catch (NoSuchMethodException e) {
            // e.printStackTrace();
        }
    }
}
