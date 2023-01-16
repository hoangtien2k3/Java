package src.DeSo1;

import java.util.Scanner;

public class PHUKIEN {
    private String MaPK;
    private String TenPK;
    private String MauSac;

    public PHUKIEN() {}
    public PHUKIEN(String MaPK, String TenPK, String MauSac) {
        this.MaPK = MaPK;
        this.TenPK = TenPK;
        this.MauSac = MauSac;
    }

    public String getMaPK() {
        return MaPK;
    }

    public String getTenPK() {
        return TenPK;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void NHAPTHONGTIN() {
        Scanner input = new Scanner(System.in);
        System.out.print("\t+ NHẬP TÊN PHỤ KIỆN: ");
        TenPK = input.nextLine();
        System.out.print("\t+ NHẬP MÃ PHỤ KIỆN: ");
        MaPK = input.nextLine();
        System.out.print("\t+ NHẬP MÀU SẮC: ");
        MauSac = input.nextLine();
    }

    public void XUATTHONGTIN() {
        System.out.println("\t+ TÊN PHỤ KIÊN: " + getTenPK());
        System.out.println("\t+ MÃ PHỤ KIỆN: " + getMaPK());
        System.out.println("\t+ MÀU SẮC: " + getMauSac());
    }

}
