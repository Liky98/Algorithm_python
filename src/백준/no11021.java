package น้มุ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class no11021 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(bfr.readLine());
		
		for(int i=0;  i < T; i++) {
			String A[] = bfr.readLine().split(" ");
			bfw.write("Case #" + Integer.toString(i+1)+ ": ");
			bfw.write(Integer.toString(Integer.parseInt(A[0])+Integer.parseInt(A[1])));
			bfw.newLine();
			

			
		}
		bfw.flush();
		bfw.close();
		bfr.close();
	}

}
