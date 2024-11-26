package ui;

import database.SinhVienDatabase;

public class SinhVienApp {

	public static void main(String[] args) {
		SinhVienDatabase.initDatabase();
		SinhVienMenuConsoleUi menu = new SinhVienMenuConsoleUi();
		menu.controlLoop();
	}

}
