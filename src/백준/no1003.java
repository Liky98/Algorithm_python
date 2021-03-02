package น้มุ;

import java.io.BufferedReader;
import java.io.*;

public class no1003 {
	static int count_one;
	static int count_zero;
	static int fibonacci(int num) {
		
		if(num==0) {
			count_zero += 1;;
			return 0;
		}
		else if (num==1) {
			count_one +=1;;
			return 1;
		}
		else return fibonacci(num-1) + fibonacci(num-2);
	}

	public static void main(String[] args) throws IOException{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bfr.readLine());
		for(int i=0; i<T; i++) {
			count_one = 0;
			count_zero = 0;
			fibonacci(Integer.parseInt(bfr.readLine()));
			System.out.print(count_zero + " " + count_one);
		}
		
	}

}
