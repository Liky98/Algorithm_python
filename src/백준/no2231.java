package น้มุ;

import java.util.Scanner;

public class no2231 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		int min = N;
		for(int i = N-1; i>0; i--) {
			int test = i;
			int sum = 0;
			while(test >0) {
				sum = sum + test%10;
				test = test/10;
			}
			if(sum + i == N && i < min)
				min = i;
		}
		
		if( min == N) System.out.println(0);
		else System.out.println(min);
	}

}
