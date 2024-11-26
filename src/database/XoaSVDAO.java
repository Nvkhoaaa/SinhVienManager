package database;

import entity.SinhVien;

public class XoaSVDAO {
	
	public SinhVien xoaSV(String tenSV) {
		return SinhVienDatabase.xoaSV(tenSV);
	}

}
