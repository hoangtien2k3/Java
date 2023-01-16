package src.DeSo3;

import src.DeSo2.SACHGIAOKHOA;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập Vào Số Lượng Hóa Đơn Dịch Vụ: ");
        int n = input.nextInt();

        HOADONDICHVU[] hd = new HOADONDICHVU[n];
        for(int i = 0; i < n; i++) {
            hd[i] = new HOADONDICHVU();
        }

        for(int i = 0 ; i < n; i++) {
            System.out.println("\n==>> Nhập Vào Thông Tin Hóa Đơn Dịch Vụ Thứ " + (i + 1) + "<<== ");
            System.out.flush();
            hd[i].NHAPTHONGTIN();
        }

        System.out.println("\n\n\t==>> Danh Sách Hóa Đơn Dịch Vụ Vừa Nhập <<==");
        System.out.print("\n________________________________________\n");
        for(int i = 0; i < n; i++) {
            System.out.println("=> Thông Tin Hóa Đơn Dịch Vụ Thứ " + (i + 1) + " <=" );
            hd[i].XUATTHONGTIN();
            System.out.println("\n________________________________________\n");
        }

        System.out.println("=> Tổng Thành Tiền Của Tất Cả Hóa Đơn Dịch Vụ: " + new HOADONDICHVU().THANHTIEN(hd, n));

    }
}
