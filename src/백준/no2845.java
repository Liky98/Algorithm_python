package น้มุ;

import java.util.Scanner;

public class no2845 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int T = a*b;
		
		for(int i=0; i<5; i++) {
			int x = scan.nextInt();
			System.out.print(x - T + " ");
		}

	}

}
