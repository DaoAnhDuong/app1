/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modify;

import Class.SinhVien;
import java.io.IOException;
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
public class SinhvienModify {
    public static List<SinhVien> findAll() {
        List<SinhVien> studentList=new ArrayList<>(); 
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        Connection con = null;
        Statement statement=null;
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=app1", "sa", "123456789");
            String sql = "select * from qlSV1";
            statement=con.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);
            while(resultSet.next()){
                SinhVien std=new SinhVien(
                        resultSet.getString("MaSinhVien"),
                        resultSet.getString("HoVaTen"),
                        resultSet.getString("NgaySinh"),
                        resultSet.getString("DiaChi"),
                        resultSet.getString("GioiTinh"));
                studentList.add(std);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        }
        return studentList;
    }
    public static void insert(SinhVien std) {
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        Connection con = null;
        PreparedStatement statement=null;
        try {
            con = (Connection) DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=app1", "sa", "123456789");
            String sql = "insert into qlSV1(MaSinhVien,HoVaTen,NgaySinh,DiaChi,GioiTinh) values(?,?,?,?,?)";
            statement=con.prepareCall(sql);
            statement.setString(1,std.getMaSinhVien());
             statement.setString(2,std.getHoVaTen());
              statement.setString(3,std.getNgaySinh());
               statement.setString(4,std.getDiaChi());
                statement.setString(5,std.getGioiTinh());
                statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
            public static void update(SinhVien std) {
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        Connection con = null;
        PreparedStatement statement=null;
        try {
            con = (Connection) DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=app1", "sa", "123456789");
            String sql = "update qlSV1 set MaSinhVien=?,HoVaTen=?,NgaySinh=?,DiaChi=?,GioiTinh=? where MaSinhVien=?";
            statement=con.prepareCall(sql);
            statement.setString(1,std.getMaSinhVien());
             statement.setString(2,std.getHoVaTen());
              statement.setString(3,std.getNgaySinh());
               statement.setString(4,std.getDiaChi());
                statement.setString(5,std.getGioiTinh());
              statement.setString(6,std.getMaSinhVien());
                statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }    
     public static void delete(String MaSinhVien) {
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        Connection con = null;
        PreparedStatement statement=null;
        try {
            con = (Connection) DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=app1", "sa", "123456789");
            String sql = "delete from qlSV1 where MaSinhVien=?";
            statement=con.prepareCall(sql);
            
                statement.setString(1,MaSinhVien);
                statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
     }
     
     public static List<SinhVien> findbyMSV(String MaSinhVien) {
        List<SinhVien> studentList=new ArrayList<>(); 
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        Connection con = null;
        PreparedStatement statement=null;
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=app1", "sa", "123456789");
            String sql = "select * from qlSV1 where MaSinhVien=?";
            statement=con.prepareCall(sql);
            statement.setString(1,MaSinhVien);
            
            ResultSet resultSet=statement.executeQuery();
            while(resultSet.next()){
                SinhVien std=new SinhVien(
                        resultSet.getString("MaSinhVien"),
                        resultSet.getString("HoVaTen"),
                        resultSet.getString("NgaySinh"),
                        resultSet.getString("DiaChi"),
                        resultSet.getString("GioiTinh"));
                studentList.add(std);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (con != null) {
                try {
con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SinhvienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        }
        return studentList;
    }
     
}