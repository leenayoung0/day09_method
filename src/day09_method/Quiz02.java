package day09_method;

import java.util.Scanner;

public class Quiz02 { //���� Ǫ��
	public void print() {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("�� �Է�");
		num = input.nextInt();
		//String s = op(num);
		//���(s);
		int result = op(num);
		���(result);
	}
	public void ���(int r) {
		if(r == 0) {
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}
	}
	public int op(int num) {
		if(num%2 == 0) {
			//System.out.println("¦��");
			//return "¦��";
			return 0;
		}else {
			//System.out.println("Ȧ��");
			//return "Ȧ��";
			return 1;
		}
	}
	public void ���(String result) {
		System.out.println(result);
	}

}
