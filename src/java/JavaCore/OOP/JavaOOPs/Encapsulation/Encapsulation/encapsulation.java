/*
 *   - Tính đóng gói trong java là kỹ thuật ẩn giấu thông tin không liên quan và hiện thị ra thông liên quan.
 *     Mục đích chính của đóng gói trong java là giảm thiểu mức độ phức tạp phát triển phần mềm.
 *
 *
 *
 * */

package src.java.JavaCore.OOP.JavaOOPs.Encapsulation.Encapsulation;

public class encapsulation {
    public static void main(String[] args) {
        //creating instance of Account class
        test acc = new test();
        //setting values through setter methods
        acc.setAcc_no(7560504000L);
        acc.setName("Sonoo Jaiswal");
        acc.setEmail("sonoojaiswal@javatpoint.com");
        acc.setAmount(500000f);
        //getting values through getter methods
        System.out.println(acc.getAcc_no() + "\n" + acc.getName() + "\n" + acc.getEmail() + "\n" + acc.getAmount());
    }
}
