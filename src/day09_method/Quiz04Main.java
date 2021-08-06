package day09_method;

import java.util.Scanner;

public class Quiz04Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Quiz04 q = new Quiz04();
		int num;
		System.out.print("╪Ж ют╥б: ");
		num = sc.nextInt();
		int result = q.prime(num);
		q.ouput(num, result);
		
		
	}

}
