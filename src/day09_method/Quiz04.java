package day09_method;

import java.util.ArrayList;

public class Quiz04 {
	public int prime(int n) {
		ArrayList arr = new ArrayList();
		for(int i = 1; i<=n; i++) {
			if(n%i==0) arr.add(i);
		}
		return arr.size();
	}
	public void ouput(int n, int re) {
		if(re==2) {
			System.out.println(n+"�� �Ҽ��Դϴ�");
		}
		else System.out.println(n+"�� �Ҽ��� �ƴմϴ�");
	}
	

}
