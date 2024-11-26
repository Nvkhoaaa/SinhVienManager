package database;

import java.util.ArrayList;
import entity.SinhVien;

public class DsSVDAO {
	
    public ArrayList<SinhVien> getAllHD() {
        return SinhVienDatabase.queryAllSV();
    }

    public int getCountHD() {
        return SinhVienDatabase.getCountSV();
    }
}
