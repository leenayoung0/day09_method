package day09_method;

import java.util.Scanner;

public class Quiz03Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Quiz03 q = new Quiz03();
		int num;
		System.out.println("╪Ж ют╥б: ");
		num = sc.nextInt();
		int result = q.threemult(num);
		q.output(num, result);
		
	}

}
