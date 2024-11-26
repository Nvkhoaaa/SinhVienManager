package ui;

import java.io.PrintWriter;

public class ThemSVOutputUi {
	private PrintWriter screenPrompt = null;
	
	public ThemSVOutputUi() {
		this.screenPrompt = new PrintWriter(System.out, true);
	}
	
	public void showResult() {
		screenPrompt.println("Đã Thêm Thành Công Sinh Viên!!!");
	}
}
