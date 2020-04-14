package bai4;

public class Main {
    public static void main(String[] args) {
		QuanLyChuyenXe ql = new QuanLyChuyenXe();
		XeNgoaiThanh x1 = new XeNgoaiThanh("A1", "Quy", "AB111", 30000, 4, "XuanPhuong");
		XeNgoaiThanh x2 = new XeNgoaiThanh("A2", "Phu", "AB112", 20000, 3, "XuanPhuong");
		XeNgoaiThanh x3 = new XeNgoaiThanh("A3", "tho", "AB113", 10000, 2, "XuanPhuong");
		XeNoiThanh xe1 = new XeNoiThanh("A4", "Bao", "AB114", 40000, 5, 6);
		XeNoiThanh xe2 = new XeNoiThanh("A4", "Bao", "AB114", 300000, 2, 4);
		XeNoiThanh xe3 = new XeNoiThanh("A4", "Bao", "AB114", 500000, 3, 5);
		
		ql.themChuyenXe(x1);
		ql.themChuyenXe(x2);
		ql.themChuyenXe(x3);
		ql.themChuyenXe(xe1);
		ql.themChuyenXe(xe2);
		ql.themChuyenXe(xe3);
		ql.hienThiChuyenXe();
		
		
	}
}
