package ����;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class no15552 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(bfr.readLine());
		
		for(int i=0;  i < T; i++) {
			String A[] = bfr.readLine().split(" ");
			bfw.write(Integer.toString(Integer.parseInt(A[0])+Integer.parseInt(A[1])) + "\n");

			
		}
		bfw.flush();
		bfw.close();
	}

}
