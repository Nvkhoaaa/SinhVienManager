package ui;

import java.io.PrintWriter;
import java.util.Scanner;

import controller.XoaSVController;

public class XoaSVInputUi {
	private String tenSVPrompt;
	private Scanner keyBoard = null;
	private PrintWriter screenPrompt = null;
	private XoaSVController xoaSVController = null;
	
	public XoaSVInputUi() {
		xoaSVController = new XoaSVController();
		keyBoard = new Scanner(System.in);
		screenPrompt = new PrintWriter(System.out,true);
		tenSVPrompt = "HỌ VÀ TÊN SINH VIÊN: ";
		
	}
	
	public void nhapThongTinXoa() {
		screenPrompt.print(tenSVPrompt);screenPrompt.flush();
		String tenSV = keyBoard.nextLine();
        xoaSVController.xoaSV(tenSV);
	}
	
	public void setXoaHDController(XoaSVController xoaSVController) {
        this.xoaSVController = xoaSVController;
    }
}
