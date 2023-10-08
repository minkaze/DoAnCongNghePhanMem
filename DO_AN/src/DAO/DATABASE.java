package DAO;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DATABASE {

	private String url = "jdbc:sqlserver://localhost:1433;databaseName=QLTTN;encrypt=true;trustServerCertificate=true";
	private String username = "sa";
	private String password = "minh";
	private Connection connection;
	
	public void getConnect() {
		try {
            // Kết nối SQL Server
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Kết nối thành công!");
            if (connection != null) {
	            DatabaseMetaData dm = (DatabaseMetaData) connection.getMetaData();
	            System.out.println("Tên Driver: " + dm.getDriverName());
	            System.out.println("Phiên bản Driver: " + dm.getDriverVersion());
	            System.out.println("Tên Cơ sở dữ liệu: " + dm.getDatabaseProductName());
	            System.out.println("Phiên bản Cơ sở dữ liệu: " + dm.getDatabaseProductVersion());
	        }        
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	public void closeConnect() {
		try {
			connection.close();
			System.out.println("Đã đóng kết nối!");
        } catch (SQLException e) {
        	e.printStackTrace();
        }
	}
	
	public static void main(String[] args) {
		DATABASE d = new DATABASE();
		d.getConnect();
		d.closeConnect();
	}
	
}
