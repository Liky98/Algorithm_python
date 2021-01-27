package น้มุ;

import java.util.Scanner;

public class no2775 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int t=0; t<T; t++) {
			int k = scan.nextInt();
			int n = scan.nextInt();
		
			int ary[][] = new int[k+1][n+1];
			for(int i=0; i<=k; i++)  
				ary[i][0] = 1; 
			for(int i=0; i<=n; i++)
				ary[0][i] = i+1;
			
			for(int i=1; i<k+1; i++) {
				for(int j=1; j<n+1; j++) {
					ary[i][j] = ary[i][j-1] + ary[i-1][j];
				}
			}
		System.out.println(ary[k][n-1]);

		}
		scan.close();
	}
}
