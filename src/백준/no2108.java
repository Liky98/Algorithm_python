package 백준;

import java.util.Arrays;
import java.util.Scanner;

public class no2108 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int array[] = new int[T];
		for(int i=0; i<T; i++)
			array[i] = scan.nextInt();
		
		Arrays.sort(array);
		
		//산술평균
		double sum = 0;
		for(int i = 0; i<T; i++) 
			sum += array[i];
		System.out.println(Math.round((double)sum/T));//반올림

		//중앙값
		System.out.println(array[T/2]);
		
		//최빈값
		int count[] = new int[T];
		int x= 0;
		count[0]++;
		for(int i = 1; i<T; i++) {
			if(array[i] == array[i-1])
				count[x] ++;
			else {
				x = i;
				count[x]++;
			}
		}
		int max = 0;
		int counting = 0;
		for(int i=0; i<T; i++) {
			if(max< count[i]) {
				max = count[i];
				counting = i;
			}
		}
		int testcount = 0;
		for(int i=0; i<T; i++) {
			if(max == count[i]) testcount++;
			if(testcount ==2) {
				counting = i;
				break;
			}
		}
		
		System.out.println(array[counting]);
		
		//범위
		System.out.println(array[array.length-1] - array[0]);
		
	}

}
//
//int count[] = new int[8001];
//
//for(int i=0; i<T; i++) {
//	count[array[i]+4000]++;
//}
//
//Arrays.sort(count);
//int counting = 1;
//for(int i=1; i<8001; i++) {
//	if(count[count.length-i] == count[count.length-i-1])
//		counting++;
//	else break;
//}
//System.out.println(count.length-counting-4000);
