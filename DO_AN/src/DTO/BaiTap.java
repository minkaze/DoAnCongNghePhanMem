package DTO;

import java.sql.Date;

public class BaiTap {
	private String tenBT;
	private Date thoiGian;
	private String iconName;
	
	public String getTenBT() {
		return tenBT;
	}
	public void setTenNhom(String tenBT) {
		this.tenBT = tenBT;
	}
	public Date getThoiGian() {
		return thoiGian;
	}
	public void setThoiGian(Date thoiGian) {
		this.thoiGian = thoiGian;
	}
	public String getIconName() {
		return iconName;
	}
	public void setIconName(String iconName) {
		this.iconName = iconName;
	}
}
