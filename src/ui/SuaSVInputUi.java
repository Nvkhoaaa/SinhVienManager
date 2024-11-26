package ui;

import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import controller.SuaSVController;

public class SuaSVInputUi {
	private SuaSVController suaSVController = null;
	private Scanner keyBoard = null;
	private PrintWriter screenPrompt = null;
	private String tenSVPrompt,loaiNganh,diaChiPrompt,ngaySinhPrompt,diemJavaPrompt,diemCSSPrompt,diemHTMLPrompt,diemMarketingPrompt,diemSalesPrompt;
	
	public SuaSVInputUi() {
		suaSVController = new SuaSVController();
		keyBoard = new Scanner(System.in);
		screenPrompt = new PrintWriter(System.out,true);
		tenSVPrompt = "HỌ VÀ TÊN SINH VIÊN: ";
		loaiNganh = "CHỌN NGÀNH [\"KTPM(KỸ THUẬT PHẦN MỀM)\" / \"KT(KINH TẾ)\"]: ";
		diaChiPrompt = "ĐỊA CHỈ: ";
		ngaySinhPrompt = "NGÀY SINH: ";
		diemJavaPrompt = "ĐIỂM JAVA: ";
		diemCSSPrompt = "ĐIỂM CSS: ";
		diemHTMLPrompt = "ĐIỂM HTML: ";
		diemMarketingPrompt = "ĐIỂM MARKETING: ";
		diemSalesPrompt = "ĐIỂM SALES: ";
	}
	public void nhapThongTinSV() {
		screenPrompt.print(tenSVPrompt); screenPrompt.flush();
		String tenSV = keyBoard.nextLine();
		screenPrompt.print(diaChiPrompt); screenPrompt.flush();
		String diaChi = keyBoard.nextLine();
		screenPrompt.print(ngaySinhPrompt); screenPrompt.flush();
		String ngaySinhStr = keyBoard.nextLine();
		LocalDate ngaySinh = LocalDate.parse(ngaySinhStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		screenPrompt.print(loaiNganh); screenPrompt.flush();
		String nganh = keyBoard.nextLine();
		
		if ("KTPM".equalsIgnoreCase(nganh)) {
			screenPrompt.print(diemJavaPrompt); screenPrompt.flush();
			double diemJava = keyBoard.nextDouble();
			keyBoard.nextLine();  
			
			screenPrompt.print(diemCSSPrompt); screenPrompt.flush();
			double diemCSS = keyBoard.nextDouble();
			keyBoard.nextLine();  
			
			screenPrompt.print(diemHTMLPrompt); screenPrompt.flush();
			double diemHTML = keyBoard.nextDouble();
			keyBoard.nextLine();  
			
			suaSVController.suaSV(tenSV, nganh, diaChi, ngaySinh, diemJava, diemCSS, diemHTML);
			
		} else if ("KT".equalsIgnoreCase(nganh)) {
			screenPrompt.print(diemMarketingPrompt); screenPrompt.flush();
			double diemMarketing = keyBoard.nextDouble();
			keyBoard.nextLine();  
			
			screenPrompt.print(diemSalesPrompt); screenPrompt.flush();
			double diemSales = keyBoard.nextDouble();
			keyBoard.nextLine(); 
			
			suaSVController.suaSV(tenSV, nganh, diaChi, ngaySinh, diemMarketing, diemSales);
		}
	}

	
	public void setSuaSVController(SuaSVController suaSVController) {
        this.suaSVController = suaSVController;
    }	
}
