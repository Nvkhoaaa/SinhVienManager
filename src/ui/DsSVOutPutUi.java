package ui;

import java.io.PrintWriter;
import java.util.ArrayList;

import entity.SinhVien;
import entity.SinhVienKT;
import entity.SinhVienKTPM;

public class DsSVOutPutUi {
	private PrintWriter screenOut;

    public DsSVOutPutUi() {
        screenOut = new PrintWriter(System.out, true);
    }

    public void inDSSV(ArrayList<SinhVien> dsSV) {
        if (dsSV == null || dsSV.isEmpty()) {
            return;
        }

        for (SinhVien sv : dsSV) {
            if (sv == null) {
                continue;
            }
            screenOut.println("Ten Sinh Vien: " + sv.getTenSV());
            screenOut.println("Nganh: " + sv.getNganh());
            screenOut.println("Dia Chi: " + sv.getDiaChi());
            screenOut.println("Ngay Sinh: " + sv.getNgaySinh());
            screenOut.println("Hoc Luc: " + sv.hocLuc());
            screenOut.println("Diem Trung Binh: " + sv.diemTB());

            if (sv instanceof SinhVienKT) {
                SinhVienKT svKT = (SinhVienKT) sv;
                screenOut.println("Diem Marketing: " + svKT.getDiemMarketing());
                screenOut.println("Diem Sales: " + svKT.getDiemSales());
            } else if (sv instanceof SinhVienKTPM) {
                SinhVienKTPM svKTPM = (SinhVienKTPM) sv;
                screenOut.println("Diem Java: " + svKTPM.getDiemJava());
                screenOut.println("Diem CSS: " + svKTPM.getDiemCSS());
                screenOut.println("Diem HTML: " + svKTPM.getDiemHTML());
            }

            screenOut.println("------------------------------------");
        }
    }
}
