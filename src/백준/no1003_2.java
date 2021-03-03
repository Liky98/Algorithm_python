package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1003_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bfr.readLine());
		for(int i=0; i<T; i++) {
			int num = Integer.parseInt(bfr.readLine());
			int zero = 1;
			int one = 0;
			int temp;
			for(int j=0; j<num; j++) {
				temp = one;
				one = zero + one;
				zero = temp;
			}
			System.out.println(zero + " " + one);
			//commit 확인용
		}
	}

}
