package น้มุ;

import java.util.Scanner;

public class no2893_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		int three = 0;
		while (true) {
			if (n % 5 == 0) {
				System.out.println((n / 5) + three);
				break;
				} 
			else if (n <= 0) {
				System.out.println(-1);
				break;
				} 
			else {
				n = n - 3;
				three++;
				}
		}
	}

}