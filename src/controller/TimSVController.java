package controller;

import java.util.ArrayList;

import database.TimSVDAO;
import entity.SinhVien;
import ui.DsSVOutPutUi;
import ui.TimSVOutputUi;

public class TimSVController {
	private DsSVOutPutUi dsSVOutPutUi = null;
	private TimSVDAO timSVDAO = null;
	private TimSVOutputUi timSVOutputUi = null;
	
	public TimSVController() {
		dsSVOutPutUi = new DsSVOutPutUi();
		timSVDAO = new TimSVDAO();
		timSVOutputUi = new TimSVOutputUi();
	}
	
	public void timSV(String tenSV) {
		ArrayList<SinhVien> listSV = new ArrayList<>();
		SinhVien sinhVien = timSVDAO.timSV(tenSV);
		listSV.add(sinhVien);
		timSVOutputUi.showResult();
		dsSVOutPutUi.inDSSV(listSV);
	}
}
