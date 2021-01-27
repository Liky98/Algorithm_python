package น้มุ;

import java.util.Scanner;

public class no1712_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long A = scan.nextInt();
		long B = scan.nextInt();
		long C = scan.nextInt();
		scan.close();

		
		if(B>=C) System.out.println(-1); 
		else System.out.println(A/(C-B)+1);
	}
}
