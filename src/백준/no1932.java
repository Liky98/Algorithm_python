package ����;

import java.util.Scanner;

public class no1932 {
	static int T;
	static int array[][], dp[][];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		T = scan.nextInt();
		
		//�迭�� ����.
		array = new int[T][T];
		for(int i=0; i<T; i++) {
			for(int j=0; j<=i; j++) {
				array[i][j] = scan.nextInt();
			}
		}
		//����Ž���ҹ迭 ���� 
		dp =new int [T][T];
		for(int i=0; i<T; i++)
			dp[T-1][i] = array[T-1][i];
			//�� �Ʒ��� ���� ����
		System.out.println(test(0,0));
	}
	
	static int test(int depth, int index) {
		//������ ���� ������ return
		if(depth == T-1) return dp[depth][index]; 
		//���� ������ �ϳ��������� Ȯ��
		if(dp[depth][index] == 0) {
			dp[depth][index] = Math.max(test(depth+1, index), test(depth+1, index+1)) + array[depth][index];
		}
		//�ٵǾ����� ����
		return dp[depth][index];
	}
}
