package น้มุ;

import java.util.Scanner;

public class no2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int T = 9;
		int a[] = new int[T];
		for(int i=0; i<T; i++) {
			a[i] = scan.nextInt();
		}
		int max = a[0];
		int number = 1;
		for(int i=0; i<T; i++) {
			if(a[i]>max) {
				max=a[i];
				number = i+1;
			}
		}
		
		System.out.println(max + " " + number);
		scan.close();
		
		
	}

}
