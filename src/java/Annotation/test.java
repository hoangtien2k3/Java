package src.java.Annotation;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Deprecated
    public void display(){
        System.out.printf("Tôi tên là %s, năm nay tôi %d tuổi, tôi đến từ %s", name, age, address);
    }
}


public class test {

    // 1. Koi tao mot chu thich can lap lai
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ReAnno {
        String value();
    };

    // 2. Khoi tao mot chu thich long nhau
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ReAnnos {
        ReAnno[] value();
    }

    // 3. Use repeating annotations
    @ReAnnos({@ReAnno("Codelearn"), @ReAnno("NMD.SE")})
    public interface ReAnnotation {
    }


    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        // 4. Retrieving Annotations via the Filters class
        ReAnnos rep = ReAnnotation.class.getAnnotation(ReAnnos.class);
        for (ReAnno re : rep.value()) {
            System.out.println(re.value());
        }


        Person person =  new Person("tien", 20, "VietNam");
        person.display();

    }
}