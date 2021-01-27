package น้มุ;

import java.util.Scanner;

public class no11653 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		if(N == 1 );
		else if(N==2) System.out.println(2);
		else {
			for(int i=2; i<N; i++) {
				if(N%i == 0) {
					System.out.println(i);
					N = N/i;
					i = 1;
					if(N==1) break;
				}
				if(i == N-1) System.out.println(N);
			}
		}

	}

}
