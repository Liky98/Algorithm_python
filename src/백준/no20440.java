package 백준;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class no20440 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int a[][] = new int[T][2];
		//데이터 입력받기
		for(int i=0; i<T; i++) {
			a[i][0] = scan.nextInt();
			a[i][1] = scan.nextInt();
		}
//		//2차원배열 오름차순 정렬
//		Arrays.sort(a, new Comparator<int[]>() {
//			public int compare(int []x, int []y) {
//				if(x[0]==y[0])
//					return x[1] - y[1];
//				else
//					return x[0] - y[0];
//			}
//		});
		//시간대별 카운트
		BigInteger max = new BigInteger("0") ;
		int start = 0, end=0;
		
		BigInteger c[] = new BigInteger[2100000000];
		//int time[] = new int[c];
		for(int i=0; i<T; i++) {
			for(int j=a[i][0]; j<a[i][1]; j++) {
				c[j]=c[j].add(BigInteger("1"));
				if(max == c[j] && c[j-1] == max)
					end = j;
				if(max.intValue() < c[j].intValue()) {
					max = c[j];
					start = j;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(start + " " + (end+1));
		
	}

	private static BigInteger BigInteger(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
