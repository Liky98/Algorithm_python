package น้มุ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1904 {
	static int[] array = new int [1000001];
	
//	public static int fac(int num) {
//		if(array[num] != (0|1|2)) array[num] = (fac(num-1)+ fac(num-2))%15746;
//		return array[num];
//	}

	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bfr.readLine());
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		for(int i=3; i<=N; i++) {
			array[i] = array[i-1] + array[i-2];
			array[i] %= 15746;
				
		}
		System.out.println(array[N-1]);
		
	}

}
