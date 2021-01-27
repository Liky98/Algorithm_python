package น้มุ;

import java.util.Scanner;

public class no8393 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int x = n-1; x!=0; x--) {
			n += x;
		}
		System.out.println(n);
		scan.close();

	}
}
