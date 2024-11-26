package ui;

import java.io.PrintWriter;

public class XoaSVOutputUi {
	private PrintWriter screenPrompt = null;
	
	public XoaSVOutputUi() {
		this.screenPrompt = new PrintWriter(System.out, true);
	}
	
	public void showResult() {
		screenPrompt.println("Đã Xoá Thành Công Sinh Viên!!!");
	}
}
