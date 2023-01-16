package src.DeSo2;

import java.util.Scanner;

public class SACHGIAOKHOA extends TAILIEU {
    private String Lop;
    private double DonGiaNhap;
    private int SoLuongNhap;


    public SACHGIAOKHOA() {}

    public SACHGIAOKHOA(String lop, double donGiaNhap, int soLuongNhap) {
        Lop = lop;
        DonGiaNhap = donGiaNhap;
        SoLuongNhap = soLuongNhap;
    }

    public SACHGIAOKHOA(String maTaiLieu, String tenTaiLieu, int namXB, String lop, double donGiaNhap, int soLuongNhap) {
        super(maTaiLieu, tenTaiLieu, namXB);
        Lop = lop;
        DonGiaNhap = donGiaNhap;
        SoLuongNhap = soLuongNhap;
    }

    public String getLop() {
        return Lop;
    }

    public double getDonGiaNhap() {
        return DonGiaNhap;
    }

    public int getSoLuongNhap() {
        return SoLuongNhap;
    }

    public void NHAPTHONGTIN() {
        Scanner input = new Scanner(System.in);
        super.NHAPTHONGTIN();
        System.out.print("\t+ Nhập Lớp: ");
        Lop = input.nextLine();
        System.out.print("\t+ Nhập Đơn Giá Nhập: ");
        DonGiaNhap = input.nextDouble();
        System.out.print("\t+ Nhập Số Lượng Nhập: ");
        SoLuongNhap = input.nextInt();
    }

    public void XUATTHONGTIN() {
        super.XUATTHONGTIN();
        System.out.println("\t+ Lớp: " + getLop());
        System.out.println("\t+ Đơn Giá Nhập: " + getDonGiaNhap());
        System.out.println("\t+ Số Lượng Nhập: " + getSoLuongNhap());
    }

    public double THANHTIEN(SACHGIAOKHOA[] sgk, int n) {
        double thanhtien = 0.0;
        for(int i = 0; i < n; i++) {
            thanhtien += (sgk[i].getDonGiaNhap() * sgk[i].getSoLuongNhap());
        }
        return thanhtien;
    }

}
