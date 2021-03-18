package น้มุ;

import java.util.Scanner;

public class no1149 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int array[][] = new int[T][3];
		int dp[][] = new int[T][3];
		
		for(int i=0; i<T; i++) {
			for(int j=0; j<3; j++) {
				array[i][j] = scan.nextInt();
			}
		}
		
		dp[0][0] = array[0][0];
		dp[0][1] = array[0][1];
		dp[0][2] = array[0][2];
		
		for(int i=1; i<T; i++) {
			dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + array[i][0];
			dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + array[i][1];
			dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + array[i][2];
		}
		
		System.out.println(Math.min(Math.min(dp[T-1][0],dp[T-1][1]),dp[T-1][2]));
	}

}
