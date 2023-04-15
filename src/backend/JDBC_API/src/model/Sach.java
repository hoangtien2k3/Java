package src.backend.JDBC_API.src.model;

public class Sach {
    private String id;
    private String tenSach;
    private String giaBan;
    private int namXuatBan;


    public Sach() {
        super();
    }

    public Sach(String id, String tenSach, String giaBan, int namXuatBan) {
        super();
        this.id = id;
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namXuatBan = namXuatBan;
    }

    public String getId() {
        return id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getGiaBan() {
        return giaBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setGiaBan(String giaBan) {
        this.giaBan = giaBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "id='" + id + '\'' +
                ", tenSach='" + tenSach + '\'' +
                ", giaBan='" + giaBan + '\'' +
                ", namXuatBan=" + namXuatBan +
                '}';
    }
}
