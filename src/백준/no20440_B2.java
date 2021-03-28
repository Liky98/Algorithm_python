package 백준;

import java.util.Arrays;
import java.util.Scanner;
public class no20440_B2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] array = new int[n][2];
		//입력값받기
		for(int i = 0; i < n; i++) {
			array[i][0] = scan.nextInt();
			array[i][1] = scan.nextInt();
		}
		int min = -1;
		Arrays.sort(array, (a,b) -> a[1] == b[1]? a[0] - b[0] : a[1] - b[1]);
		
		int K = array[array.length-1][1];
		int test[] = new int[K];
		int start = 0, end=0, max=0;
		
		for(int i=0; i<n; i++) {
			for(int j=array[i][0]; j<array[i][1]; j++) {
				test[j] +=1;
				if(max == test[j] && test[j-1] == max)
					end = j;
				if(max < test[j]) {
					max = test[j];
					start = j;
				}
			}
		}
		System.out.println(max);
		System.out.println(start + " " + (end+1));

	}
}