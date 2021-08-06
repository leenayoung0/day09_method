package day09_method;

import java.util.Scanner;

public class Quiz06 {
	public int reverse(int n) {
		int temp=0, result=0;
		while(true) {
			temp = n % 10;
			n = n/ 10;
			result = (result+temp)*10;
			if(n==0) return result/10;
		}
			
		}
	public int inData() {
		Scanner sc = new Scanner(System.in);
		int n=0;
		System.out.print("수 입력 : ");
		n = sc.nextInt();
		return n;
	}
	public void display() {
		int n = inData();
		int result = reverse(n);
		System.out.println(n+"거꾸로 => "+result);
		
	}

}
