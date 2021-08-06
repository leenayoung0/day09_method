package day09_method;

public class Quiz03 {
	public int threemult(int n) {
		if(n%3==0) return 0;
		else return 1;
		
	}
	public void output(int n1, int re) {
		if(re==0) {
			System.out.println(n1+"은 3의 배수 입니다");
		}
		else System.out.println(n1+"은 3의 배수가 아닙니다");
	}

}
