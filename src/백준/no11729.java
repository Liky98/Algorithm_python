package ����;

import java.util.Scanner;

public class no11729 {
	static StringBuilder sb = new StringBuilder();
//n = ��������
//	a = ù��°����
//	b = �ι�°����
//	c = ����° ����
			
	public static void f(int n, int a, int b, int c) {
		if(n==1) {
			sb.append(a + " " + c + '\n');
			return;
		}
		f(n-1, a, c, b); // n-1�� b���� �־�� �ϰ� �߰��� c��.
		sb.append(a + " " + c + '\n'); // n�� ȥ�� ù��° ���뿡 ������ ����° ����� �ű�.
		f(n-1, b, a, c); //�ι�° ���뿡 �ִ� �͵��� c�� �̵�.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		int count =0;
		for(int i = 0; i< N; i++) {
			count = count* 2 +1;
		}
		System.out.println(count);
		f(N, 1, 2, 3);
		System.out.println(sb);
	}

}
