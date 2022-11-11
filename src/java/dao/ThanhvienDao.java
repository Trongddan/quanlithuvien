/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connect.DbConnect;
import entity.Thanhvien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DanDT
 */
public class ThanhvienDao {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    // hàm kiểm tra đăng nhập
    public Thanhvien checkLogin(String tendangnhap, String matkhau) throws SQLException {
        Thanhvien tv = new Thanhvien();
        String query = "SELECT * FROM tbl_thanhvien132 WHERE tendangnhap= ? AND matkhau=?";
        try {
            conn = new DbConnect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,tendangnhap);
            ps.setString(2,matkhau);
            rs = ps.executeQuery();
            while (rs.next()) {
                tv = new Thanhvien(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10)
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (tv!=null) {
            return tv;
        } else {
            return null;
        }
    }
}
