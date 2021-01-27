package น้มุ;

import java.io.*;

public class no2675 {
	public static void main(String[] args) throws IOException{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(bfr.readLine());
		
		for(int i=0; i<T; i++) {
			String[] str = bfr.readLine().split(" ");
			int R = Integer.parseInt(str[0]);
			String x = str[1];
			for(int j=0; j<x.length(); j++) {
				for(int z = 0; z<R; z++)
					System.out.print(x.charAt(j));
			}
			System.out.println();
		}
	}
}
