package entity;

import java.time.LocalDate;

public class SinhVienKT extends SinhVien{
	private double diemMarketing;
	private double diemSales;
	
	public SinhVienKT(String tenSV, String nganh, String diaChi, LocalDate ngaySinh, double diemMarketing, double diemSales) {
		super(tenSV, "Kinh Tế", diaChi, ngaySinh);
		this.diemMarketing = diemMarketing;
		this.diemSales = diemSales;
	}

	public double getDiemMarketing() {
		return diemMarketing;
	}

	public void setDiemMarketing(double diemMarketing) {
		this.diemMarketing = diemMarketing;
	}

	public double getDiemSales() {
		return diemSales;
	}

	public void setDiemSales(double diemSales) {
		this.diemSales = diemSales;
	}
	
	@Override
	public double diemTB() {
		return ((2 * diemMarketing) + diemSales) / 3;
	}

}
