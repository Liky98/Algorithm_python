package น้มุ;

import java.io.*;
public class no1712 {

	public static void main(String[] args) throws IOException{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
		String x = bfr.readLine();
		String[] a = x.split(" ");
		long A = Long.parseLong(a[0]);
		long B = Long.parseLong(a[1]);
		long C = Long.parseLong(a[2]); 

		int count = 1;
		while(true) {
			if(B>=C) {
				bfw.write("-1");
				bfw.flush();
				break;}
			if(A + B*count >= C*count) {
				count++;
				continue;
			}
			if(A + B*count < C*count) {
				bfw.write(String.valueOf(count));
				bfw.flush();
				break;
			}
		}
		
		
		bfr.close();
	}
}
