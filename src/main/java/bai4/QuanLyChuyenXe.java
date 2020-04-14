package bai4;

import java.util.ArrayList;



public class QuanLyChuyenXe {
    ArrayList<Chuyenxe> dscx = new ArrayList<Chuyenxe>();
    
    
    
    public void themChuyenXe(Chuyenxe x1) {
		for(Chuyenxe ns : dscx) {
			if(ns.getSoXe() == x1.getSoXe())
			{
				System.out.println(x1.getSoXe()+"Da la xe cua quan ly");
				return;
			}
		}
		dscx.add(x1);
		System.out.println("Them chuyen xe thanh cong");
	}
    public void hienThiChuyenXe() {
		for(Chuyenxe ns : dscx) {
	         ns.hienThi();		
		}
	}
    public double DoanhThuNoiThanh() {
		return 0;
	}
    public double DoanhThuNgoaiThanh() {
		return 0;
	}
}
