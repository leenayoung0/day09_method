package day09_method;

public class Ex05Method {
	public int sumFunc(int num1, int num2) {
		int sum = num1 + num2;
		return sum; // 리턴해주는 타입과 처음 지정 타입이 같아야함
	}
	public void test(int n) {//void: return (뒤에오는)값이 없습니다
		if(n==1) {
			System.out.println("if");
		}else {
			System.out.println("else");
			return ;
		}
		System.out.println("test 메소드 종료");
	}
	
	public String test02() {
		int num = 1;
		if(num==1)
			return "안녕하세요";
		else
			return null;
		//return null; // if문이 참이 아니면 반환할게 없어서 에러뜸. return을 꼭 만나게 해줘야한다
	}

}
