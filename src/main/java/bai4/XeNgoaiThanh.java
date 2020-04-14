package bai4;

public class XeNgoaiThanh extends Chuyenxe {
	int SoNgayDi;
    String Noiden;
    
	
	public int getSoNgayDi() {
		return SoNgayDi;
	}
	public void setSoNgayDi(int soNgayDi) {
		SoNgayDi = soNgayDi;
	}
	
	public String getNoiden() {
		return Noiden;
	}
	public void setNoiden(String noiden) {
		Noiden = noiden;
	}
	public XeNgoaiThanh(String maSoChuyen, String hoTen, String soXe, double doanhThu, int soNgayDi, String noiDen) {
		super(maSoChuyen, hoTen, soXe, doanhThu);
		SoNgayDi = soNgayDi;
		Noiden = noiDen;
	}
	
}
