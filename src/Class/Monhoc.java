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
public class Monhoc {
    private String maMH;
    private String tenMH;
    private String Chuyennganh;
    private String Hocki;
    private String Tinchi;
    private String Hinhthucthi;

    public Monhoc() {
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public String getChuyennganh() {
        return Chuyennganh;
    }

    public void setChuyennganh(String Chuyennganh) {
        this.Chuyennganh = Chuyennganh;
    }

    public String getHocki() {
        return Hocki;
    }

    public void setHocki(String Hocki) {
        this.Hocki = Hocki;
    }

    public String getTinchi() {
        return Tinchi;
    }

    public void setTinchi(String Tinchi) {
        this.Tinchi = Tinchi;
    }

    public String getHinhthucthi() {
        return Hinhthucthi;
    }

    public void setHinhthucthi(String Hinhthucthi) {
        this.Hinhthucthi = Hinhthucthi;
    }

    public Monhoc(String maMH, String tenMH, String Chuyennganh, String Hocki, String Tinchi, String Hinhthucthi) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.Chuyennganh = Chuyennganh;
        this.Hocki = Hocki;
        this.Tinchi = Tinchi;
        this.Hinhthucthi = Hinhthucthi;
    }
}
