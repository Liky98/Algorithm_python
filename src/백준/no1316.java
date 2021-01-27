package 백준;

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
			
			for(int j=0; j<a[i].length(); j++) { //입력받은 문장 배열로 쪼갠 x[]
				x[j] = a[i].charAt(j);
			}
			
			for(int z = 1; z< x.length; z++) {
				if(x[z] != x[z-1]) { //만약 바로 직전의 값과 다르면
					for(int search = 0; search< z-1; search++) {
						if(x[z] == x[search]) // 이전에 한번이라도 나온 값이면 false로 바꿈.
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
