package ����;

import java.util.Scanner;
//�����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�.
//�ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
//���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
//�������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class no1546 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int testCount = scan.nextInt();//���躻 ���� ����
		double a[] = new double[testCount];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		
		double M = a[0];
		for(int i=1; i<a.length; i++) {
			if(M < a[i])
				M = a[i];
		}
		
		double sum =0;
		for(int i=0; i<a.length; i++) {
			a[i] = a[i]/M*100;
			sum += a[i];
		}
		
		System.out.println(sum/testCount);
		scan.close();
	}

}
