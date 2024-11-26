package ui;

import java.io.PrintWriter;
import java.util.Scanner;

import controller.InDSSVController;
import controller.SapXepSVController;

public class SinhVienMenuConsoleUi {
	private SapXepSVController sapXepSVController = null;
	private TimSVInputUi timSVInputUi = null;
	private SuaSVInputUi suaSVInputUi = null;
	private InDSSVController inDSSVController = null;
	private ThemSVInputUi inputUi = null;
	private Scanner keyBoard = null;
	private PrintWriter screenPrompt = null;
	private String prompt = null;
	private XoaSVInputUi xoaSVInputUi = null;
	
	public SinhVienMenuConsoleUi() {
		sapXepSVController = new SapXepSVController();
		timSVInputUi = new TimSVInputUi();
		suaSVInputUi = new SuaSVInputUi();
		inDSSVController = new InDSSVController();
		inputUi = new ThemSVInputUi();
		xoaSVInputUi = new XoaSVInputUi();
		keyBoard = new Scanner(System.in);
		this.screenPrompt = new PrintWriter(System.out, true);
		prompt = "Vui Lòng Nhập ->";
	}
	
	
	public void controlLoop() {
		String command = " ";
		screenPrompt.println("Hãy Nhập \"help\" để bắt đầu chương trình ");
		while(true) {
			screenPrompt.print(prompt);
			screenPrompt.flush();
			command = keyBoard.nextLine();
			command.trim();
			if(command.equalsIgnoreCase("help")) {
				help();
				continue;
			}
			
			if(command.equalsIgnoreCase("about")) {
				about();
				continue;
			}

			if(command.equalsIgnoreCase("add")) {
				themSV();
				continue;
			}

			if(command.equalsIgnoreCase("remove")) {
				xoaSV();
				continue;
			}
			
			if(command.equalsIgnoreCase("update")) {
				suaSV();
				continue;
			}
			
			if(command.equalsIgnoreCase("print")) {
				inSV();
				continue;
			}
			
			if(command.equalsIgnoreCase("find")) {
				timSV();
				continue;
			}
			
			if(command.equalsIgnoreCase("sx")) {
				sapXepSV();
				continue;
			}
			
			if(command.equalsIgnoreCase("quit")) {
				break;
			}
		}
	}
	
	private void help() {
		screenPrompt.println("~~~~~~~~Sinh Viên Management Menu~~~~~~~~");
        screenPrompt.println("[START] Bắt đầu chương trình.");
        screenPrompt.println("[ABOUT] Thông tin về phần mềm.");
        screenPrompt.println("[ADD] Thêm mới Sinh Viên.");
        screenPrompt.println("[REMOVE] Xoá một Sinh Viên.");
        screenPrompt.println("[UPDATE] Chỉnh sửa Sinh Viên.");
        screenPrompt.println("[FIND] Tìm Kiếm Sinh Viên.");
        screenPrompt.println("[PRINT] In Danh Sách Sinh Viên.");
        screenPrompt.println("[SX] Sắp xếp Sinh Viên theo điểm.");
        screenPrompt.println("[QUIT] Đóng phần mềm.");
        screenPrompt.println("~~~~~~~~Hoa Don Management Menu~~~~~~~~");
	}
	
	private void about() {
		screenPrompt.println("Đây là chương trình về quản lý Sinh Viên");
	}

	private void themSV(){
		inputUi.nhapThongTinSV();
	}
	
	private void xoaSV() {
		xoaSVInputUi.nhapThongTinXoa();
	}
	
	private void inSV() {
		inDSSVController.getDSSV();
	}
	
	private void suaSV() {
		suaSVInputUi.nhapThongTinSV();
	}
	
	private void timSV() {
		timSVInputUi.nhapThongTinTim();
	}
	
	private void sapXepSV() {
		sapXepSVController.sapXep();
	}

}
