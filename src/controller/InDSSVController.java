package controller;

import java.util.ArrayList;

import database.DsSVDAO;
import entity.SinhVien;
import ui.DsSVOutPutUi;

public class InDSSVController {
	private DsSVDAO dsSVDAO;
    private DsSVOutPutUi dsSVOut;

    public InDSSVController() {
        dsSVDAO = new DsSVDAO();
        dsSVOut = new DsSVOutPutUi();
    }

    public void getDSSV() {
        ArrayList<SinhVien> listSV = dsSVDAO.getAllHD();
        dsSVOut.inDSSV(listSV);
    }
}
