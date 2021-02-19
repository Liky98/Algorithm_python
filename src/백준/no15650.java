package ����;

import java.util.Scanner;

public class no15650 {
	static private int N, M;
	static private boolean[] visit;
	static private int[] array;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		M = scan.nextInt();
		
		//�湮ó��
		visit = new boolean[N+1];
		//������ŭ ����� �� ����
		array = new int[M];
		
		dfs(0);
	}

	private static void dfs(int depth) {
		
		//���� ������ ���
		if (M == depth) {
			for (int i=0; i<M; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
		} 
		else {
			for (int i=1; i<=N; i++) {
				if (!visit[i]) {
					if (depth == 0 || array[depth-1] < i) {
						//d == 0�� �� ��� (1,2 | 1,3 | 1,4)
						//���� arr[]���Ұ� ���� i���� ���� ��
						
						visit[i] = true; //�湮 ó��
						array[depth] = i; //���� ���
						
						dfs(depth + 1); //���
						
						//���󺹱�
						visit[i] = false;
					}
				}
			}
		}
		
	}
}