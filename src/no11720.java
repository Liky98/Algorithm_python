package ����;

import java.util.Scanner;

public class no11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a[] = new int[scan.nextInt()];
		int sum = 0;
		String x = scan.next();
		for(int i=0; i<a.length; i++) {
			a[i] = x.charAt(i) -'0'; //charAt�� �ƽ�Ű�ڵ尪�� ��ȯ�ϱ⿡ '0'(48)�� �������.
			sum += a[i];
		}
		
		System.out.println(sum);
	}

}
