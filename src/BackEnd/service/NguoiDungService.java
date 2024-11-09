/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.service;

import BackEnd.connect.DBSqlConnection;
import BackEnd.model.NguoiDung;
import java.util.ArrayList;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.locks.StampedLock;
import java.sql.Statement;
import java.text.SimpleDateFormat;

/**
 *
 * @author Khang
 */
public class NguoiDungService {
    public ArrayList<NguoiDung> getAllNguoiDung() {
        ArrayList<NguoiDung> list = new ArrayList<>();
        String sql = "SELECT * FROM NguoiDung "
                   + "JOIN VaiTro ON NguoiDung.ID_vaiTro = VaiTro.ID "
                   + "ORDER BY NguoiDung.ngaySinh DESC";

        try (Connection cn = new DBSqlConnection().getConnect();
             PreparedStatement pstm = cn.prepareStatement(sql);
             ResultSet rs = pstm.executeQuery()) {

            while (rs.next()) {
                NguoiDung nd = new NguoiDung();
                nd.setIdNguoiDung(rs.getInt("ID_nguoiDung"));
                nd.setIdChucVu(rs.getInt("ID_chucVu"));
                nd.setIdVaiTro(rs.getInt("ID_vaiTro"));
                nd.setTenNguoiDung(rs.getString("tenNguoiDung"));
                nd.setNgaySinh(rs.getDate("ngaySinh"));
                nd.setSoDienThoai(rs.getString("soDienThoai"));
                nd.setEmail(rs.getString("email"));
                nd.setQueQuan(rs.getString("queQuan"));
                nd.setTrangThai(rs.getBoolean("trangThai"));
                list.add(nd);
            }
        } catch (SQLException e) {
            System.err.println("LỖI TRUY XUẤT DỮ LIỆU: " + e.getMessage());
            e.printStackTrace();
        }
        return list;
    }
}
