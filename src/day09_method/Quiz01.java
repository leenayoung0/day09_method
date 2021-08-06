package day09_method;

public class Quiz01 {
	public int big(int num1, int num2) {
		if (num1>num2) return  num1;
		else return num2;
		
	}
	public void output(int num1, int num2, int re) {
		System.out.println(num1+"과 "+num2+"중 큰수 : "+re);
	}
	

}
