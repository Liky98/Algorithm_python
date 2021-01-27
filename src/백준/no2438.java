package น้มุ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class no2438 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(bfr.readLine());
		
		for(int i=1;  i < T+1; i++) {
			for(int j=0; j<i; j++)
				bfw.write("*");
			bfw.newLine();
		}
		bfw.flush();
		bfw.close();
		bfr.close();
	}
}
