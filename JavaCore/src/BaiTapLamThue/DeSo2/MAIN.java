package src.DeSo2;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập Vào Số Lượng Sách Giáo Khoa: ");
        int n = input.nextInt();

        SACHGIAOKHOA[] sgk = new SACHGIAOKHOA[n];
        for(int i = 0; i < n; i++) {
            sgk[i] = new SACHGIAOKHOA();
        }

        for(int i = 0 ; i < n; i++) {
            System.out.println("\n==>> Nhập Vào Thông Tin Của Sách Giáo Khoa Thu " + (i + 1) + "<<== ");
            System.out.flush();
            sgk[i].NHAPTHONGTIN();
        }

        System.out.println("\n\n\t==>> Danh Sách Sách Giao Khoa Vừa Nhập <<==");
        System.out.print("\n________________________________________\n");
        for(int i = 0; i < n; i++) {
            System.out.println("=> Thông Tin Sách Giáo Khoa Thứ " + (i + 1) + " <=" );
            sgk[i].XUATTHONGTIN();
            System.out.println("\n________________________________________\n");
        }

        System.out.println("=> Tổng Thành Tiền Của Tất Cả Sách Giáo Khoa: " + new SACHGIAOKHOA().THANHTIEN(sgk, n));

    }

}
