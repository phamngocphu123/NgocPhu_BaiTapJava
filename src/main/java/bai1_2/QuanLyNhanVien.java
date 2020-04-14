package bai1_2;

import java.util.ArrayList;

public class QuanLyNhanVien implements IQuanLy {

	private final ArrayList<Nhanvien> dsNhanvien = new ArrayList<>();

        @Override
	public void them(Nhanvien nv1) {
            dsNhanvien.stream().map((nv) -> {
                dsNhanvien.add(nv);
                return nv;
            }).forEachOrdered((_item) -> {
                System.out.println("Them nhan su thanh cong");
            });
		
	}

	@Override
	public void inDS() {
            dsNhanvien.forEach((nv) -> {
                nv.getThongTin();
            });
	}

}
