/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private int Id;
    private String MaSinhVien;
    private String HoVaTen;
    private String NgaySinh;
    private String DiaChi;
    private String GioiTinh;

    public SinhVien(int Id, String MaSinhVien, String HoVaTen, String NgaySinh, String DiaChi, String GioiTinh) {
        this.Id = Id;
        this.MaSinhVien = MaSinhVien;
        this.HoVaTen = HoVaTen;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
    }

    public SinhVien(String MaSinhVien, String HoVaTen, String NgaySinh, String DiaChi, String GioiTinh) {
        this.MaSinhVien = MaSinhVien;
        this.HoVaTen = HoVaTen;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public String getHoVaTen() {
        return HoVaTen;
    }

    public void setHoVaTen(String HoVaTen) {
        this.HoVaTen = HoVaTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    

    
}
