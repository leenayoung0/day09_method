package day09_method;

import java.util.Scanner;

public class Quiz05Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Quiz05 q = new Quiz05();
		int num;
		System.out.print("╪Ж ют╥б : ");
		num = sc.nextInt();
		int result = q.modulus(num);
		q.output(num, result);
		
		
	}

}
