package ����;
//�� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. 
//���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 
//�� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�.
//�� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;

public class no3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number =10;
		int a[] = new int[number];
		int b[] = new int[number];
		int count = 10;
		for(int i= 0; i<number; i++) {		
			a[i] = scan.nextInt();
			b[i] = a[i]%42;
			for(int j=0; j<i; j++) {
				if(b[i] == b[j]) {
					count--;
					break;
				}
			}
		}
		System.out.println(count);

		scan.close();
		}
}
