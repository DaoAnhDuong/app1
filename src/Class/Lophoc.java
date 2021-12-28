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
public class Lophoc {
    private String MaLopHoc;
    private String TenLopHoc;
    private String Khoa;
    private String SiSo;

    public String getMaLopHoc() {
        return MaLopHoc;
    }

    public void setMaLopHoc(String MaLopHoc) {
        this.MaLopHoc = MaLopHoc;
    }

    public String getTenLopHoc() {
        return TenLopHoc;
    }

    public void setTenLopHoc(String TenLopHoc) {
        this.TenLopHoc = TenLopHoc;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    public String getSiSo() {
        return SiSo;
    }

    public void setSiSo(String SiSo) {
        this.SiSo = SiSo;
    }

    public Lophoc(String MaLopHoc, String TenLopHoc, String Khoa, String SiSo) {
        this.MaLopHoc = MaLopHoc;
        this.TenLopHoc = TenLopHoc;
        this.Khoa = Khoa;
        this.SiSo = SiSo;
    }

    public Lophoc() {
    }
}
