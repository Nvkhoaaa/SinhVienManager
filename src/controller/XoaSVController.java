package controller;

import database.XoaSVDAO;
import entity.SinhVien;
import ui.XoaSVOutputUi;

public class XoaSVController {
	private XoaSVOutputUi xoaSVOutputUi = null;
	private XoaSVDAO xoaSVDAO = null;
	
	public XoaSVController() {
		xoaSVDAO = new XoaSVDAO();
		xoaSVOutputUi = new XoaSVOutputUi();
	}
	
	public void xoaSV(String tenSV) {
		SinhVien xoaSV = xoaSVDAO.xoaSV(tenSV);
		if(xoaSV != null) {
			xoaSVOutputUi.showResult();
		} else {
			System.out.println("Không thể xoá Sinh Viên");
		}
	}

}
