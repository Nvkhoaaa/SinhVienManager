package controller;

import java.time.LocalDate;

import database.SuaSVDAO;
import ui.SuaSVOutputUi;


public class SuaSVController {
 private SuaSVDAO suaSVDAO;
 private SuaSVOutputUi suaSVOutputUi;

 public SuaSVController() {
     suaSVDAO = new SuaSVDAO();
     suaSVOutputUi = new SuaSVOutputUi();
 }

 public void suaSV(String tenSV, String nganh, String diaChi, LocalDate ngaySinh, double diemJava, double diemCSS, double diemHTML) {
	 suaSVDAO.suaSV(tenSV, nganh, diaChi, ngaySinh, diemJava, diemCSS, diemHTML);
	 suaSVOutputUi.showResult();
 }

 public void suaSV(String tenSV, String nganh, String diaChi, LocalDate ngaySinh, double diemMarketing, double diemSales) {
	 suaSVDAO.suaSV(tenSV, nganh, diaChi, ngaySinh, diemMarketing, diemSales);
	 suaSVOutputUi.showResult();
 }
}
