package ui;

import java.io.PrintWriter;
import java.util.Scanner;

import controller.TimSVController;

public class TimSVInputUi {
	private TimSVController timSVController = null;
	private Scanner keyBoard = null;
	private PrintWriter screenPrompt = null;
	private String tenSVPrompt;
	
	public TimSVInputUi() {
		timSVController = new TimSVController();
		keyBoard = new Scanner(System.in);
		screenPrompt = new PrintWriter(System.out,true);
		tenSVPrompt = "HỌ VÀ TÊN SINH VIÊN: ";
	}
	
	public void nhapThongTinTim() {
		screenPrompt.print(tenSVPrompt); screenPrompt.flush();
		String tenSV = keyBoard.nextLine();
		timSVController.timSV(tenSV);
	}
	
	public void setTimSVController(TimSVController timSVController) {
        this.timSVController = timSVController;
    }
	
}
