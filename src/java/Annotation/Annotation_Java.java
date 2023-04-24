package src.java.Annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Định nghĩa một Annotation đơn giản
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value() default ""; // Định nghĩa một trường giá trị cho Annotation
}

// Sử dụng Annotation trong một lớp
class MyClass {
    @MyAnnotation(value = "Chào mừng đến với Java!")
    public void myMethod() {
        System.out.println("Hello, world!");
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
            e.printStackTrace();
        }
    }
}
