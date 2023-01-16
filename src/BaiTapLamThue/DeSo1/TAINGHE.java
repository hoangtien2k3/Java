package src.DeSo1;

import java.util.Scanner;

public class TAINGHE extends PHUKIEN {
    private String Loai;
    private int SoLuongMua;
    private double DonGiaBan;

    public TAINGHE() {}

    public TAINGHE(String MaPK, String TenPK, String MauSac, String Loai, int SoLuongMua, double DonGiaBan) {
        super(MaPK, TenPK, MauSac);
        this.Loai = Loai;
        this.SoLuongMua = SoLuongMua;
        this.DonGiaBan = DonGiaBan;
    }

    public String getLoai() {
        return Loai;
    }
    public int getSoLuongMua() {
        return SoLuongMua;
    }
    public double getDonGiaBan() {
        return DonGiaBan;
    }

    public void NHAPTHONGTIN() {
        Scanner input = new Scanner(System.in);
        super.NHAPTHONGTIN();
        System.out.print("\t+ NHẬP LOẠI TAI NGHE: ");
        Loai = input.nextLine();
        System.out.print("\t+ NHẬP SỐ LƯỢNG MUA: ");
        SoLuongMua = input.nextInt();
        System.out.print("\t+ NHẬP ĐƠN GIÁ BÁN: ");
        DonGiaBan = input.nextDouble();
    }

    public void XUATTHONGTIN() {
        super.XUATTHONGTIN();
        System.out.println("\t+ LOẠI TAI NGHE: " + getLoai());
        System.out.println("\t+ SỐ LƯỢNG MUA: " + getSoLuongMua());
        System.out.println("\t+ ĐƠN GIÁ BÁN: " + getDonGiaBan());
    }

    public double THANHTIEN(TAINGHE[] s, int n) {
        double thanhtien = 0.0;
        for(int i = 0; i < n; i++) {
            thanhtien += (s[i].getSoLuongMua() * s[i].getDonGiaBan());
        }
        return thanhtien;
    }

}
