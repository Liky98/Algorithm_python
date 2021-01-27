package น้มุ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class no2742 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(bfr.readLine());
		
		for(int i=T;  i > 0; i--) {
			bfw.write(Integer.toString(i));
			bfw.newLine();;
		}
		bfw.flush();
		bfw.close();
		bfr.close();
	}

}
