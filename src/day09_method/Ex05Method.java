package day09_method;

public class Ex05Method {
	public int sumFunc(int num1, int num2) {
		int sum = num1 + num2;
		return sum; // �������ִ� Ÿ�԰� ó�� ���� Ÿ���� ���ƾ���
	}
	public void test(int n) {//void: return (�ڿ�����)���� �����ϴ�
		if(n==1) {
			System.out.println("if");
		}else {
			System.out.println("else");
			return ;
		}
		System.out.println("test �޼ҵ� ����");
	}
	
	public String test02() {
		int num = 1;
		if(num==1)
			return "�ȳ��ϼ���";
		else
			return null;
		//return null; // if���� ���� �ƴϸ� ��ȯ�Ұ� ��� ������. return�� �� ������ ������Ѵ�
	}

}
