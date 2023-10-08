package DTO;

import java.sql.Date;
import java.util.ArrayList;

public class Nhom {

	private String maNhom;
	private String tenNhom;
	private int soThanhVien;
	private Date ngayTaoNhom;
	private String mon;
	private ArrayList<GiaoVien> GV;
	public String getMaNhom() {
		return maNhom;
	}
	public void setMaNhom(String maNhom) {
		this.maNhom = maNhom;
	}
	public String getTenNhom() {
		return tenNhom;
	}
	public void setTenNhom(String tenNhom) {
		this.tenNhom = tenNhom;
	}
	public int getSoThanhVien() {
		return soThanhVien;
	}
	public void setSoThanhVien(int soThanhVien) {
		this.soThanhVien = soThanhVien;
	}
	public Date getNgayTaoNhom() {
		return ngayTaoNhom;
	}
	public void setNgayTaoNhom(Date ngayTaoNhom) {
		this.ngayTaoNhom = ngayTaoNhom;
	}
	public String getMon() {
		return mon;
	}
	public void setMon(String mon) {
		this.mon = mon;
	}
	public ArrayList<GiaoVien> getGV() {
		return GV;
	}
	public void setGV(ArrayList<GiaoVien> gV) {
		GV = gV;
	}
	
	
}
