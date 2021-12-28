/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modify;

import Class.Lophoc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class LophocModify {
    public static List<Lophoc> findAll() {
        //lay tat ca danh sach lop hoc
        List<Lophoc> lophocList = new ArrayList<>();
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=app";
        String user = "sa";
        String pass = "123456789";
        Connection con = null;
        Statement statement = null;  // lấy dữ liệu từ database
        try {
            con = DriverManager.getConnection(url, user, pass);
            //query: tạo truy vấn
            String sql = "select * from QLlophoc";
            statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sql); //hien thi bản ghi
            while (resultSet.next()) { // next(): cho phép chuyển qua từng bản ghi tren dữ liệu đầu ra và đọc 
                Lophoc lh = new Lophoc(resultSet.getString("MaLopHoc"), resultSet.getString("TenLopHoc"), resultSet.getString("Khoa"), resultSet.getString("SiSo"));
                lophocList.add(lh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LophocModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LophocModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LophocModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc
        return lophocList;
    }

    public static void insert(Lophoc lh) {
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=app";
        String user = "sa";
        String pass = "123456789";
        Connection con = null;
        PreparedStatement statement = null;  // lấy dữ liệu từ database
        try {
            con = DriverManager.getConnection(url, user, pass);
            //query: tạo truy vấn
            String sql = "insert into QLlophoc(MaLopHoc,TenLopHoc,Khoa,SiSo) values(?,?,?,?)";
            statement = con.prepareCall(sql);
            statement.setString(1, lh.getMaLopHoc());
            statement.setString(2, lh.getTenLopHoc());
            statement.setString(3, lh.getKhoa());
            statement.setString(4, lh.getSiSo());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(LophocModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LophocModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LophocModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc
    }
    public static void update(Lophoc lh) {
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=app";
        String user = "sa";
        String pass = "123456789";
        Connection con = null;
        PreparedStatement statement = null;  // lấy dữ liệu từ database
        try {
            con = DriverManager.getConnection(url, user, pass);
            //query: tạo truy vấn
            String sql = "update QLlophoc set TenLopHoc=?,Khoa=?,SiSo=? where MaLopHoc = ?";
            statement = con.prepareCall(sql);
        
            statement.setString(1, lh.getTenLopHoc());
            statement.setString(2, lh.getKhoa());
            statement.setString(3, lh.getSiSo());
            statement.setString(4, lh.getMaLopHoc());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(LophocModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LophocModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LophocModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc
    }
    public static void delete(String MaLopHoc) {
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=app";
        String user = "sa";
        String pass = "123456789";
        Connection con = null;
        PreparedStatement statement = null;  // lấy dữ liệu từ database
        try {
            con = DriverManager.getConnection(url, user, pass);
            //query: tạo truy vấn
            String sql = "delete from QLlophoc where MaLopHoc = ?";
            statement = con.prepareCall(sql);
            statement.setString(1,MaLopHoc);
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(LophocModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LophocModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LophocModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc
    }
    public static List<Lophoc> findTenLH(String TenLopHoc) {
        //lay tat ca danh sach mon hoc
        List<Lophoc> lophocList = new ArrayList<>();
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=app";
        String user = "sa";
        String pass = "123456789";
        Connection con = null;
        PreparedStatement statement = null;  // lấy dữ liệu từ database
        try {
            con = DriverManager.getConnection(url, user, pass);
            //query: tạo truy vấn
            String sql = "select * from QLlophoc where TenLopHoc like ?";
            statement = con.prepareCall(sql);
            statement.setString(1,"%" + TenLopHoc + "%");
            ResultSet resultSet = statement.executeQuery(); //hien thi bản ghi
            while (resultSet.next()) { // next(): cho phép chuyển qua từng bản ghi tren dữ liệu đầu ra và đọc 
                Lophoc lh = new Lophoc(resultSet.getString("MaLopHoc"), resultSet.getString("TenLopHoc"), resultSet.getString("Khoa"), resultSet.getString("SiSo"));
                lophocList.add(lh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LophocModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LophocModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LophocModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc
        return lophocList;
    }
}
