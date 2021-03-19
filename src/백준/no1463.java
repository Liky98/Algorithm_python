package ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1463 {

	public static void main(String[] args) throws IOException{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bfr.readLine());

		int dp[] = new int[n+1];
		
		//n�� 0�̰ų� 1�̸� �ּ�Ƚ��=0��
		dp[0] = dp[1] = 0; 

		//n�� 2�̻��̸� ���߿� ���� ������.
		for(int i=2; i<=n; i++) {
			dp[i] = dp[i-1]+1;
			if(i%3==0) dp[i] = Math.min(dp[i], dp[i/3]+1);
			if(i%2==0) dp[i] = Math.min(dp[i], dp[i/2]+1);
		}
		System.out.println(dp[n]);
	}
}
