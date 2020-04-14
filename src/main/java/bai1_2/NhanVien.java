package bai1_2;


public class Nhanvien {
	    String Ten;
	    int Tuoi;
	    String DiaChi;
	    double TienLuong = 0;
	    int SoGioLam = 0;
	    
	    public String getTen() {
	        return Ten;
	    }
	    public void setTen(String Ten) {
	        this.Ten = Ten;
	    }
	    public int getTuoi() {
	        return Tuoi;
	    }
	    public void setTuoi(int Tuoi) {
	        this.Tuoi = Tuoi;
	    }
	    public String getDiaChi() {
	        return DiaChi;
	    }
	    public void setDiaChi(String DiaChi) {
	        this.DiaChi = DiaChi;
	    }
	    public double getTienLuong() {
	         return TienLuong ;
	    }
	    public void setTienLuong(double TienLuong) {
	        this.TienLuong = TienLuong;
	    }
	    public int getSoGioLam() {
	        return SoGioLam;
	    }
	    public void setSoGioLam(int SoGioLam) {
	        this.SoGioLam = SoGioLam;
	    }
		public Nhanvien(String ten, int tuoi, String diaChi, int soGioLam, double tienLuong) {
	        this.Tuoi = tuoi;
	        this.DiaChi = diaChi;
	        this.SoGioLam = soGioLam;
	        this.TienLuong = tienLuong;
		}
		public String getThongTin() {
	    	return "Nhan Vien{" + "Ten = " + Ten + "Tuoi = " + Tuoi + " Đia chi = " + DiaChi + ", Tien Luong = "
	        + TienLuong + ", Tong so gio lam=" + SoGioLam + "}";
	    }
		 public double tinhThuong(){
		        if(getSoGioLam()<100)
		            return 0;
		        else if (getSoGioLam()>=100 && getSoGioLam()<200)
		            return  (TienLuong*0.1);
		         return  (TienLuong*0.2);
		    }  
	    }


