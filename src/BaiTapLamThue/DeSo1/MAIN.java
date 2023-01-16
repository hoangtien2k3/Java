package src.DeSo1;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("NHẬP VAO SỐ LƯỢNG TAI NGHE: ");
        int n = input.nextInt();

        TAINGHE[] s = new TAINGHE[n];
        for(int i = 0; i < n; i++) {
            s[i] = new TAINGHE();
        }

        for(int i = 0; i < n; i++) {
            System.out.println("\nNHẬP VÀO THÔNG TIN CỦA TAI NGHE THU " + (i + 1));
            System.out.flush();
            s[i].NHAPTHONGTIN();
        }

        System.out.println("\n\n\t==>> DANH SACH TAI NGHE DA NHAP <<==");
        System.out.print("\n________________________________________\n");
        for(int i = 0; i < n; i++) {
            System.out.println("=> THÔN TIN CỦA TAI NGHE THU " + (i + 1) + " <=" );
            s[i].XUATTHONGTIN();
            System.out.println("\n________________________________________\n");
        }

        System.out.println("=> TỔNG TIỀN TẤT CẢ CÁC TAI NGHE CÓ TRONG DANH SACH: " + new TAINGHE().THANHTIEN(s, n));

    }
}
