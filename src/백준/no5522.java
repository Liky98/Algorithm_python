package น้มุ;

import java.util.Scanner;

public class no5522 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a[] = new int [5];
		int sum = 0;
		for(int i=0; i<5; i++) {
			a[i] = scan.nextInt();
			sum += a[i];
		}
		System.out.println(sum);
	}

}
