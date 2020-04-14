package bai4;

public class XeNoiThanh extends Chuyenxe {
	    int Sotuyen;
	    double SoKmDiDuoc;
		public XeNoiThanh(String maSoChuyen, String hoTen, String soXe, double doanhThu, int sotuyen,
				double soKmDiDuoc) {
			super(maSoChuyen, hoTen, soXe, doanhThu);
			Sotuyen = sotuyen;
			SoKmDiDuoc = soKmDiDuoc;
		}
		public int getSotuyen() {
			return Sotuyen;
		}
		public void setSotuyen(int sotuyen) {
			Sotuyen = sotuyen;
		}
		public double getSoKmDiDuoc() {
			return SoKmDiDuoc;
		}
		public void setSoKmDiDuoc(double soKmDiDuoc) {
			SoKmDiDuoc = soKmDiDuoc;
		}
		
}
