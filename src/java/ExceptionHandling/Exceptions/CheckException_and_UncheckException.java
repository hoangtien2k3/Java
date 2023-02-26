/*
*   Trong Java có 2 loại exception:
*           + checked
*           + unchecked.

    Tất cả các checked exception được kế thừa từ lớp Exception ngoại trừ lớp RuntimeException.
    RuntimeException là lớp cơ sở của tất cả các lớp unchecked exception.

    * Điểm khác biệt giữa các lớp checked và unchecked expcetion chính là thời điểm xác định được
    expcetion có thể xảy ra.
          + checked exception, việc kiểm tra được thực hiện ngay thời điểm compile time
*           Một số checked exception tiêu biểu như: IOException, InterruptedException, XMLParseException..
*
*         + unchecked exception, việc xác định có exception xảy ra hay không chỉ có thể thực hiện ở thời điểm runtime
*           Một số unchecked exception tiêu biểu là: NullPointerException, IndexOutOfBoundsException, ClassCastException…
*

* */

package src.java.ExceptionHandling.Exceptions;

public class CheckException_and_UncheckException {}
