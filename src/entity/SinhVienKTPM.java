package entity;

import java.time.LocalDate;

public class SinhVienKTPM extends SinhVien {
	private double diemJava;
	private double diemCSS;
	private double diemHTML;
	
	public SinhVienKTPM(String tenSV, String nganh, String diaChi, LocalDate ngaySinh, double diemJava, double diemCSS, double diemHTML) {
		super(tenSV, "Kỹ Thuật Phần Mềm", diaChi, ngaySinh);
		this.diemJava = diemJava;
		this.diemCSS = diemCSS;
		this.diemHTML = diemHTML;
	}

	public double getDiemJava() {
		return diemJava;
	}

	public void setDiemJava(double diemJava) {
		this.diemJava = diemJava;
	}

	public double getDiemCSS() {
		return diemCSS;
	}

	public void setDiemCSS(double diemCSS) {
		this.diemCSS = diemCSS;
	}

	public double getDiemHTML() {
		return diemHTML;
	}

	public void setDiemHTML(double diemHTML) {
		this.diemHTML = diemHTML;
	}
	
	@Override
	public double diemTB() {
		return ((2 * diemJava) + diemCSS + diemHTML) /4;
	}
	
}
