package src.DeSo3;

import java.util.Scanner;

public class CUDAN {
    private int SoPhong;
    private String TenCuDan;
    private int SoDT;

    public CUDAN() {}

    public CUDAN(int soPhong, String tenCuDan, int soDT) {
        SoPhong = soPhong;
        TenCuDan = tenCuDan;
        SoDT = soDT;
    }

    public int getSoPhong() {
        return SoPhong;
    }

    public String getTenCuDan() {
        return TenCuDan;
    }

    public int getSoDT() {
        return SoDT;
    }

    public void NHAPTHONGTIN() {
        Scanner input = new Scanner(System.in);
        System.out.print("\t+ Nhập Tên Cư Dân: ");
        TenCuDan = input.nextLine();
        System.out.print("\t+ Nhập Số Phòng: ");
        SoPhong = input.nextInt();
        System.out.print("\t+ Nhập Số Điện Thoại: ");
        SoDT = input.nextInt();
    }

    public void XUATTHONGTIN() {
        System.out.println("\t+ Tên Cư Dân: " + getTenCuDan());
        System.out.println("\t+ Số Phòng: " + getSoPhong());
        System.out.println("\t+ Số Điện Thoại: " + getSoDT());
    }


}
