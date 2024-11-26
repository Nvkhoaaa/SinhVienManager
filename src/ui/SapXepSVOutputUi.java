package ui;

import java.io.PrintWriter;
import java.util.ArrayList;

import database.SinhVienDatabase;
import entity.SinhVien;

public class SapXepSVOutputUi {
    private PrintWriter screenPrompt = null;

    public SapXepSVOutputUi() {
        this.screenPrompt = new PrintWriter(System.out, true);
    }

    public void displaySortedStudents() {
        SinhVienDatabase.sortListByDiem();
        
        ArrayList<SinhVien> sortedList = SinhVienDatabase.queryAllSV();

        screenPrompt.println("Danh sách sinh viên sau khi sắp xếp theo điểm trung bình (giảm dần):");
        int index = 1;
        for (SinhVien sv : sortedList) {
            screenPrompt.println(index + ". " + sv.getTenSV());
            index++;
        }
    }
}
