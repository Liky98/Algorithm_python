package 백준;

import java.io.*;
import java.util.StringTokenizer;

public class no10250 {

	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
	
		int T = Integer.parseInt(bfr.readLine()); //test 케이스
	
		for(int i = 0; i<T; i++) {
			StringTokenizer stz = new StringTokenizer(bfr.readLine(), " ");
			int H = Integer.parseInt(stz.nextToken());//높이
			 Integer.parseInt(stz.nextToken());//길이
			int N = Integer.parseInt(stz.nextToken()); //사람수
			
			if(N % H == 0) {
				System.out.println(H*100+N/H);
				
			}
			else {
				System.out.println((N%H)*100 + N/H + 1);
			}
		}

	}

}
