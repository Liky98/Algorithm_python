package น้มุ;

import java.util.Scanner;

public class no5622 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String T = scan.next();
		scan.close();
		
		char a[] = new char[T.length()];
		int sum =0;
		for(int i=0; i< T.length(); i++) {
			a[i] = T.charAt(i);
			if(a[i] >='A' && a[i]<='C') sum += 2;
			else if(a[i] >='D' && a[i]<='F') sum += 3;
			else if(a[i] >='G' && a[i]<='I') sum += 4;
			else if(a[i] >='J' && a[i]<='L') sum += 5;
			else if(a[i] >='M' && a[i]<='O') sum += 6;
			else if(a[i] >='P' && a[i]<='S') sum += 7;
			else if(a[i] >='T' && a[i]<='V') sum += 8;
			else if(a[i] >='W' && a[i]<='Z') sum += 9;
			else sum += 0;	
		}
		System.out.println(sum + T.length());
		
	}

}
