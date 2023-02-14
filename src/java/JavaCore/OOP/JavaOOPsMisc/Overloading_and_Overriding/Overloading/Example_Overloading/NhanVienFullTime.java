package src.java.JavaCore.OOP.JavaOOPsMisc.Overloading_and_Overriding.Overloading.Example_Overloading;

//import util.Configs;

/**
 * NhanVienFullTime chính là nhân viên toàn thời gian
 */
public class NhanVienFullTime extends NhanVien {

    private int ngayLamThem; // Ngày làm thêm của nhân viên
    private int loaiChucVu; // Chức vụ là lính hay sếp

    public NhanVienFullTime(String ten) {
        super(ten);
        this.loaiChucVu = Configs.NHAN_VIEN_LINH; // Mặc định là lính
    }

    public NhanVienFullTime(String ten, int ngayLamThem) {
        super(ten);
        this.ngayLamThem = ngayLamThem;
        this.loaiChucVu = Configs.NHAN_VIEN_LINH; // Mặc định là lính
    }

    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }

    @Override
    public String loaiNhanVien() {
        if (loaiChucVu == Configs.NHAN_VIEN_LINH) {
            return "Lính toàn thời gian" + (ngayLamThem > 0 ? " (có làm thêm ngày)":"");
        } else {
            return "Sếp toàn thời gian" + (ngayLamThem > 0 ? " (có làm thêm ngày)":"");
        }
    }

    public void tinhLuong() {
        if (loaiChucVu == Configs.NHAN_VIEN_LINH) {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        } else if (loaiChucVu == Configs.NHAN_VIEN_SEP) {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        }
    }
}