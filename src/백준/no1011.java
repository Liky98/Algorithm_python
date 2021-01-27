package น้มุ;

import java.util.Scanner;

public class no1011 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=0; i<T; i++) {
			long X = scan.nextLong();
			long Y = scan.nextLong();
			
			long count = 1;
			long distance = 0;
			
			while(Y-X > distance) {
				count++;
				distance += count/2;
			}
			System.out.println(count -1);
		}
		scan.close();
	}

}
