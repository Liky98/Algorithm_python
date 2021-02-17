package 백준;

import java.util.Scanner;

public class no15649 {
 
	public static int[] array; 
	public static boolean[] visit; //방문했는지 확인. default = False
  
	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);
 
		int N = scan.nextInt();
		int M = scan.nextInt();
 
		array = new int[M];
		visit = new boolean[N];
		dfs(N, M, 0);
 
	}
 
	public static void dfs(int N, int M, int depth) {
		if (depth == M) {
			for (int i=0; i< array.length; i++) {
				System.out.print(array[i]+ " ");
			}
			System.out.println();
			return;
		}
 
		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				array[depth] = i + 1;
				dfs(N, M, depth + 1);
				visit[i] = false;
			}
		}
	}
 
}