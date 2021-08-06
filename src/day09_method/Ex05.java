package day09_method;

public class Ex05 {
	public static void main(String[] args) {
		Ex05Method ex = new Ex05Method();
		int s = ex.sumFunc(10, 20);
		System.out.println("두 합 : "+s);
		ex.test(1);
		ex.test(2);
		
		ex.test02(); // 아무것도 안나옴
		String ss = ex.test02();
		System.out.println(ss);
		System.out.println(ex.test02());
		
	}

}
