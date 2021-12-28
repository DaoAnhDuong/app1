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
public class Sinhvien {
    private int STt;
    private String MaSinhVien;
    private String HoVaTen;
    private String NgaySinh;
    private String DiaChi;
    private String GioiTinh;

    public Sinhvien(int STt, String MaSinhVien, String HoVaTen, String NgaySinh, String DiaChi, String GioiTinh) {
        this.STt = STt;
        this.MaSinhVien = MaSinhVien;
        this.HoVaTen = HoVaTen;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
    }

   

    
    public Sinhvien(String MaSinhVien, String HoVaTen, String NgaySinh, String DiaChi, String GioiTinh) {
        this.MaSinhVien = MaSinhVien;
        this.HoVaTen = HoVaTen;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
    }

    public int getSTt() {
        return STt;
    }

    public void setSTt(int STt) {
        this.STt = STt;
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

    @Override
    public String toString() {
        return MaSinhVien+","+HoVaTen+","+NgaySinh+","+DiaChi+","+GioiTinh+"\n";
        
    }

    public String getFileLine() {
        return MaSinhVien+","+HoVaTen+","+NgaySinh+","+DiaChi+","+GioiTinh+"\n";
    }

   
    

    
}
