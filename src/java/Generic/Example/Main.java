package src.java.Generic.Example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List < Person > lstPerson = new ArrayList < > ();
        lstPerson.add(new Student("Nam", 21, "Thai Nguyen"));
        lstPerson.add(new Teacher("Trung", 40, "Ha Noi"));
        findMaxAge(lstPerson);

    }

    // chỗ này cần thay bằng genetic willcard
    public static void findMaxAge(List<? extends Person> lstPerson) { // List<Person> lstPerson
        Person maxAge = null;
        for (Person p: lstPerson) {
            if (maxAge == null || maxAge.age < p.age) {
                maxAge = p;
            }
        }
        if (maxAge != null) {
            showInfor(maxAge);
        }
    }

    /*
        trong trường hợp: có 1 method với tham số là List<Teacher> nhưng lại muốn truyền List<Person> vào thì sao nhỉ.
                            thì ta sẽ dùng từ khóa `super`


        public static void checkTeacher(List<? super Teacher> lstTeacher){
            // todo
        }

        List<Person> lstPerson = new ArrayList<>();
        checkTeacher(lstPerson); // OK
        checkTeacher(lstTeacher); // OK
        checkTeacher(lstStudent); // NOK

    */


    public static void showInfor(Person p) {
        System.out.println(String.format("%s, %d years old, from %s", p.name, p.age, p.address));
        p.say();
    }
}