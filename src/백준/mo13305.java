package ����;

import java.util.Scanner;

public class mo13305 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//�Է°� �Է¹ޱ�
		int T = scan.nextInt();
		long km[] = new long[T-1];
		long city[] = new long[T];
		for(int i=0; i<T-1; i++){
			km[i] = scan.nextLong();
		}			
		
		for(int i=0; i<T; i++)
			city[i] = scan.nextLong();
		
		long price = 0;
		
		for(int i=0; i<T-1; i++) {

			if(city[i] > city[i+1]) { //�����κ��� ����κк��� �����Ѱ�?
				price += km[i]*city[i];//���簡������ �ּҰŸ� �̵�. ������������
			}
			else {//���� ���ð� ������������ �� �����ϴ� ������������ keep
				city[i+1] = city[i];
				price += km[i]*city[i]; //�����������̸� ���ݱ����� ����.
			}
		}
		
		System.out.println(price);
	}

}
