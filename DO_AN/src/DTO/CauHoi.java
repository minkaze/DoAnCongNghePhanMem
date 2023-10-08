package DTO;

import java.util.ArrayList;

public class CauHoi {

	private String maCauHoi;
	private String noiDungCauhoi;
	private String doKho;
	private ArrayList<DapAn> dsDapAn;
	public String getMaCauHoi() {
		return maCauHoi;
	}
	public void setMaCauHoi(String maCauHoi) {
		this.maCauHoi = maCauHoi;
	}
	public String getNoiDungCauhoi() {
		return noiDungCauhoi;
	}
	public void setNoiDungCauhoi(String noiDungCauhoi) {
		this.noiDungCauhoi = noiDungCauhoi;
	}
	public String getDoKho() {
		return doKho;
	}
	public void setDoKho(String doKho) {
		this.doKho = doKho;
	}
	public ArrayList<DapAn> getDsDapAn() {
		return dsDapAn;
	}
	public void setDsDapAn(ArrayList<DapAn> dsDapAn) {
		this.dsDapAn = dsDapAn;
	}
	
	
}
