package day09_method;

import java.util.Scanner;

public class Quiz01Main {
	public static void main(String[] args) {
		Quiz01 q = new Quiz01();
		Scanner sc = new Scanner(System.in);
		int n1=0, n2=0;
		System.out.print("두 수 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		int result = q.big(n1,n2);
		q.output(n1,n2,result);
	}

}
