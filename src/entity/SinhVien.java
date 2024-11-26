package entity;

import java.time.LocalDate;

public abstract class SinhVien {
	protected String tenSV;
	protected String nganh;
	protected String diaChi;
	protected LocalDate ngaySinh;
	
	public SinhVien(String tenSV, String nganh, String diaChi, LocalDate ngaySinh) {
		this.tenSV = tenSV;
		this.nganh = nganh;
		this.diaChi = diaChi;
		this.ngaySinh = ngaySinh;
	}

	public String getTenSV() {
		return tenSV;
	}

	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
	public abstract double diemTB();
	
	public String hocLuc() {
		if(diemTB() < 5) {
			return "Yếu";
		} else if(diemTB() >= 5 && diemTB() < 6.5) {
			return "Trung Bình";
		} else if(diemTB() >= 6.5 && diemTB() < 7) {
			return "Khá";
		} else if(diemTB() >= 7 && diemTB() < 9) {
			return "Giỏi";
		} else {
			return "Xuất Sắc";
		}
	}
}
