package 백준;

import java.util.Scanner;

public class no15650 {
	static private int N, M;
	static private boolean[] visit;
	static private int[] array;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		M = scan.nextInt();
		
		//방문처리
		visit = new boolean[N+1];
		//개수만큼 출력할 값 담음
		array = new int[M];
		
		dfs(0);
	}

	private static void dfs(int depth) {
		
		//개수 같으면 출력
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
						//d == 0은 다 출력 (1,2 | 1,3 | 1,4)
						//이전 arr[]원소가 현재 i보다 작을 때
						
						visit[i] = true; //방문 처리
						array[depth] = i; //원소 담기
						
						dfs(depth + 1); //재귀
						
						//원상복구
						visit[i] = false;
					}
				}
			}
		}
		
	}
}