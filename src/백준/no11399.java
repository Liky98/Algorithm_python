package น้มุ;

import java.util.Arrays;
import java.util.Scanner;

public class no11399 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int array[] = new int[N];
		
		for(int i=0; i<N; i++)
			array[i] = scan.nextInt();
		
		Arrays.sort(array);
		
		int sum=0;
		for(int i=0; i<N; i++) {
			sum += array[i]*(N-i);
		}
		System.out.println(sum);
	}

}
