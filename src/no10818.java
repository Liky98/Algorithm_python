package น้มุ;

import java.util.Scanner;

public class no10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int a[] = new int[T];
		
		for(int i=0; i<T; i++) {
			int b = scan.nextInt();
			a[i] = b;
		}
		int max = a[0];
		int min = a[0];
		
		for(int i=1; i<T; i++) {
			if( a[i] > max)
				max = a[i];
			if(a[i] < min)
				min = a[i];
		}
		
		System.out.print(min + " ");
		System.out.print(max);
	}

}
