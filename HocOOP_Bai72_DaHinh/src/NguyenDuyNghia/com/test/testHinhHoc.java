package NguyenDuyNghia.com.test;
import NguyenDuyNghia.com.model.*;
public class testHinhHoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhHoc h;
		h=new HinhChuNhat(4, 5);
		System.out.println("Chu vi="+h.tinhChuVi());
		System.out.println("Diện Tích="+h.tinhDienTich());
		System.out.println("--------------");
		h=new HinhVuong(5);
		System.out.println("Chu vi="+h.tinhChuVi());
		System.out.println("Diện Tích="+h.tinhDienTich());
		
		HinhChuNhat hv1=new HinhVuong(5);
		System.out.println("------------");
		System.out.println("Chu vi="+h.tinhChuVi());
		System.out.println("Diện Tích="+h.tinhDienTich());
	}

}
