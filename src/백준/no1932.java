package 백준;

import java.util.Scanner;

public class no1932 {
	static int T;
	static int array[][], dp[][];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		T = scan.nextInt();
		
		//배열값 저장.
		array = new int[T][T];
		for(int i=0; i<T; i++) {
			for(int j=0; j<=i; j++) {
				array[i][j] = scan.nextInt();
			}
		}
		//깊이탐색할배열 생성 
		dp =new int [T][T];
		for(int i=0; i<T; i++)
			dp[T-1][i] = array[T-1][i];
			//맨 아래층 값만 저장
		System.out.println(test(0,0));
	}
	
	static int test(int depth, int index) {
		//마지막 까지 갔으면 return
		if(depth == T-1) return dp[depth][index]; 
		//값이 없으면 하나내려가서 확인
		if(dp[depth][index] == 0) {
			dp[depth][index] = Math.max(test(depth+1, index), test(depth+1, index+1)) + array[depth][index];
		}
		//다되었으면 리턴
		return dp[depth][index];
	}
}
