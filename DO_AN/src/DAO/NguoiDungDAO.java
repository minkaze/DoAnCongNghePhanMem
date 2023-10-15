package DAO;

import java.sql.*;
import java.util.Vector;

import DTO.NguoiDung;

public class NguoiDungDAO {
    private Connection con;

    public boolean openConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=qltn;encrypt=false";
            String username = "sa";
            String password= "123456";
            con = DriverManager.getConnection(dbUrl, username, password);
            return true;
        }
        catch (Exception ex) {
            System.out.println(ex);
            return false;
            }
        }

    public void closeConnection() {
        try {
            if (con!=null)
            con.close();
        }
        catch (SQLException ex) {
            System.out.println(ex); }
    }

    public Vector<NguoiDung> getAllUser(){
        Vector<NguoiDung> arr = new Vector<NguoiDung>();
        if (openConnection()) {
            try {
                String sql = "Select * from NGUOIDUNG where Active = 1 ORDER BY IdUsser ASC";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                while(rs.next()){
                    NguoiDung nd = new NguoiDung();
                    nd.setMaUser(rs.getString("IdUsser"));
                    nd.setHoTen(rs.getString("HoTen"));
                    nd.setEmail(rs.getString("Gmail"));
                    nd.setNgayTao(rs.getDate("NgayTao"));
                    nd.setMaGV(rs.getString("MaGiaoVien"));
                    nd.setMaHS(rs.getString("MaHocSinh"));
                    nd.setUserName(rs.getString("TaiKhoan"));
                    nd.setMatKhau(rs.getString("MatKhau"));
                    nd.setQuyen(rs.getString("Quyen"));
                    arr.add(nd);
                    
                }
            }
            catch (SQLException ex) {
                System.out.println(ex);
            }
            finally {
                closeConnection();
            }
        }
        return arr;
    }

}
