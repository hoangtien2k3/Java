package src.DeSo2;

import java.util.Scanner;

public class TAILIEU {
    private String MaTaiLieu;
    private String TenTaiLieu;
    private int NamXB;

    public TAILIEU() {}

    public TAILIEU(String maTaiLieu, String tenTaiLieu, int namXB) {
        MaTaiLieu = maTaiLieu;
        TenTaiLieu = tenTaiLieu;
        NamXB = namXB;
    }

    public String getMaTaiLieu() {
        return MaTaiLieu;
    }

    public String getTenTaiLieu() {
        return TenTaiLieu;
    }

    public int getNamXB() {
        return NamXB;
    }

    public void NHAPTHONGTIN() {
        Scanner input = new Scanner(System.in);
        System.out.print("\t+ Nhập Tên Tài Liệu: ");
        TenTaiLieu = input.nextLine();
        System.out.print("\t+ Nhập Mã Tài Liệu: ");
        MaTaiLieu = input.nextLine();
        System.out.print("\t+ Nhập Năm Xuất Bản: ");
        NamXB = input.nextInt();
    }

    public void XUATTHONGTIN() {
        System.out.println("\t+ Tên Tài Liệu: " + getTenTaiLieu());
        System.out.println("\t+ Mã Tài Liệu: " + getMaTaiLieu());
        System.out.println("\t+ Năm Xuất Bản: " + getNamXB());
    }

}
