package ui;

import java.io.PrintWriter;

public class TimSVOutputUi {
	private PrintWriter screenPrompt;

    public TimSVOutputUi() {
        this.screenPrompt = new PrintWriter(System.out, true);
    }

    public void showResult() {
        screenPrompt.println("Đã tìm thấy Sinh Viên!!!");
    }
}
