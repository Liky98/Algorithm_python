package ����;

import java.util.Scanner;

public class no1316 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = 0; 
		String a[] = new String[scan.nextInt()];
		
		for(int i=0; i<a.length; i++) {
			a[i] = scan.next();
		}
		
		
		for(int i=0; i<a.length; i++) {
			char x[] = new char[a[i].length()];
			boolean pf = true;
			
			for(int j=0; j<a[i].length(); j++) { //�Է¹��� ���� �迭�� �ɰ� x[]
				x[j] = a[i].charAt(j);
			}
			
			for(int z = 1; z< x.length; z++) {
				if(x[z] != x[z-1]) { //���� �ٷ� ������ ���� �ٸ���
					for(int search = 0; search< z-1; search++) {
						if(x[z] == x[search]) // ������ �ѹ��̶� ���� ���̸� false�� �ٲ�.
							pf = false;
					}
				}
			}
			if(pf == true) count++;
		}
		
		System.out.println(count);
		scan.close();
//		}
//		
//		char x[i] = new char [a[i].length()];
//		for(int i=0; i<T; i++) {
//			x[i] = a[i].charAt(i);
//		}
//		
//		for(int i = 0; i<a.length; i++) {
//				if(x[i] == a[j]);
//					
//			}
		
	}

}
