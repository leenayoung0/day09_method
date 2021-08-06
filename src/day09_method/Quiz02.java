package day09_method;

import java.util.Scanner;

public class Quiz02 { //½ÜÀÌ Çª½É
	public void print() {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("¼ö ÀÔ·Â");
		num = input.nextInt();
		//String s = op(num);
		//Ãâ·Â(s);
		int result = op(num);
		Ãâ·Â(result);
	}
	public void Ãâ·Â(int r) {
		if(r == 0) {
			System.out.println("Â¦¼ö");
		}else {
			System.out.println("È¦¼ö");
		}
	}
	public int op(int num) {
		if(num%2 == 0) {
			//System.out.println("Â¦¼ö");
			//return "Â¦¼ö";
			return 0;
		}else {
			//System.out.println("È¦¼ö");
			//return "È¦¼ö";
			return 1;
		}
	}
	public void Ãâ·Â(String result) {
		System.out.println(result);
	}

}
