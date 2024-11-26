package ui;

import java.io.PrintWriter;

public class SuaSVOutputUi {
    private PrintWriter screenPrompt;

    public SuaSVOutputUi() {
        this.screenPrompt = new PrintWriter(System.out, true);
    }

    public void showResult() {
        screenPrompt.println("Thông tin sinh viên đã được cập nhật thành công!!!");
    }
}