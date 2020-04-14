package bai4;

public class Chuyenxe {
	String MaSoChuyen;
	String HoTen;
	String SoXe;
    double DoanhThu;
	public String getMaSoChuyen() {
		return MaSoChuyen;
	}
	public void setMaSoChuyen(String maSoChuyen) {
		MaSoChuyen = maSoChuyen;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public String getSoXe() {
		return SoXe;
	}
	public void setSoXe(String soXe) {
		SoXe = soXe;
	}
	public double getDoanhThu() {
		return DoanhThu;
	}
	public void setDoanhThu(double doanhThu) {
		DoanhThu = doanhThu;
	}
	public Chuyenxe(String maSoChuyen, String hoTen, String soXe, double doanhThu) {
		super();
		MaSoChuyen = maSoChuyen;
		HoTen = hoTen;
		SoXe = soXe;
		DoanhThu = doanhThu;
	}
		
	public void hienThi() {
		   System.out.println(this.MaSoChuyen + " - "+this.HoTen+" - "+this.SoXe+" - "+this.DoanhThu);	
		}
    
}
