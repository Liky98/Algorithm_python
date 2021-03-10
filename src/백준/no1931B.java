package น้มุ;

import java.util.Arrays;
import java.util.Scanner;
public class no1931B {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] times = new int[n][2]; // 0 : start 1 : finish
		
		int min = -1;
		for(int i = 0; i < n; i++) {
			times[i][0] = scan.nextInt();
			times[i][1] = scan.nextInt();
		}
		
		Arrays.sort(times, (a,b) -> a[1] == b[1]? a[0] - b[0] : a[1] - b[1]);
		int cnt = 0; 
		for(int i = 0; i < n; i++) {
			if(times[i][0] >= min) {
				min = times[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);
		for(int i=0; i<n; i++) {
			System.out.print(times[i][0]+ " ");
			System.out.println(times[i][1]);
		}
	}
}