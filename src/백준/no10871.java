////���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù° �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000)
//
//��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. �־����� ������ ��� 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.
//
//���
//X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.
package ����;

import java.util.Scanner;

public class no10871 {
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int X = scanner.nextInt();
		int C[] = new int [A];
		for(int i=0; i<A; i++) {
			int N = scanner.nextInt();
			if(N<X) {
				C[i] = N;
			}
		}
		for(int i=0; i<A; i++)
			if(C[i] != 0)
				System.out.print(C[i] + " ");
	}
}
