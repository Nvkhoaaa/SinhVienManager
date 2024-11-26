package database;

import java.time.LocalDate;

public class SuaSVDAO {

	public void suaSV(String tenSV, String nganh, String diaChi, LocalDate ngaySinh, double diemJava, double diemCSS, double diemHTML) {
		SinhVienDatabase.suaSinhVienKTPM(tenSV, nganh, diaChi, ngaySinh, diemJava, diemCSS, diemHTML);
	}
	
	public void suaSV(String tenSV, String nganh, String diaChi, LocalDate ngaySinh, double diemMarketing, double diemSales) {
		SinhVienDatabase.suaSinhVienKT(tenSV, nganh, diaChi, ngaySinh, diemMarketing, diemSales);
	}
}
