package database;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import entity.SinhVien;
import entity.SinhVienKT;
import entity.SinhVienKTPM;

public class SinhVienDatabase {
    private static ArrayList<SinhVien> listSV = new ArrayList<>();
    private static int countSV = 0;

    public static void initDatabase() {
        themSV(new SinhVienKTPM("Nguyễn Vũ Khoa", "KTPM", "4A/4/44 Nguyễn Văn Thương, Phường 25, Bình Thạnh, TPHCM", LocalDate.of(2004, 04, 05), 9.5, 10.0, 10.0));
        themSV(new SinhVienKT("Trần Như Ái Trinh", "KT", "168/12 Nguyễn Gia Trí, Phường 25, Bình Thạnh, TPHCM", LocalDate.of(2004, 06, 28), 10.0, 10.0));
    }

    public static void themSV(SinhVien sv) {
        listSV.add(sv);
        countSV++;
    }

    public static ArrayList<SinhVien> queryAllSV() {
        return listSV;
    }

    public static int getCountSV() {
        return countSV;
    }

    public static SinhVien xoaSV(String tenSV) {
        for (SinhVien sinhVien : listSV) {
            if (sinhVien.getTenSV().equalsIgnoreCase(tenSV)) {
                listSV.remove(sinhVien);
                countSV--;  
                return sinhVien;  
            }
        }
        return null; 
    }
    
    public static void suaSinhVienKTPM(String tenSV, String loaiNganh, String diaChi, LocalDate ngaySinh, double diemJava, double diemCSS, double diemHTML) {
        boolean found = false;
        if (listSV != null) {
            for (SinhVien sinhVien : listSV) {
                if (sinhVien.getTenSV().equalsIgnoreCase(tenSV)) {
                    if (!sinhVien.getNganh().equalsIgnoreCase(loaiNganh)) {
                        chuyenNganhSinhVien(tenSV, loaiNganh, diaChi, ngaySinh, diemJava, diemCSS);
                        return;
                    }

                    if (sinhVien instanceof SinhVienKTPM) {
                        SinhVienKTPM ktpmStudent = (SinhVienKTPM) sinhVien;
                        sinhVien.setDiaChi(diaChi);
                        sinhVien.setNgaySinh(ngaySinh);
                        ktpmStudent.setDiemJava(diemJava);
                        ktpmStudent.setDiemCSS(diemCSS);
                        ktpmStudent.setDiemHTML(diemHTML);

                        found = true;
                        break;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("Sinh viên KTPM không tồn tại trong danh sách.");
        }
    }

    public static void suaSinhVienKT(String tenSV, String loaiNganh, String diaChi, LocalDate ngaySinh, double diemMarketing, double diemSales) {
        boolean found = false;
        if (listSV != null) {
            for (SinhVien sinhVien : listSV) {
                if (sinhVien.getTenSV().equalsIgnoreCase(tenSV)) {
                    if (!sinhVien.getNganh().equalsIgnoreCase(loaiNganh)) {
                        chuyenNganhSinhVien(tenSV, loaiNganh, diaChi, ngaySinh, diemMarketing, diemSales);
                        return;
                    }

                    if (sinhVien instanceof SinhVienKT) {
                        SinhVienKT kinhTeStudent = (SinhVienKT) sinhVien;
                        sinhVien.setDiaChi(diaChi);
                        sinhVien.setNgaySinh(ngaySinh);
                        kinhTeStudent.setDiemMarketing(diemMarketing);
                        kinhTeStudent.setDiemSales(diemSales);

                        found = true;
                        break;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("Sinh viên KT không tồn tại trong danh sách.");
        }
    }

    public static void chuyenNganhSinhVien(String tenSV, String loaiNganhMoi, String diaChi, LocalDate ngaySinh, double diem1, double diem2) {
        boolean found = false;
        SinhVien sinhVienMoi = null;

        if (listSV != null) {
            for (SinhVien sinhVien : listSV) {
                if (sinhVien.getTenSV().equalsIgnoreCase(tenSV)) {
                    listSV.remove(sinhVien);

                    if (loaiNganhMoi.equalsIgnoreCase("KT")) {
                        sinhVienMoi = new SinhVienKT(tenSV, loaiNganhMoi, diaChi, ngaySinh, diem1, diem2);
                    } else if (loaiNganhMoi.equalsIgnoreCase("KTPM")) {
                        sinhVienMoi = new SinhVienKTPM(tenSV, loaiNganhMoi, diaChi, ngaySinh, diem1, diem2, 0.0); 
                    }

                    if (sinhVienMoi != null) {
                        listSV.add(sinhVienMoi);
                    }

                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Sinh viên không tồn tại trong danh sách.");
        }
    }
    
    public static SinhVien timSVTheoTen(String tenSV) {
        for (SinhVien sinhVien : listSV) {
            if (sinhVien.getTenSV().equalsIgnoreCase(tenSV)) {
                return sinhVien;
            }
        }
        System.out.println("Sinh viên không tồn tại trong danh sách.");
        return null;
    }
    
    public static Comparator<SinhVien> sapXepTheoDiem = new Comparator<SinhVien>() {
        @Override
        public int compare(SinhVien sv1, SinhVien sv2) {
            return Double.compare(sv2.diemTB(), sv1.diemTB());  
        }
    };
    
    public static void sortListByDiem() {
        Collections.sort(listSV, sapXepTheoDiem);
    }
    
 
}
