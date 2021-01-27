package น้มุ;

import java.util.Scanner;

public class no2292 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		long T = scan.nextLong(); scan.close();
		int x = 1; int count = 1;
		
		while(true) {
			if(T==x) break;
			else if( x+1 <= T && T <= x + 6*count ) {
				count++;
				break;
			}
			else {
				x += 6*count;
				count++;
			}
		}
		System.out.println(count);
	}
}
