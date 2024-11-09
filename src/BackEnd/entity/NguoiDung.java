package BackEnd.model;

import java.sql.Date;

public class NguoiDung {
    private int idNguoiDung;
    private int idChucVu;
    private int idVaiTro;
    private String tenNguoiDung;
    private Date ngaySinh;
    private String soDienThoai;
    private String email;
    private String queQuan;
    private boolean trangThai;

    // Constructor không tham số
    public NguoiDung() {
    }

    // Constructor với tham số
    public NguoiDung(int idNguoiDung, int idChucVu, int idVaiTro, String tenNguoiDung, Date ngaySinh,
                     String soDienThoai, String email, String queQuan, boolean trangThai) {
        this.idNguoiDung = idNguoiDung;
        this.idChucVu = idChucVu;
        this.idVaiTro = idVaiTro;
        this.tenNguoiDung = tenNguoiDung;
        this.ngaySinh = ngaySinh;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.queQuan = queQuan;
        this.trangThai = trangThai;
    }

    // Getter và Setter cho từng thuộc tính
    public int getIdNguoiDung() {
        return idNguoiDung;
    }

    public void setIdNguoiDung(int idNguoiDung) {
        this.idNguoiDung = idNguoiDung;
    }

    public int getIdChucVu() {
        return idChucVu;
    }

    public void setIdChucVu(int idChucVu) {
        this.idChucVu = idChucVu;
    }

    public int getIdVaiTro() {
        return idVaiTro;
    }

    public void setIdVaiTro(int idVaiTro) {
        this.idVaiTro = idVaiTro;
    }

    public String getTenNguoiDung() {
        return tenNguoiDung;
    }

    public void setTenNguoiDung(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    // Phương thức toString để hiển thị thông tin người dùng
    @Override
    public String toString() {
        return "NguoiDung{" +
                "idNguoiDung=" + idNguoiDung +
                ", idChucVu=" + idChucVu +
                ", idVaiTro=" + idVaiTro +
                ", tenNguoiDung='" + tenNguoiDung + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", email='" + email + '\'' +
                ", queQuan='" + queQuan + '\'' +
                ", trangThai=" + trangThai +
                '}';
    }
}
