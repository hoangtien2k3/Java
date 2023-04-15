package src.backend.JDBC_API.src.model;

import java.sql.Date;

public class KhachHang {
    private int id;
    private String hoVaTen;
    private Date ngaySinh;

    public KhachHang() {
    }

    public KhachHang(int id, String hoVaTen, Date ngaySinh) {
        this.id = id;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getId() {
        return id;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }
}
