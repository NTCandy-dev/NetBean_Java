package lab04;

public class Sanpham {
	public static void main(String[] args) {
		Product test = new Product();

		Product pr1 = test.nhapthongtin("Khoai", 200, 0.1);
		test.xuatthongtin(pr1);
		System.out.println("Thue = " + test.gettaxPrice(pr1.getPrice(), pr1.getTax()));
		;
	}
}
