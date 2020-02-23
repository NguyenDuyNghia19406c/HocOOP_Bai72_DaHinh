package NguyenDuyNghia.com.test;
import NguyenDuyNghia.com.model.*;
public class testIDoable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDoable x;
		x=new NhanVien();
		x.doSomething();
		x=new SinhVien();
		x.doSomething();
	}

}
