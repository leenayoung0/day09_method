package day09_method;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Ex06Method ex = new Ex06Method();
		ex.display();
		
		System.out.println("--- main 실행 ---");
		Scanner input = new Scanner(System.in);
		int n1, n2;
		System.out.println("두 수 입력");
		n1 = input.nextInt();
		n2 = input.nextInt();
//		int sum = test(n1,n2); // Ex06Method라는 클래스 파일 안에서만 가능
//		printSum(n1,n2,sum);   // 같은 클래스 안에서만 그냥 써도 값을 가져올수있었음
		int sum = ex.test(n1,n2);
		ex.printSum(n1,n2,sum);
	}

}
