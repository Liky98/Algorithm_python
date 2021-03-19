package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1463 {

	public static void main(String[] args) throws IOException{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bfr.readLine());

		int dp[] = new int[n+1];
		
		//n이 0이거나 1이면 최소횟수=0임
		dp[0] = dp[1] = 0; 

		//n이 2이상이면 셋중에 가장 작은값.
		for(int i=2; i<=n; i++) {
			dp[i] = dp[i-1]+1;
			if(i%3==0) dp[i] = Math.min(dp[i], dp[i/3]+1);
			if(i%2==0) dp[i] = Math.min(dp[i], dp[i/2]+1);
		}
		System.out.println(dp[n]);
	}
}
