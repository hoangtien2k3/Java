package src.DeSo3;

import java.util.Scanner;

public class HOADONDICHVU extends CUDAN {
    private String TenDV;
    private int SoLuongSuDung;
    private double DonGia;

    public HOADONDICHVU() {}

    public HOADONDICHVU(String tenDV, int soLuongSuDung, double donGia) {
        TenDV = tenDV;
        SoLuongSuDung = soLuongSuDung;
        DonGia = donGia;
    }

    public HOADONDICHVU(int soPhong, String tenCuDan, int soDT, String tenDV, int soLuongSuDung, double donGia) {
        super(soPhong, tenCuDan, soDT);
        TenDV = tenDV;
        SoLuongSuDung = soLuongSuDung;
        DonGia = donGia;
    }

    public String getTenDV() {
        return TenDV;
    }

    public int getSoLuongSuDung() {
        return SoLuongSuDung;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void NHAPTHONGTIN() {
        Scanner input = new Scanner(System.in);
        super.NHAPTHONGTIN();
        System.out.print("\t+ Nhập Tên Dịch Vụ: ");
        TenDV = input.nextLine();
        System.out.print("\t+ Nhập Số Lượng Sử Dụng: ");
        SoLuongSuDung = input.nextInt();
        System.out.print("\t+ Nhập Đơn Giá: ");
        DonGia = input.nextDouble();
    }

    public void XUATTHONGTIN() {
        super.XUATTHONGTIN();
        System.out.println("\t+ Tên Dịch Vụ: " + getTenDV());
        System.out.println("\t+ Số Lượng Sử Dụng: " + getSoLuongSuDung());
        System.out.println("\t+ Đơn Giá: " + getDonGia());
    }

    public double THANHTIEN(HOADONDICHVU[] hd, int n) {
        double thanhtien = 0.0;
        for(int i = 0; i < n; i++) {
            thanhtien += (hd[i].getSoLuongSuDung() * hd[i].getDonGia());
        }
        return thanhtien;
    }

}
