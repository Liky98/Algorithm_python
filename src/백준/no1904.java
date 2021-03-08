package น้มุ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1904 {

	public static int fac(int num) {
		if(num <1) return 0;
		else return fac(num-1)+num;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bfr.readLine());
		
		if(N==1) {
			System.out.println(1);
			return;
		}

		System.out.println(fac(N-2) + 2);
		
		
	}

}
