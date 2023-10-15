package DAO;

import DTO.TKDiemDTO;

import java.sql.*;
import java.util.Vector;

public class SinhVienDAO {

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

    public Vector<TKDiemDTO> tkDiem(String id){
        Vector<TKDiemDTO> arr = new Vector<TKDiemDTO>();
        if (openConnection()) {
            try {
                String sql = "SELECT AVG(D.DiemSo) as 'DTB', CD.TenChuyenDe, SUM(D.SoCauDung) as 'QuesR', SUM(D.SoCauSai) as 'QuesW', SUM(D.SoCauBo) as 'QuesP', COUNT(D.MaDeThi) as 'SoBai' FROM DIEM D JOIN NGUOIDUNG ND ON D.MaNguoiDung = ND.IdUsser JOIN DETHI DT ON D.MaDeThi = DT.IdDeThi JOIN CHUYENDE CD ON DT.ChuyenDe = CD.IdChuyenDe WHERE ND.IdUsser = ? and DT.Active = 1 and ND.Active = 1  GROUP BY CD.IdChuyenDe, CD.TenChuyenDe";
                PreparedStatement pr = con.prepareStatement(sql);
                pr.setString(1, id);
                ResultSet rs = pr.executeQuery();
                while(rs.next()){
                    TKDiemDTO tk = new TKDiemDTO();
                    tk.setDtb(rs.getFloat("DTB"));
                    tk.setChuyenDe(rs.getString("TenChuyenDe"));
                    tk.setQuesR(rs.getInt("QuesR"));
                    tk.setQuesW(rs.getInt("QuesW"));
                    tk.setQuesP(rs.getInt("QuesP"));
                    tk.setSoBai(rs.getInt("SoBai"));
                    arr.add(tk);
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
