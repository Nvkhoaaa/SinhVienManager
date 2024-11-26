package controller;

import java.time.LocalDate;

import database.ThemSVDAO;
import entity.SinhVien;
import entity.SinhVienKT;
import entity.SinhVienKTPM;
import ui.ThemSVOutputUi;

public class ThemSVController {
	private ThemSVDAO themSVDAO = null;
	private ThemSVOutputUi themSVOutputUi = null;
	
	public ThemSVController() {
		themSVDAO = new ThemSVDAO();
		themSVOutputUi = new ThemSVOutputUi();
	}
	
	public void themSV(String tenSV, String nganh, String diaChi, LocalDate ngaySinh, double diemJava, double diemCSS, double diemHTML) {
		SinhVienKTPM sinhVienKTPM = new SinhVienKTPM(tenSV, nganh, diaChi, ngaySinh, diemJava, diemCSS, diemHTML);
		themSV(sinhVienKTPM);
	}
	
	public void themSV(String tenSV, String nganh, String diaChi, LocalDate ngaySinh, double diemMarketing, double diemSales) {
		SinhVienKT sinhVienKT = new SinhVienKT(tenSV, nganh, diaChi, ngaySinh, diemMarketing, diemSales);
		themSV(sinhVienKT);
	}
	
	private void themSV(SinhVien sinhVien){
        themSVDAO.themSV(sinhVien);
        themSVOutputUi.showResult();
    }

}
