package ����;

import java.util.Scanner;

public class no1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int old_new = n;
		int count = 0;
		while(true) {
			
			int a = n/10;//�־��� ���� 10���ڸ�
			int b = n%10;//�־��� ���� 1���ڸ�
			
			int c = a+b; //ó�� �־��� ���� ��
			int x = c%10;//ó�� �־��� ���� 1���ڸ�
			
			n = b*10 + x; //���� ������� ��.
			count++;
			if(old_new == n) break;
		}
			System.out.println(count);
			scan.close();
	}

}
