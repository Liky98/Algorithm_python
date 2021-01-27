package น้มุ;

import java.util.Scanner;

public class no19050 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=0; i<T; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(a+b);
		}
		
		scan.close();
	}
}
