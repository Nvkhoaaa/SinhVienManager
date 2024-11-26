package database;

import entity.SinhVien;

public class TimSVDAO {

	
	public SinhVien timSV(String tenSV) {
		return SinhVienDatabase.timSVTheoTen(tenSV);
	}
}
