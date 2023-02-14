package src.java.JavaCore.String.Java_String_Methods;

/*
* syntax:
*       public src.java.JavaCore.Java_String.String split(src.java.JavaCore.Java_String.String regex)
        public src.java.JavaCore.Java_String.String split(src.java.JavaCore.Java_String.String regex, int limit)
*
*       => Phương thức split() tách chuỗi này theo biểu thức chính quy(regular expression) và trả về mảng chuỗi.
* */
public class split {
    public static void main(String args[]) {
        String s1 = "java string split method by viettuts";
        String[] words = s1.split("\\s"); // tach chuoi dua tren khoang trang

        //su dung vong lap foreach de in cac element cua mang chuoi thu duoc
        for (String w : words) {
            System.out.println(w);
        }

    }
}
