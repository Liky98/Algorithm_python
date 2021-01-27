package น้มุ;

import java.io.*;
import java.util.*;
public class no10952 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A =1;
		int B =1;
		
		while(true) {
		StringTokenizer st = new StringTokenizer(bfr.readLine());
			
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());

		bfw.write(Integer.toString(A+B));
		bfw.newLine();
		bfw.flush();
		}
	}
}
