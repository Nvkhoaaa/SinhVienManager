package controller;

import database.SapXepSVDAO;
import ui.SapXepSVOutputUi;

public class SapXepSVController {
	private SapXepSVDAO sapXepSVDAO = null;
	private SapXepSVOutputUi sapXepSVOutputUi = null;
	
	public SapXepSVController() {
		sapXepSVDAO = new SapXepSVDAO();
		sapXepSVOutputUi = new SapXepSVOutputUi();
	}
	
	public void sapXep() {
		sapXepSVDAO.sapXep();
		sapXepSVOutputUi.displaySortedStudents();
	}

}
