package น้มุ;

import java.util.Scanner;

public class no2750 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int a[] = new int [T];
		for(int i =0 ; i<T; i++) 
			a[i] = scan.nextInt();
		int temp = 0;
		for(int i = 0; i<T; i++) {
			for(int j=0; j<T; j++) {
				if(a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i=0; i<T; i++)
			System.out.println(a[i]);
	
	}

}
