package น้มุ;

import java.util.Scanner;

public class no1978 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int count = 0;
		for(int t = 0; t<T; t++) {
			int n = scan.nextInt();
			if(n==1) continue;
			else if(n==2) count++;
			else {
				for(int i=2; i<n; i++) {
					if(n%i == 0) break;
					if(i == n-1) count++;
				}	
			}
		}
		System.out.println(count);
		scan.close();
		
	}

}
